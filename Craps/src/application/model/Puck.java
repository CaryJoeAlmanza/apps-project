package application.model;

import javafx.scene.image.ImageView;

//Class for the Puck 

public class Puck {
	boolean isActive;;
	ImageView puckImg;
	
	public Puck(boolean isActive, ImageView puckImg) { //constructor
		this.isActive = isActive;
		this.puckImg = puckImg;
	}
	
	public boolean isActive() { //marks the puck as active
		return isActive;
	}

	public void setActive(boolean isActive) { //sets the puck 
		this.isActive = isActive;
	}

	public ImageView getPuckImg() { //gets the puck image
		return puckImg;
	}

	public void setPuckImg(ImageView puckImg) { //sets the puck image
		this.puckImg = puckImg;
	}
	
}