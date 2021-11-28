package application.model;

import javafx.scene.image.ImageView;

// the class for the chips

public class Chip {
	String chipID;
	int chipValue;
	ImageView chipImg;
	
	public Chip() {
		
	}
	
	public Chip(String chipID, int chipValue, ImageView chipImg) { // constructor
		this.chipID = chipID;
		this.chipValue = chipValue;
		this.chipImg = chipImg;
	}
	
	public String getChipID() { //gets the chips ID
		return chipID;
	}
	public void setChipID(String chipID) { //sets the chips ID
		this.chipID = chipID;
	}
	public int getChipValue() { //gets the value of the chips
		return chipValue;
	}
	public void setChipValue(int chipValue) { //set the value of the chips
		this.chipValue = chipValue;
	}
	public ImageView getChipImg() { //gets the image for the chips
		return chipImg;
	}
	public void setChipImg(ImageView chipImg) { //sets the image for the chips
		this.chipImg = chipImg;
	}
	
}
