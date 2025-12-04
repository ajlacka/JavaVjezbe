package projekat_pet;

class BossEnemy extends Enemy {

	// Konstruktor
	public BossEnemy(int x, int y, Collidable collidable, String tip, int damage, int health) {
		super(x, y, collidable, tip, damage, health);
	}

	// Boss tostring
	@Override
	public String toString() {
		return super.toString().replace("Enemy", "BossEnemy");
	}

}