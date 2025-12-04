package projekat_pet;

abstract class GameObject {
	private int x, y;
	private Collidable collidable;
	
	@Override
	public String toString() {
		return "GameObject [x=" + this.x + ", y=" + this.y + ", collidable=" + this.collidable + "]";
	}
	
	public abstract String getDisplayName();

	public boolean intersects(GameObject other) {
		return this.collidable.intersects(other.collidable);
	}
	
	public GameObject(int x, int y, Collidable collidable) {
		super();
		this.x = x;
		this.y = y;
		this.collidable = collidable;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Collidable getCollidable() {
		return collidable;
	}
	public void setCollidable(Collidable collidable) {
		this.collidable = collidable;
	}
	

}