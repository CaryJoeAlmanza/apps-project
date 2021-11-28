package application.model;

public class Game {
	//this is the Game class that has the 2 dice and where the player information is held
	private Die d1; //calls the Die class
	private Die d2;
	private Player player; //calls the Player class
	
	public Game() { //constructor
		d1 = new Die();
		d2 = new Die();
	}

	public Die getD1() { //gets the information about die 1
		return d1;
	}

	public void setD1(Die d1) { //then sets the value to die 1
		this.d1 = d1;
	}

	public Die getD2() { //gets the value for die 2
		return d2;
	}

	public void setD2(Die d2) { //then sets the value for die 2
		this.d2 = d2;
	}

	public Player getPlayer() { //get the player information
		return player;
	}

	public void setPlayer(Player player) { //set the player information
		this.player = player;
	}
	
	public void roll() { //rolls the dice 
		d1.roll();
		d2.roll();
	}
}
