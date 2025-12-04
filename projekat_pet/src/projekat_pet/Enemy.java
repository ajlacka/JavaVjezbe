package projekat_pet;

class Enemy extends GameObject implements Attacker {
	private String tip;
	private int damage, health;
	
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
		
		return String.format("Enemy[%s] @ (%d,%d) %s DMG=%d HP=%d", getTip(), getX(), getY(), colliderInfo, getDamage(), getHealth());
	}
	
	@Override
	public String getDisplayName() {
		return getTip();
	}

	public int getEffectiveDamage() {
		return getDamage();
	}
	
	public Enemy(int x, int y, Collidable collidable, String tip, int damage, int health) {
		super(x, y, collidable);
		this.tip = tip;
		setDamage(damage);
		setHealth(health);
	}
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		if (tip == null || tip.trim().isEmpty()) {
			throw new IllegalArgumentException("Enemy tip ne smije biti prazan.");
		} else {
			this.tip = tip;
		}
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if (0 <= damage && damage <= 100) {
			this.damage = damage;
		} else {
			throw new IllegalArgumentException("Enemy damage mora biti izmedju 0 i 100.");
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (0 <= health && health <= 100) {
			this.health = health;
		} else {
			throw new IllegalArgumentException("Enemy health mora biti izmedju 0 i 100.");
		}
	}
}