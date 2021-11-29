package application.model;

public class Die {
	// the class for the dice 
	private int sides;
	private int top;
	
	public Die() { //sets up the dice
		sides = 6;
		top = 1;
	}
	
	public Die(int sides, int top) {// main constructor
		this.sides = sides;
		this.top = top;
	}

	public int getSides() { //gets the sides for the dice
		return sides;
	}

	public void setSides(int sides) { //set the sides for the dice
		this.sides = sides;
	}

	public int getTop() { //once rolled will get the number thats one the top
		return top;
	}

	public void setTop(int top) {
		if( top > 0 && top <= sides ) { // sets it
			this.top = top;
		}
	}
	
	public void roll() {
		top = 1 + (int)(Math.random() * sides); //the roll function that will assign it a random integer to the top
	}
	
}