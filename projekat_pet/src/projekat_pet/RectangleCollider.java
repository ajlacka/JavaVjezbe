package projekat_pet;

class RectangleCollider implements Collidable {
	private int x, y, width, height;

	public boolean intersects(Collidable other) {
		if (other instanceof CircleCollider) {
			return other.intersects(this);
			
		} else if (other instanceof RectangleCollider) {
			RectangleCollider otherRectangle = (RectangleCollider) other;
			
			return this.x < otherRectangle.getX() + otherRectangle.getWidth() &&
					this.x + getWidth() > otherRectangle.x &&
					this.y < otherRectangle.getY() + otherRectangle.getHeight() &&
					this.y + getHeight() > otherRectangle.getY();
		}
			
		return false;
	}
	
	public RectangleCollider(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		setWidth(width);
		setHeight(height);
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Širina pravougaonika mora biti veća od 0.");
		}
		
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height <= 0) {
			throw new IllegalArgumentException("Visina pravougaonika mora biti veća od 0.");
		}
		
		this.height = height;
	}
}