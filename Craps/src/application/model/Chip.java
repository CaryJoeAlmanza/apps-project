package application.model;

import javafx.scene.image.ImageView;

public class Chip {
	String chipID;
	int chipValue;
	ImageView chipImg;
	
	public Chip() {
		
	}
	
	public Chip(String chipID, int chipValue, ImageView chipImg) {
		this.chipID = chipID;
		this.chipValue = chipValue;
		this.chipImg = chipImg;
	}
	
	public String getChipID() {
		return chipID;
	}
	public void setChipID(String chipID) {
		this.chipID = chipID;
	}
	public int getChipValue() {
		return chipValue;
	}
	public void setChipValue(int chipValue) {
		this.chipValue = chipValue;
	}
	public ImageView getChipImg() {
		return chipImg;
	}
	public void setChipImg(ImageView chipImg) {
		this.chipImg = chipImg;
	}
	
}
