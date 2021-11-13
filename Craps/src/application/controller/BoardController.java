package application.controller;

import java.io.IOException;

import application.model.Chip;
import application.model.Player;
import application.model.Puck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;

public class BoardController {

    @FXML
    private Label fiveComeLabel;

    @FXML
    private Label ninePlaceLabel;

    @FXML
    private ImageView comeImage;

    @FXML
    private ImageView hardSixImage;

    @FXML
    private Label nineComeLabel;

    @FXML
    private Pane hardPaneSix;

    @FXML
    private ImageView hardEightImage;

    @FXML
    private Pane comePane;

    @FXML
    private ImageView fivePlaceImage;

    @FXML
    private Pane dontComePaneFour;

    @FXML
    private ImageView fiveComePlaceImage;

    @FXML
    private ImageView nineComePlaceImage;

    @FXML
    private Label hardTwelveLabel;

    @FXML
    private ImageView dontPassLineImage;

    @FXML
    private Label tenComeLabel;

    @FXML
    private ImageView passLineImage;

    @FXML
    private Pane placePaneFive;

    @FXML
    private Pane placePaneNine;

    @FXML
    private ImageView chip50;

    @FXML
    private Label sevenLabel;

    @FXML
    private ImageView eightPlaceImage;

    @FXML
    private Label hardFourLabel;

    @FXML
    private ImageView sixComePlaceImage;

    @FXML
    private ImageView hardFourImage;

    @FXML
    private Pane sevenPane;

    @FXML
    private ImageView anyCrapsImage;

    @FXML
    private ImageView chip25;

    @FXML
    private Label fieldLabel;

    @FXML
    private Pane hardPaneEight;

    @FXML
    private Pane placePaneSix;

    @FXML
    private ImageView chip100;

    @FXML
    private Pane dontComePaneEight;

    @FXML
    private Label sixPlaceLabel;

    @FXML
    private Pane dontComePaneNine;

    @FXML
    private Label anyCrapsLabel;

    @FXML
    private Label fivePlaceLabel;

    @FXML
    private Pane dontComePaneFive;

    @FXML
    private Label winLoseLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private ImageView hardThreeImage;

    @FXML
    private ImageView tenComePlaceImage;

    @FXML
    private ImageView tenComeImage;

    @FXML
    private Label hardElevenLabel;

    @FXML
    private Label fourComeLabel;

    @FXML
    private Pane nineComePane;

    @FXML
    private Label comeLabel;

    @FXML
    private Pane placePaneFour;

    @FXML
    private Label hardEightLabel;

    @FXML
    private ImageView hardTwelveImage;

    @FXML
    private Label dontPassLineLabel;

    @FXML
    private Label rollLabel;

    @FXML
    private Pane hardPaneEleven;

    @FXML
    private Pane anyCrapsPane;

    @FXML
    private Pane dontComePaneSix;

    @FXML
    private Pane fourComePane;

    @FXML
    private ImageView fourComeImage;

    @FXML
    private ImageView fieldImage;

    @FXML
    private Label hardThreeLabel;

    @FXML
    private ImageView eightComePlaceImage;

    @FXML
    private ImageView fourPlaceImage;

    @FXML
    private ImageView nineComeImage;

    @FXML
    private ImageView hardTenImage;

    @FXML
    private Label wagerLabel;

    @FXML
    private ImageView chip10;

    @FXML
    private Label eightComeLabel;

    @FXML
    private Pane tenComePane;

    @FXML
    private Label dontComeLabel;

    @FXML
    private Pane hardPaneThree;

    @FXML
    private ImageView hardTwoImage;

    @FXML
    private Label tenPlaceLabel;

    @FXML
    private Pane fiveComePane;

    @FXML
    private Pane hardPaneTwo;

    @FXML
    private ImageView hardElevenImage;

    @FXML
    private ImageView sixPlaceImage;

    @FXML
    private ImageView fiveComeImage;

    @FXML
    private ImageView ninePlaceImage;

    @FXML
    private Pane passLinePane2;

    @FXML
    private Pane passLinePane1;

    @FXML
    private Pane placePaneEight;

    @FXML
    private ImageView dontComeImage;

    @FXML
    private ImageView sevenImage;

    @FXML
    private ImageView chip1;

    @FXML
    private Button rollButton;

    @FXML
    private ImageView chip5;

    @FXML
    private Pane hardPaneTen;

    @FXML
    private Pane hardPaneTwelve;

    @FXML
    private Label fourComePlaceLabel;

    @FXML
    private Pane eightComePane;

    @FXML
    private ImageView sixComeImage;

    @FXML
    private Label sixComeLabel;

    @FXML
    private ImageView fourComePlaceImage;

    @FXML
    private Label hardTwoLabel;

    @FXML
    private Label passLineLabel;

    @FXML
    private ImageView eightComeImage;

    @FXML
    private Pane fieldPane;

    @FXML
    private Pane dontComePaneTen;
    
    @FXML
    private Pane placePaneTen;

    @FXML
    private ImageView tenPlaceImage;

    @FXML
    private Pane sixComePane;

    @FXML
    private Label hardSixLabel;

    @FXML
    private Label fourPlaceLabel;

    @FXML
    private Label hardTenLabel;

    @FXML
    private Pane dontPassLinePane2;
    
    @FXML
    private Pane dontPassLinePane1;

    @FXML
    private ImageView onOffButton;

    @FXML
    private Label eightPlaceLabel;

    @FXML
    private ImageView chip$;

    @FXML
    private Pane hardPaneFour;
    
    @FXML
    private ImageView offPuck;
    
    @FXML
    private ImageView onPuckFour;
    
    @FXML
    private ImageView onPuckFive;
    
    @FXML
    private ImageView onPuckSix;
    
    @FXML
    private ImageView onPuckEight;
    
    @FXML
    private ImageView onPuckNine;
    
    @FXML
    private ImageView onPuckTen;
    
    @FXML
    private ImageView puck1;
    
    @FXML
    private ImageView puck2;
    
    @FXML
    private Label invalidBetLabel;
    
    @FXML
    private Pane dontComePane;

    @FXML
    void rollDice(ActionEvent event) {

    }
    
//    Chip dollar1 = new Chip("1", 1, chip1);
//    Chip dollar5 = new Chip("5", 5, chip5);
//    Chip dollar10 = new Chip("10", 10, chip10);
//    Chip dollar25 = new Chip("25", 25, chip25);
//    Chip dollar50 = new Chip("50", 50, chip50);
//    Chip dollar100 = new Chip("100", 100, chip100);
    Chip totalWagerPassLine = new Chip("$", 0, chip$);
    Chip totalWagerDontPassLine = new Chip("$", 0, chip$);
    Chip totalWagerField = new Chip("$", 0, chip$);
    Chip totalWagerCome = new Chip("$", 0, chip$);
    Chip totalWagerDontCome = new Chip("$", 0, chip$);
    Chip totalWagerFourPlace = new Chip("$", 0, chip$);
    Chip totalWagerFourCome = new Chip("$", 0, chip$);
    Chip totalWagerFivePlace = new Chip("$", 0, chip$);
    Chip totalWagerFiveCome = new Chip("$", 0, chip$);
    Chip totalWagerSixPlace = new Chip("$", 0, chip$);
    Chip totalWagerSixCome = new Chip("$", 0, chip$);
    Chip totalWagerEightPlace = new Chip("$", 0, chip$);
    Chip totalWagerEightCome = new Chip("$", 0, chip$);
    Chip totalWagerNinePlace = new Chip("$", 0, chip$);
    Chip totalWagerNineCome = new Chip("$", 0, chip$);
    Chip totalWagerTenPlace= new Chip("$", 0, chip$);
    Chip totalWagerTenCome = new Chip("$", 0, chip$);
    Chip totalWagerSeven = new Chip("$", 0, chip$);
    Chip totalWagerAnyCraps = new Chip("$", 0, chip$);
    Chip totalWagerHardTwo = new Chip("$", 0, chip$);
    Chip totalWagerHardTwelve = new Chip("$", 0, chip$);
    Chip totalWagerHardFour = new Chip("$", 0, chip$);
    Chip totalWagerHardSix = new Chip("$", 0, chip$);
    Chip totalWagerHardEight = new Chip("$", 0, chip$);
    Chip totalWagerHardTen = new Chip("$", 0, chip$);
    Chip totalWagerHardThree = new Chip("$", 0, chip$);
    Chip totalWagerHardEleven = new Chip("$", 0, chip$);
    Chip totalBets = new Chip("$", 0, chip$);
    Chip sourceChip = new Chip();
    Puck off = new Puck(true, puck1);
    Puck on = new Puck(false, puck2);
    Player player = new Player(0, 0, 0);
    /* need to add dont come number bets */
    
    public void initialize(int bankRoll) {
//    	dollar1.setChipImg(chip1);
//    	dollar5.setChipImg(chip5);
//    	dollar10.setChipImg(chip10);
//    	dollar25.setChipImg(chip25);
//    	dollar50.setChipImg(chip50);
//    	dollar100.setChipImg(chip100);
    	player.setStartingCash(bankRoll);
    	player.setCurrentCash(bankRoll);
    	balanceLabel.setText("" + String.valueOf(bankRoll));
    	wagerLabel.setText("0");
    	totalWagerPassLine.setChipImg(chip$);
    	totalWagerDontPassLine.setChipImg(chip$);
        totalWagerField.setChipImg(chip$);
        totalWagerCome.setChipImg(chip$);
        totalWagerDontCome.setChipImg(chip$);
        totalWagerFourPlace.setChipImg(chip$);
        totalWagerFourCome.setChipImg(chip$);
        totalWagerFivePlace.setChipImg(chip$);
        totalWagerFiveCome.setChipImg(chip$);
        totalWagerSixPlace.setChipImg(chip$);
        totalWagerSixCome.setChipImg(chip$);
        totalWagerEightPlace.setChipImg(chip$);
        totalWagerEightCome.setChipImg(chip$);
        totalWagerNinePlace.setChipImg(chip$);
        totalWagerNineCome.setChipImg(chip$);
        totalWagerTenPlace.setChipImg(chip$);
        totalWagerTenCome.setChipImg(chip$);
        totalWagerSeven.setChipImg(chip$);
        totalWagerAnyCraps.setChipImg(chip$);
        totalWagerHardTwo.setChipImg(chip$);
        totalWagerHardTwelve.setChipImg(chip$);
        totalWagerHardFour.setChipImg(chip$);
        totalWagerHardSix.setChipImg(chip$);
        totalWagerHardEight.setChipImg(chip$);
        totalWagerHardTen.setChipImg(chip$);
        totalWagerHardThree.setChipImg(chip$);
        totalWagerHardEleven.setChipImg(chip$);
        totalBets.setChipImg(chip$);
    }
    
    @FXML
    void handleDragDetected(MouseEvent event) throws IOException {
    	Object source = event.getSource();
    	if( source == chip1 ) {
    		sourceChip.setChipID("1");
    		sourceChip.setChipValue(1);
    		Dragboard db = chip1.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    	if( source == chip5 ) {
    		sourceChip.setChipID("5");
    		sourceChip.setChipValue(5);
    		Dragboard db = chip5.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    	if( source == chip10 ) {
    		sourceChip.setChipID("10");
    		sourceChip.setChipValue(10);
    		Dragboard db = chip10.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    	if( source == chip25 ) {
    		sourceChip.setChipID("25");
    		sourceChip.setChipValue(25);
    		Dragboard db = chip25.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    	if( source == chip50 ) {
    		sourceChip.setChipID("50");
    		sourceChip.setChipValue(50);
    		Dragboard db = chip50.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    	if( source == chip100 ) {
    		sourceChip.setChipID("100");
    		sourceChip.setChipValue(100);
    		Dragboard db = chip100.startDragAndDrop(TransferMode.ANY);
        	ClipboardContent cb = new ClipboardContent();
        	cb.putImage(totalBets.getChipImg().getImage());
    	    db.setContent(cb);
    	    event.consume();
    	}
    }

    @FXML
    void handleDragOver(DragEvent event) {
    	if(event.getDragboard().hasImage()) {
    		event.acceptTransferModes(TransferMode.ANY);
    	}
    }

    @FXML
    void handleDrop(DragEvent event) {
    	Image img = event.getDragboard().getImage();
    	Object source = event.getSource();
    	if( sourceChip.getChipValue() + Integer.parseInt(wagerLabel.getText()) > Integer.parseInt(balanceLabel.getText())) {
    		invalidBetLabel.setText("You don't have enough money for that bet!");
    	}
    	else {
    		invalidBetLabel.setText("");
    		if( off.isActive() ) {
        		if(source == passLinePane1 || source == passLinePane2) {
            		passLineImage.setImage(img);
            		totalWagerPassLine.setChipValue(totalWagerPassLine.getChipValue() + sourceChip.getChipValue());
            		passLineLabel.setText("" + totalWagerPassLine.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == dontPassLinePane1 || source == dontPassLinePane2 ) {
            		dontPassLineImage.setImage(img);
            		totalWagerDontPassLine.setChipValue(totalWagerDontPassLine.getChipValue() + sourceChip.getChipValue());
            		dontPassLineLabel.setText("" + totalWagerDontPassLine.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == fieldPane ) {
            		fieldImage.setImage(img);
            		totalWagerField.setChipValue(totalWagerField.getChipValue() + sourceChip.getChipValue());
            		fieldLabel.setText("" + totalWagerField.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneFour ) {
            		hardFourImage.setImage(img);
            		totalWagerHardFour.setChipValue(totalWagerHardFour.getChipValue() + sourceChip.getChipValue());
            		hardFourLabel.setText("" + totalWagerHardFour.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneTwo ) {
            		hardTwoImage.setImage(img);
            		totalWagerHardTwo.setChipValue(totalWagerHardTwo.getChipValue() + sourceChip.getChipValue());
            		hardTwoLabel.setText("" + totalWagerHardTwo.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneTen ) {
            		hardTenImage.setImage(img);
            		totalWagerHardTen.setChipValue(totalWagerHardTen.getChipValue() + sourceChip.getChipValue());
            		hardTenLabel.setText("" + totalWagerHardTen.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneTwelve ) {
            		hardTwelveImage.setImage(img);
            		totalWagerHardTwelve.setChipValue(totalWagerHardTwelve.getChipValue() + sourceChip.getChipValue());
            		hardTwelveLabel.setText("" + totalWagerHardTwelve.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneEleven ) {
            		hardElevenImage.setImage(img);
            		totalWagerHardEleven.setChipValue(totalWagerHardEleven.getChipValue() + sourceChip.getChipValue());
            		hardElevenLabel.setText("" + totalWagerHardEleven.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneEight ) {
            		hardEightImage.setImage(img);
            		totalWagerHardEight.setChipValue(totalWagerHardEight.getChipValue() + sourceChip.getChipValue());
            		hardEightLabel.setText("" + totalWagerHardEight.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneSix ) {
            		hardSixImage.setImage(img);
            		totalWagerHardSix.setChipValue(totalWagerHardSix.getChipValue() + sourceChip.getChipValue());
            		hardSixLabel.setText("" + totalWagerHardSix.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneThree ) {
            		hardThreeImage.setImage(img);
            		totalWagerHardThree.setChipValue(totalWagerHardThree.getChipValue() + sourceChip.getChipValue());
            		hardThreeLabel.setText("" + totalWagerHardThree.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneFour ) {
            		fourPlaceImage.setImage(img);
            		totalWagerFourPlace.setChipValue(totalWagerFourPlace.getChipValue() + sourceChip.getChipValue());
            		fourPlaceLabel.setText("" + totalWagerFourPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneFive ) {
            		fivePlaceImage.setImage(img);
            		totalWagerFivePlace.setChipValue(totalWagerFivePlace.getChipValue() + sourceChip.getChipValue());
            		fivePlaceLabel.setText("" + totalWagerFivePlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneSix ) {
            		sixPlaceImage.setImage(img);
            		totalWagerSixPlace.setChipValue(totalWagerSixPlace.getChipValue() + sourceChip.getChipValue());
            		sixPlaceLabel.setText("" + totalWagerSixPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneEight ) {
            		eightPlaceImage.setImage(img);
            		totalWagerEightPlace.setChipValue(totalWagerEightPlace.getChipValue() + sourceChip.getChipValue());
            		eightPlaceLabel.setText("" + totalWagerEightPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneNine ) {
            		ninePlaceImage.setImage(img);
            		totalWagerNinePlace.setChipValue(totalWagerNinePlace.getChipValue() + sourceChip.getChipValue());
            		ninePlaceLabel.setText("" + totalWagerNinePlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneTen ) {
            		tenPlaceImage.setImage(img);
            		totalWagerTenPlace.setChipValue(totalWagerTenPlace.getChipValue() + sourceChip.getChipValue());
            		tenPlaceLabel.setText("" + totalWagerTenPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == sevenPane ) {
            		sevenImage.setImage(img);
            		totalWagerSeven.setChipValue(totalWagerSeven.getChipValue() + sourceChip.getChipValue());
            		sevenLabel.setText("" + totalWagerSeven.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == anyCrapsPane ) {
            		anyCrapsImage.setImage(img);
            		totalWagerAnyCraps.setChipValue(totalWagerAnyCraps.getChipValue() + sourceChip.getChipValue());
            		anyCrapsLabel.setText("" + totalWagerAnyCraps.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
        	}
        	else {
            	if( source == fieldPane ) {
            		fieldImage.setImage(img);
            		totalWagerField.setChipValue(totalWagerField.getChipValue() + sourceChip.getChipValue());
            		fieldLabel.setText("" + totalWagerField.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == comePane ) {
            		comeImage.setImage(img);
            		totalWagerCome.setChipValue(totalWagerCome.getChipValue() + sourceChip.getChipValue());
            		comeLabel.setText("" + totalWagerCome.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == dontComePane ) {
            		dontComeImage.setImage(img);
            		totalWagerDontCome.setChipValue(totalWagerDontCome.getChipValue() + sourceChip.getChipValue());
            		dontComeLabel.setText("" + totalWagerDontCome.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneFour ) {
            		fourPlaceImage.setImage(img);
            		totalWagerFourPlace.setChipValue(totalWagerFourPlace.getChipValue() + sourceChip.getChipValue());
            		fourPlaceLabel.setText("" + totalWagerFourPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneFive ) {
            		fivePlaceImage.setImage(img);
            		totalWagerFivePlace.setChipValue(totalWagerFivePlace.getChipValue() + sourceChip.getChipValue());
            		fivePlaceLabel.setText("" + totalWagerFivePlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneSix ) {
            		sixPlaceImage.setImage(img);
            		totalWagerSixPlace.setChipValue(totalWagerSixPlace.getChipValue() + sourceChip.getChipValue());
            		sixPlaceLabel.setText("" + totalWagerSixPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneEight ) {
            		eightPlaceImage.setImage(img);
            		totalWagerEightPlace.setChipValue(totalWagerEightPlace.getChipValue() + sourceChip.getChipValue());
            		eightPlaceLabel.setText("" + totalWagerEightPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneNine ) {
            		ninePlaceImage.setImage(img);
            		totalWagerNinePlace.setChipValue(totalWagerNinePlace.getChipValue() + sourceChip.getChipValue());
            		ninePlaceLabel.setText("" + totalWagerNinePlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneTen ) {
            		tenPlaceImage.setImage(img);
            		totalWagerTenPlace.setChipValue(totalWagerTenPlace.getChipValue() + sourceChip.getChipValue());
            		tenPlaceLabel.setText("" + totalWagerTenPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == placePaneTen ) {
            		tenPlaceImage.setImage(img);
            		totalWagerTenPlace.setChipValue(totalWagerTenPlace.getChipValue() + sourceChip.getChipValue());
            		tenPlaceLabel.setText("" + totalWagerTenPlace.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneFour ) {
            		hardFourImage.setImage(img);
            		totalWagerHardFour.setChipValue(totalWagerHardFour.getChipValue() + sourceChip.getChipValue());
            		hardFourLabel.setText("" + totalWagerHardFour.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneTwo ) {
            		hardTwoImage.setImage(img);
            		totalWagerHardTwo.setChipValue(totalWagerHardTwo.getChipValue() + sourceChip.getChipValue());
            		hardTwoLabel.setText("" + totalWagerHardTwo.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}if( source == hardPaneTen ) {
            		hardTenImage.setImage(img);
            		totalWagerHardTen.setChipValue(totalWagerHardTen.getChipValue() + sourceChip.getChipValue());
            		hardTenLabel.setText("" + totalWagerHardTen.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneTwelve ) {
            		hardTwelveImage.setImage(img);
            		totalWagerHardTwelve.setChipValue(totalWagerHardTwelve.getChipValue() + sourceChip.getChipValue());
            		hardTwelveLabel.setText("" + totalWagerHardTwelve.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneEleven ) {
            		hardElevenImage.setImage(img);
            		totalWagerHardEleven.setChipValue(totalWagerHardEleven.getChipValue() + sourceChip.getChipValue());
            		hardElevenLabel.setText("" + totalWagerHardEleven.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneEight ) {
            		hardEightImage.setImage(img);
            		totalWagerHardEight.setChipValue(totalWagerHardEight.getChipValue() + sourceChip.getChipValue());
            		hardEightLabel.setText("" + totalWagerHardEight.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneSix ) {
            		hardSixImage.setImage(img);
            		totalWagerHardSix.setChipValue(totalWagerHardSix.getChipValue() + sourceChip.getChipValue());
            		hardSixLabel.setText("" + totalWagerHardSix.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == hardPaneThree ) {
            		hardThreeImage.setImage(img);
            		totalWagerHardThree.setChipValue(totalWagerHardThree.getChipValue() + sourceChip.getChipValue());
            		hardThreeLabel.setText("" + totalWagerHardThree.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == sevenPane ) {
            		sevenImage.setImage(img);
            		totalWagerSeven.setChipValue(totalWagerSeven.getChipValue() + sourceChip.getChipValue());
            		sevenLabel.setText("" + totalWagerSeven.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	if( source == anyCrapsPane ) {
            		anyCrapsImage.setImage(img);
            		totalWagerAnyCraps.setChipValue(totalWagerAnyCraps.getChipValue() + sourceChip.getChipValue());
            		anyCrapsLabel.setText("" + totalWagerAnyCraps.getChipValue());
            		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) + sourceChip.getChipValue()));
            	}
            	
        	}
    	}
    	
    }

}
