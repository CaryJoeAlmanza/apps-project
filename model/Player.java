package application.model;
 
//class for controlling the amount of money for the player
public class Player {
	int startingCash; 
	int currentCash;
	int endingCash;
	
	public Player(int startingCash, int currentCash, int endingCash) { //constructor
		this.startingCash = startingCash;
		this.currentCash = currentCash;
		this.endingCash = endingCash;
	}

	public int getStartingCash() { //gets the starting amount
		return startingCash;
	}

	public void setStartingCash(int startingCash) { //sets the start amount
		this.startingCash = startingCash;
	}

	public int getCurrentCash() { //gets the current cash throughout the game
		return currentCash;
	}

	public void setCurrentCash(int currentCash) { //sets the current cash
		this.currentCash = currentCash;
	}

	public int getEndingCash() { //gets the ending cash
		return endingCash;
	}

	public void setEndingCash(int endingCash) { //sets the ending cash
		this.endingCash = endingCash;
	}

}
