package application.model;

public class Game {
	private Die d1;
	private Die d2;
	private Player player;
	
	public Game() {
		d1 = new Die();
		d2 = new Die();
	}

	public Die getD1() {
		return d1;
	}

	public void setD1(Die d1) {
		this.d1 = d1;
	}

	public Die getD2() {
		return d2;
	}

	public void setD2(Die d2) {
		this.d2 = d2;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void roll() {
		d1.roll();
		d2.roll();
	}
}
