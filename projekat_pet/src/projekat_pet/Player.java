package projekat_pet;

class Player extends GameObject {
	private String name;
	private int health;
	
	public Player(int x, int y, Collidable collidable, String name, int health) {
		super(x, y, collidable);
		setName(name);
		setHealth(health);
	}
	
	@Override
	public String toString() {
		String colliderInfo = "";
		
		if (this.getCollidable() instanceof RectangleCollider) {
			RectangleCollider recCollider = (RectangleCollider) this.getCollidable();
			colliderInfo = recCollider.getWidth() + "x" + recCollider.getHeight();
		} else if (this.getCollidable() instanceof CircleCollider) {
			CircleCollider cirCollider = (CircleCollider) this.getCollidable();
			colliderInfo = "R=" + cirCollider.getPoluprecnik();
		}
		
		return String.format("Player[%s] @ (%d,%d) %s HP=%d", getName(), getX(), getY(), colliderInfo, getHealth());
	}
	
	public String getDisplayName() {
		return "Ime igrača: " + this.name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Ime igrača ne smije biti prazno.");
		} 
		
		StringBuilder finalName = new StringBuilder("");
		String[] imePrezime = name.trim().split("\\s+");
		
		finalName.append(Character.toUpperCase(imePrezime[0].charAt(0)) + imePrezime[0].substring(1).toLowerCase());
		finalName.append(Character.toUpperCase(imePrezime[1].charAt(0)) + imePrezime[1].substring(1).toLowerCase());
		
		if (finalName.toString().trim().isEmpty()) {
			throw new IllegalArgumentException("Ovo ime nije validno.");
		}
		
		this.name = finalName.toString().trim();
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (0 <= health && health <= 100) {
			this.health = health;
		} else {
			throw new IllegalArgumentException("Health mora biti izmedju 0 i 100 (uključujući).");
		}
	}
	

}