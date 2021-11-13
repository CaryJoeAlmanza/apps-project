package application.model;

public class Player {
	int startingCash;
	int currentCash;
	int endingCash;
	
	public Player(int startingCash, int currentCash, int endingCash) {
		this.startingCash = startingCash;
		this.currentCash = currentCash;
		this.endingCash = endingCash;
	}

	public int getStartingCash() {
		return startingCash;
	}

	public void setStartingCash(int startingCash) {
		this.startingCash = startingCash;
	}

	public int getCurrentCash() {
		return currentCash;
	}

	public void setCurrentCash(int currentCash) {
		this.currentCash = currentCash;
	}

	public int getEndingCash() {
		return endingCash;
	}

	public void setEndingCash(int endingCash) {
		this.endingCash = endingCash;
	}

}
