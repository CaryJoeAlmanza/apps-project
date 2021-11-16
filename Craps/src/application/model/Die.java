package application.model;

public class Die {
	private int sides;
	private int top;
	
	public Die() {
		sides = 6;
		top = 1;
	}
	
	public Die(int sides, int top) {
		this.sides = sides;
		this.top = top;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		if( top > 0 && top <= sides ) {
			this.top = top;
		}
	}
	
	public void roll() {
		top = 1 + (int)(Math.random() * sides);
	}
	
}
