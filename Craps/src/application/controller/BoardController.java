package application.controller;

import java.io.IOException;

import application.model.Chip;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class BoardController {

    @FXML
    private Label fiveComeLabel;

    @FXML
    private Label ninePlaceLabel;

    @FXML
    private ImageView comeImage;

    @FXML
    private Label comeLabel;

    @FXML
    private ImageView hardSixImage;

    @FXML
    private Label hardEightLabel;

    @FXML
    private Label nineComeLabel;

    @FXML
    private ImageView hardEightImage;

    @FXML
    private ImageView hardTwelveImage;

    @FXML
    private ImageView fivePlaceImage;

    @FXML
    private Pane comePane;

    @FXML
    private Label dontPassLineLabel;

    @FXML
    private Label rollLabel;

    @FXML
    private GridPane hardPane;

    @FXML
    private Label hardTwelveLabel;

    @FXML
    private Pane anyCrapsPane;

    @FXML
    private ImageView dontPassLineImage;

    @FXML
    private Label tenComeLabel;

    @FXML
    private ImageView fourComeImage;

    @FXML
    private ImageView fieldImage;

    @FXML
    private Label hardThreeLabel;

    @FXML
    private ImageView nineComeImage;

    @FXML
    private ImageView fourPlaceImage;

    @FXML
    private ImageView hardTenImage;

    @FXML
    private Label wagerLabel;

    @FXML
    private ImageView chip10;

    @FXML
    private Label eightComeLabel;

    @FXML
    private ImageView passLineImage;

    @FXML
    private Label dontComeLabel;

    @FXML
    private ImageView hardTwoImage;

    @FXML
    private Label tenPlaceLabel;

    @FXML
    private ImageView hardElevenImage;

    @FXML
    private ImageView sixPlaceImage;

    @FXML
    private ImageView fiveComeImage;

    @FXML
    private ImageView chip50;

    @FXML
    private ImageView ninePlaceImage;

    @FXML
    private Pane passLinePane2;

    @FXML
    private Pane passLinePane1;

    @FXML
    private ImageView dontComeImage;

    @FXML
    private ImageView sevenImage;

    @FXML
    private ImageView chip1;

    @FXML
    private Button rollButton;

    @FXML
    private Label sevenLabel;

    @FXML
    private ImageView eightPlaceImage;

    @FXML
    private ImageView chip5;

    @FXML
    private Label hardFourLabel;

    @FXML
    private ImageView hardFourImage;

    @FXML
    private Pane sevenPane;

    @FXML
    private ImageView anyCrapsImage;

    @FXML
    private ImageView chip25;

    @FXML
    private GridPane placeGridPane;

    @FXML
    private Label fieldLabel;

    @FXML
    private ImageView chip100;

    @FXML
    private ImageView sixComeImage;

    @FXML
    private Label sixComeLabel;

    @FXML
    private Label sixPlaceLabel;

    @FXML
    private Label hardCrapsLabel;

    @FXML
    private Label hardTwoLabel;

    @FXML
    private ImageView eightComeImage;

    @FXML
    private Label passLineLabel;

    @FXML
    private Label fivePlaceLabel;

    @FXML
    private Pane fieldPane;

    @FXML
    private Label winLoseLabel;

    @FXML
    private ImageView tenPlaceImage;

    @FXML
    private Label hardSixLabel;

    @FXML
    private Label fourPlaceLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private ImageView hardThreeImage;

    @FXML
    private Label hardTenLabel;

    @FXML
    private ImageView tenComeImage;

    @FXML
    private Pane dontPassLinePane2;

    @FXML
    private ImageView onOffButton;

    @FXML
    private Label eightPlaceLabel;

    @FXML
    private Label hardElevenLabel;

    @FXML
    private Label fourComeLabel;
    
    @FXML
    private ImageView chip$;

    @FXML
    void rollDice(ActionEvent event) {

    }
    
    Chip dollar1 = new Chip("1", 1, chip1);
    Chip dollar5 = new Chip("5", 5, chip5);
    Chip dollar10 = new Chip("10", 10, chip10);
    Chip dollar25 = new Chip("25", 25, chip25);
    Chip dollar50 = new Chip("50", 50, chip50);
    Chip dollar100 = new Chip("100", 100, chip100);
    Chip totalChip = new Chip("$", 0, chip$);
    Chip sourceChip = new Chip();
    
    public void initialize() {
    	
    }
    
    @FXML
    void handleDragDetected(MouseEvent event) throws IOException {
    	Object source = event.getSource();
    	dollar1.setChipImg(chip1);
    	dollar5.setChipImg(chip5);
    	dollar10.setChipImg(chip10);
    	dollar25.setChipImg(chip25);
    	dollar50.setChipImg(chip50);
    	dollar100.setChipImg(chip100);
    	totalChip.setChipImg(chip$);
    	if( source == chip1 ) {
    		//Chip sourceImg = new Chip("1", 1, chip1);
    		sourceChip.setChipID("1");
    		totalChip.setChipValue(dollar1.getChipValue() + totalChip.getChipValue());
//    		System.out.println(dollar1.getChipValue());
//    		System.out.println(totalChip.getChipValue());
//    		System.out.println(totalChip.getChipImg());
    		Dragboard db = chip1.startDragAndDrop(TransferMode.ANY);
        	
        	ClipboardContent cb = new ClipboardContent();
        	
        	cb.putImage(totalChip.getChipImg().getImage());
        	
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
    	dollar1.setChipImg(chip1);
    	dollar5.setChipImg(chip5);
    	dollar10.setChipImg(chip10);
    	dollar25.setChipImg(chip25);
    	dollar50.setChipImg(chip50);
    	dollar100.setChipImg(chip100);
    	totalChip.setChipImg(chip$);
    	Image img = event.getDragboard().getImage();
    	//sourceChip.getChipID();
    	Object source = event.getSource();
    	if(source == passLinePane1 || source == passLinePane2) {
    		//passLineImage.setImage(img);
    		if( sourceChip.getChipID().equals(dollar1.getChipID())) {
    			passLineImage.setImage(img);
    			passLineLabel.setText("" + totalChip.getChipValue());
    		}
    	}
    	
    }

}
