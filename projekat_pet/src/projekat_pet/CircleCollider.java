package projekat_pet;

class CircleCollider implements Collidable {
	private int x, y, poluprecnik;

	public boolean intersects(Collidable other) {
		if (other instanceof CircleCollider) {
			CircleCollider otherCircle = (CircleCollider) other;
			
			int deltaX = this.x - otherCircle.getX();
			int deltaY = this.y - otherCircle.getY();
			int deltaSquared = deltaX * deltaX + deltaY * deltaY;
			
			int zbirPoluprecnika = this.poluprecnik + otherCircle.getPoluprecnik();
			
			return deltaSquared <= zbirPoluprecnika * zbirPoluprecnika;
			
		} else if (other instanceof RectangleCollider) {
			RectangleCollider otherRectangle = (RectangleCollider) other;
			
			int closestX = clamp(this.x, otherRectangle.getX(), otherRectangle.getX() + otherRectangle.getWidth());
			int closestY = clamp(this.y, otherRectangle.getY(), otherRectangle.getY() + otherRectangle.getHeight());
			
			int deltaX = this.x - closestX;
			int deltaY = this.y - closestY;
			
			return (deltaX * deltaX + deltaY * deltaY) <= (this.poluprecnik * this.poluprecnik);
		}
		
		return false;
	}
	
	private int clamp(int value, int min, int max) {
		if (value < min) return min;
		if (value > max) return max;
		return value;
	}
	
	public CircleCollider(int x, int y, int poluprecnik) {
		super();
		this.x = x;
		this.y = y;
		setPoluprecnik(poluprecnik);
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

	public int getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(int poluprecnik) {
		if (poluprecnik <= 0) {
			throw new IllegalArgumentException("Poluprečnik mora biti veći od 0.");
		}
		
		this.poluprecnik = poluprecnik;
	}
	// END GETTERS & SETTERS
	
}