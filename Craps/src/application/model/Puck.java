package application.model;

import javafx.scene.image.ImageView;

public class Puck {
	boolean isActive;;
	ImageView puckImg;
	
	public Puck(boolean isActive, ImageView puckImg) {
		this.isActive = isActive;
		this.puckImg = puckImg;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public ImageView getPuckImg() {
		return puckImg;
	}

	public void setPuckImg(ImageView puckImg) {
		this.puckImg = puckImg;
	}
	
}
