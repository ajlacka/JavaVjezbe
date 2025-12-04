package projekat_pet;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class Game {
    private Player player;
    private List<Enemy> enemies;
    private List<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }
    
    public List<String> getEventLog() {
        return eventLog;
    }
    
    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy e) {
        if (e == null) throw new IllegalArgumentException("Enemy ne moze biti nista.");
        enemies.add(e);
        eventLog.add("Enemy added: " + e.getTip());
    }

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        if (p == null || e == null) throw new IllegalArgumentException("Player/Enemy ne moze biti nista.");
        
        int dmg = e.getEffectiveDamage();
        int oldHp = p.getHealth();
        int newHp = Math.max(0, oldHp - dmg);
        
        p.setHealth(newHp);
        
        eventLog.add(String.format("HIT: Player od %s za %d -> HP %d -> %d", 
            e.getTip(), dmg, oldHp, newHp));
    }
    
    public List<Enemy> findByType(String query) {
        List<Enemy> results = new ArrayList<>();
        String lowerQuery = query.toLowerCase();
        for (Enemy e : enemies) {
            if (e.getTip().toLowerCase().contains(lowerQuery)) {
                results.add(e);
            }
        }
        return results;
    }

    public List<Enemy> collidingWithPlayer() {
        List<Enemy> collisions = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                collisions.add(e);
            }
        }
        return collisions;
    }
    
    public void resolveCollisions() {
        List<Enemy> colliding = collidingWithPlayer();
        for (Enemy e : colliding) {
            decreaseHealth(player, e);
        }
    }
    
    public static void loadEnemiesFromCSV(String filePath, Game game) {
    	try (BufferedReader citac = new BufferedReader(new FileReader(filePath))) {
    		String linija;
    		
    		while ((linija = citac.readLine()) != null) {
    			String[] djelovi = linija.split(",", -1);
    			
    			if (djelovi.length <= 7 || djelovi[0].trim().equalsIgnoreCase("type")) {
    				continue;
    			}
    			
    			try {
    				String tip = djelovi[0].trim();
    				String klasa = djelovi[1].trim().toLowerCase();
    				int damage = Integer.parseInt(djelovi[2].trim());
    				int health = Integer.parseInt(djelovi[3].trim());
    				int x = Integer.parseInt(djelovi[4].trim());
    				int y = Integer.parseInt(djelovi[5].trim());
    				String oblik = djelovi[6].trim().toLowerCase();
    				
    				Collidable collider = null;
    				
    				if (oblik.equals("rectangle")) {
    					int sirina = Integer.parseInt(djelovi[7].trim());
    					int duzina = Integer.parseInt(djelovi[8].trim());
    					
    					collider = new RectangleCollider(x, y, sirina, duzina);
    				} else if (oblik.equals("circle")) {
    					if (djelovi.length <= 9 ) {
    						throw new IllegalArgumentException("Nema validnog poluprecnika u csv podacima.");
    					}
    					int poluprecnik = Integer.parseInt(djelovi[9].trim());
    					collider = new CircleCollider(x, y, poluprecnik);
    				} else {
    					System.err.println("Oblik nije validan.");
    					continue;
    				}
    				
    				Enemy enemy;
    				if (klasa.equals("boss")) {
    					enemy = new BossEnemy(x, y, collider, tip, damage, health);
    				} else {
    					enemy = new MeleeEnemy(x, y, collider, tip, damage, health);
    				}
    				
    				game.addEnemy(enemy);
    				
    			} catch (NumberFormatException e) {
    				System.err.println("Podatak nije validan, preskoceno.");
    			} catch (IllegalArgumentException e) {
    				System.err.println("GRESKA: " + e.getMessage());
    			}
    		}
    	} catch (IOException e) {
    		System.err.println("Greska pri citanju fajla: " + e.getMessage());
    	}
    }
    
    public static Enemy parseEnemy(String line) {
        try {
            String[] parts = line.split(";");
            if (parts.length < 5) throw new IllegalArgumentException("Loš format string-a.");
            
            String type = parts[0];
            
            String[] coords = parts[1].split(",");
            int x = Integer.parseInt(coords[0].trim());
            int y = Integer.parseInt(coords[1].trim());
            
            String[] dims = parts[2].split("x"); 
            int w = Integer.parseInt(dims[0].trim());
            int h = Integer.parseInt(dims[1].trim());
            RectangleCollider collider = new RectangleCollider(x, y, w, h);
            
            int dmg = Integer.parseInt(parts[3].trim());
            String category = parts[4].trim().toLowerCase();
            
            if (category.equals("boss")) {
                return new BossEnemy(x, y, collider, type, dmg, 100);
            } else {
                return new MeleeEnemy(x, y, collider, type, dmg, 50);
            }
            
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("GRESKA: " + e.getMessage());
        }
    }
    
    public void printLog() {
        System.out.println("\n--- LOG DOGADJAJA ---");
        for (String log : eventLog) {
            System.out.println(log);
        }
    }
}