package application.controller;

import java.io.File;
import java.io.IOException;

import application.model.*;
import javafx.animation.AnimationTimer;
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
	int point;
	int point2;

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
    private ImageView onPuck4;
    
    @FXML
    private ImageView onPuck5;
    
    @FXML
    private ImageView onPuck6;
    
    @FXML
    private ImageView onPuck8;
    
    @FXML
    private ImageView onPuck9;
    
    @FXML
    private ImageView onPuck10;
    
    @FXML
    private ImageView puck1;
    
    @FXML
    private ImageView puck2;
    
    @FXML
    private Label invalidBetLabel;
    
    @FXML
    private Pane dontComePane;
    
    @FXML
    private ImageView die1Image;
    
    @FXML
    private ImageView die2Image;
    
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
    Game game = new Game();
//    Die d1 = new Die();
//    Die d2 = new Die();
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
        off.setPuckImg(puck1);
        on.setPuckImg(puck2);
        offPuck.setImage(off.getPuckImg().getImage());
        clock = new Roller();
        setDiceImages(game.getD1().getTop(), game.getD2().getTop());
    }
    
    private Roller clock;
    
    private class Roller extends AnimationTimer{

    	private long FRAMES_PER_SEC = 50L;
    	private long INTERVAL = 1000000000L / FRAMES_PER_SEC;
    	private int MAX_ROLLS = 20;
    	
    	private long last = 0;
    	private int count = 0;
    	
		@Override
		public void handle(long now) {
			if( now - last > INTERVAL) {
				int rando1 = 1 + (int)(Math.random() * 5);
				int rando2 = 1 + (int)(Math.random() * 5);
				setDiceImages(rando1, rando2);
				last = now;
				count++;
				if( count> MAX_ROLLS) {
					clock.stop();
					roll();
					count = 0;
					
				}
			}
		}
    }
    
    public void setDiceImages(int top1, int top2) {
    	File f  = new File("images/dice" + top1 + ".png");
    	File f2 = new File("images/dice" + top2 + ".png");
    	die1Image.setImage(new Image(f.toURI().toString()));
    	die2Image.setImage(new Image(f2.toURI().toString()));
    }
    
    public void updateViews() {
    	setDiceImages(game.getD1().getTop(), game.getD2().getTop());
    }
    
    public void roll() {
    	game.roll();
    	updateViews();
    	int face1 = game.getD1().getTop();
    	int face2 = game.getD2().getTop();
    	int sumOfDice = face1 + face2;
    	checkOneTimeBets(face1, face2);
    	clearOneTimeBets();
    	if(off.isActive()){
    		checkWorkingBets(face1, face2);
    		if(totalWagerPassLine.getChipValue() > 0 && totalWagerDontPassLine.getChipValue() == 0) {
    			switch(sumOfDice) {
    		    	case 7:
    		    	case 11:
    		    			    //wins
    		    		player.setCurrentCash(player.getCurrentCash() + totalWagerPassLine.getChipValue());
    		    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		    		//totalWagerPassLine.setChipValue(0);
    		    			    //off.setActive(false);
    		    		clearBoard();
    		    		break;
    		    	case 2:
    		    	case 3:
    		    	case 12:
    		    			    //loss
    		    		player.setCurrentCash(player.getCurrentCash() - totalWagerPassLine.getChipValue());
    		    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		    		//totalWagerPassLine.setChipValue(0);
    		    			    //off.setActive(false);
    		    		clearBoard();
    		    		break;
    		    	default:
    		    		point = sumOfDice;
    		    		off.setActive(false);
    		    		offPuck.setImage(null);
    		    		if( point == 4 )
    		    			onPuck4.setImage(on.getPuckImg().getImage());
    		    		else if( point == 5 )
    		    			onPuck5.setImage(on.getPuckImg().getImage());
    		    		else if( point == 6 )
    		    			onPuck6.setImage(on.getPuckImg().getImage());
    		    		else if( point == 8 )
    		    			onPuck8.setImage(on.getPuckImg().getImage());
    		    		else if( point == 9 )
    		    			onPuck9.setImage(on.getPuckImg().getImage());
    		    		else if( point == 10 )
    		    			onPuck10.setImage(on.getPuckImg().getImage());
    		    }
    	    }
    		else if(totalWagerPassLine.getChipValue() == 0 && totalWagerDontPassLine.getChipValue() > 0) {
    			switch(sumOfDice) {
    				case 7:
    		        case 11:
    		        	player.setCurrentCash(player.getCurrentCash() - totalWagerDontPassLine.getChipValue());
    		            balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		            //totalWagerDontPassLine.setChipValue(0);
    		                    //off.setActive(false);
    		            clearBoard();
    		            break;
    		        case 2:
    		        case 3:
    		                    //win
    		            player.setCurrentCash(player.getCurrentCash() + totalWagerDontPassLine.getChipValue());
    		            balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		            //totalWagerDontPassLine.setChipValue(0);
    		                    //off.setActive(false);
    		            clearBoard();
    		            break;
    		        case 12:
    		                    //draw
    		                    //off.setActive(false);
    		        	//totalWagerDontPassLine.setChipValue(0);
    		            clearBoard();
    		            break;
    		            default:
    		            	point = sumOfDice;
    		                off.setActive(false);
    		                offPuck.setImage(null);
    		                if( point == 4 )
    		                	onPuck4.setImage(on.getPuckImg().getImage());
    		                else if( point == 5 )
    		                    onPuck5.setImage(on.getPuckImg().getImage());
    		                else if( point == 6 )
    		                    onPuck6.setImage(on.getPuckImg().getImage());
    		                else if( point == 8 )
    		                    onPuck8.setImage(on.getPuckImg().getImage());
    		                else if( point == 9 )
    		                    onPuck9.setImage(on.getPuckImg().getImage());
    		                else if( point == 10 )
    		                    onPuck10.setImage(on.getPuckImg().getImage());
    		    }
    		}
    		else if(totalWagerPassLine.getChipValue() > 0 && totalWagerDontPassLine.getChipValue() > 0) {
    			switch(sumOfDice) {
    				case 7:
    		        case 11:
    		                //wins from passline, lossses from Dontpassline
    		        	player.setCurrentCash(player.getCurrentCash() + totalWagerPassLine.getChipValue());
    		            player.setCurrentCash(player.getCurrentCash() - totalWagerDontPassLine.getChipValue());
    		            balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		            //totalWagerPassLine.setChipValue(0);
    		            //totalWagerDontPassLine.setChipValue(0);
    		            clearBoard();
    		            break;
    		        case 2:
    		        case 3:  
    		                //losses from passline, wins from Dontpassline
    		            player.setCurrentCash(player.getCurrentCash() - totalWagerPassLine.getChipValue());
    		            player.setCurrentCash(player.getCurrentCash() + totalWagerDontPassLine.getChipValue());
    		            balanceLabel.setText(String.valueOf(player.getCurrentCash())); 
    		            //totalWagerPassLine.setChipValue(0);
    		            //totalWagerDontPassLine.setChipValue(0);
    		            clearBoard();
    		            break;
    		        case 12:
    		                //losses from passline
    		            player.setCurrentCash(player.getCurrentCash() - totalWagerPassLine.getChipValue());
    		            balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		            //totalWagerPassLine.setChipValue(0);
    		            //totalWagerDontPassLine.setChipValue(0);
    		            clearBoard();
    		            break;
    		        default: 
    		            point = sumOfDice;
    		            off.setActive(false);
    		            offPuck.setImage(null);
    		            if( point == 4 )
    		            	onPuck4.setImage(on.getPuckImg().getImage());
    		            else if( point == 5 )
    		                onPuck5.setImage(on.getPuckImg().getImage());
    		            else if( point == 6 )
    		                onPuck6.setImage(on.getPuckImg().getImage());
    		            else if( point == 8 )
    		                onPuck8.setImage(on.getPuckImg().getImage());
    		            else if( point == 9 )
    		                onPuck9.setImage(on.getPuckImg().getImage());
    		            else if( point == 10 )
    		                onPuck10.setImage(on.getPuckImg().getImage());
    		    }
    		}
    		    //clearBoard();
    	}
    	else{
    		checkWorkingBets(face1, face2);
    		if( sumOfDice == point ) {
    			player.setCurrentCash(player.getCurrentCash() + totalWagerPassLine.getChipValue());
    			player.setCurrentCash(player.getCurrentCash() - totalWagerDontPassLine.getChipValue());
	    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
	    		off.setActive(true);
	    		offPuck.setImage(off.getPuckImg().getImage());
//	    		totalWagerFourCome.setChipValue(0);
//    			totalWagerFiveCome.setChipValue(0);
//    			totalWagerSixCome.setChipValue(0);
//    			totalWagerEightCome.setChipValue(0);
//    			totalWagerNineCome.setChipValue(0);
//    			totalWagerTenCome.setChipValue(0);
	    		clearBoard();
    		}
    		else if( sumOfDice == 7 ) {
    			player.setCurrentCash(player.getCurrentCash() - totalWagerPassLine.getChipValue());
    			player.setCurrentCash(player.getCurrentCash() + totalWagerDontPassLine.getChipValue());
	    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    			off.setActive(true);
    			offPuck.setImage(off.getPuckImg().getImage());
//    			totalWagerFourCome.setChipValue(0);
//    			totalWagerFiveCome.setChipValue(0);
//    			totalWagerSixCome.setChipValue(0);
//    			totalWagerEightCome.setChipValue(0);
//    			totalWagerNineCome.setChipValue(0);
//    			totalWagerTenCome.setChipValue(0);
    			clearBoard();
    		}
    		if( totalWagerCome.getChipValue() > 0) {
    			//point2 = sumOfDice;
    			switch(sumOfDice) {
		    		case 7:
		    		case 11:
		    			    //wins
		    			player.setCurrentCash(player.getCurrentCash() + totalWagerCome.getChipValue());
		    			balanceLabel.setText(String.valueOf(player.getCurrentCash()));
		    		//totalWagerPassLine.setChipValue(0);
		    			    //off.setActive(false);
		    		//clearBoard();
		    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerCome.getChipValue()));
		    			comeImage.setImage(null);
		    			comeLabel.setText("");
		    			totalWagerCome.setChipValue(0);
		    			break;
		    		case 2:
		    		case 3:
		    		case 12:
		    			    //loss
		    			player.setCurrentCash(player.getCurrentCash() - totalWagerPassLine.getChipValue());
		    			balanceLabel.setText(String.valueOf(player.getCurrentCash()));
		    		//totalWagerPassLine.setChipValue(0);
		    			    //off.setActive(false);
		    		//clearBoard();
		    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerCome.getChipValue()));
		    			comeImage.setImage(null);
		    			comeLabel.setText("");
		    			totalWagerCome.setChipValue(0);
		    			break;
		    		default:
		    			point2 = sumOfDice;
		    		//off.setActive(false);
		    		//offPuck.setImage(null);
		    			if( point2 == 4 ) {
		    				fourComeImage.setImage(chip$.getImage());
		    				fourComeLabel.setText("" + totalWagerCome.getChipValue());
		    				totalWagerFourCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			else if( point2 == 5 ) {
		    				fiveComeImage.setImage(chip$.getImage());
		    				fiveComeLabel.setText("" + totalWagerCome.getChipValue());
		    				totalWagerFiveCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			else if( point2 == 6 ) {
		    				sixComeImage.setImage(chip$.getImage());
		    				sixComeLabel.setText("" + totalWagerCome.getChipValue());
		    				totalWagerSixCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			else if( point2 == 8 ) {
		    				eightComeImage.setImage(chip$.getImage());
		    				eightComeLabel.setText("" + totalWagerCome.getChipValue());
		    				totalWagerEightCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			else if( point2 == 9 ) {
		    				nineComeImage.setImage(chip$.getImage());
			    			nineComeLabel.setText("" + totalWagerCome.getChipValue());
			    			totalWagerNineCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			else if( point2 == 10 ) {
		    				tenComeImage.setImage(chip$.getImage());
			    			tenComeLabel.setText("" + totalWagerCome.getChipValue());
			    			totalWagerTenCome.setChipValue(Integer.parseInt(comeLabel.getText()));
		    			}
		    			comeImage.setImage(null);
		    			comeLabel.setText("");
		    			totalWagerCome.setChipValue(0);
    			}
    		}
    		else {
    			if( sumOfDice == point2 ) {
        			player.setCurrentCash(player.getCurrentCash() + totalWagerFourCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() + totalWagerFiveCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() + totalWagerSixCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() + totalWagerEightCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() + totalWagerNineCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() + totalWagerTenCome.getChipValue());
    	    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	    		//off.setActive(true);
    	    		//offPuck.setImage(off.getPuckImg().getImage());
    	    		//clearBoard();
    	    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFourCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFiveCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerSixCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerEightCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerNineCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerTenCome.getChipValue()));
    	    		fourComeImage.setImage(null);
	    			fourComeLabel.setText("");
	    			totalWagerFourCome.setChipValue(0);
	    			fiveComeImage.setImage(null);
	    			fiveComeLabel.setText("");
	    			totalWagerFiveCome.setChipValue(0);
	    			sixComeImage.setImage(null);
	    			sixComeLabel.setText("");
	    			totalWagerSixCome.setChipValue(0);
	    			eightComeImage.setImage(null);
	    			eightComeLabel.setText("");
	    			totalWagerEightCome.setChipValue(0);
	    			nineComeImage.setImage(null);
	    			nineComeLabel.setText("");
	    			totalWagerNineCome.setChipValue(0);
	    			tenComeImage.setImage(null);
	    			tenComeLabel.setText("");
	    			totalWagerTenCome.setChipValue(0);
        		}
        		else if( sumOfDice == 7 ) {
        			player.setCurrentCash(player.getCurrentCash() - totalWagerFourCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() - totalWagerFiveCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() - totalWagerSixCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() - totalWagerEightCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() - totalWagerNineCome.getChipValue());
        			player.setCurrentCash(player.getCurrentCash() - totalWagerTenCome.getChipValue());
    	    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
//        			off.setActive(true);
//        			offPuck.setImage(off.getPuckImg().getImage());
//        			clearBoard();
    	    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFourCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFiveCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerSixCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerEightCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerNineCome.getChipValue()));
	    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerTenCome.getChipValue()));
    	    		fourComeImage.setImage(null);
	    			fourComeLabel.setText("");
	    			totalWagerFourCome.setChipValue(0);
	    			fiveComeImage.setImage(null);
	    			fiveComeLabel.setText("");
	    			totalWagerFiveCome.setChipValue(0);
	    			sixComeImage.setImage(null);
	    			sixComeLabel.setText("");
	    			totalWagerSixCome.setChipValue(0);
	    			eightComeImage.setImage(null);
	    			eightComeLabel.setText("");
	    			totalWagerEightCome.setChipValue(0);
	    			nineComeImage.setImage(null);
	    			nineComeLabel.setText("");
	    			totalWagerNineCome.setChipValue(0);
	    			tenComeImage.setImage(null);
	    			tenComeLabel.setText("");
	    			totalWagerTenCome.setChipValue(0);
        		}
    		}
    	}
    }
    
    public void checkWorkingBets(int face1, int face2) {
    	int sumOfDice = face1 + face2;
    	int place4Bet = totalWagerFourPlace.getChipValue();
    	int place5Bet = totalWagerFivePlace.getChipValue();
    	int place6Bet = totalWagerSixPlace.getChipValue();
    	int place8Bet = totalWagerEightPlace.getChipValue();
    	int place9Bet = totalWagerNinePlace.getChipValue();
    	int place10Bet = totalWagerTenPlace.getChipValue();
    		
    		/* for place bets:
    		 * 4 or 10: 9 to 5
    		 * 5 or 9: 7 to 5
    		 * 6 or 8: 7 to 6
    		 * */
    	if( sumOfDice == 4 ) {
    		int place4BetPay = (int)(place4Bet * 9) / 5;
    		player.setCurrentCash(player.getCurrentCash() + place4BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFourPlace.getChipValue()));
    		totalWagerFourPlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		fourPlaceImage.setImage(null);
    		fourPlaceLabel.setText("");
    	}
    	if( sumOfDice == 10 ) {
    		int place10BetPay = (int)(place10Bet * 9) / 5;
    		player.setCurrentCash(player.getCurrentCash() + place10BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerTenPlace.getChipValue()));
    		totalWagerTenPlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		tenPlaceImage.setImage(null);
    		tenPlaceLabel.setText("");
    	}
    	if( sumOfDice == 5 ) {
    		int place5BetPay = (int)(place5Bet * 7) / 5;
    		player.setCurrentCash(player.getCurrentCash() + place5BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerFivePlace.getChipValue()));
    		totalWagerFivePlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		fivePlaceImage.setImage(null);
    		fivePlaceLabel.setText("");
    	}
    	if( sumOfDice == 9 ) {
    		int place9BetPay = (int)(place9Bet * 7) / 5;
    		player.setCurrentCash(player.getCurrentCash() + place9BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerNinePlace.getChipValue()));
    		totalWagerNinePlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		ninePlaceImage.setImage(null);
    		ninePlaceLabel.setText("");
    	}
    	if( sumOfDice == 6 ) {
    		int place6BetPay = (int)(place6Bet * 7) / 6;
    		player.setCurrentCash(player.getCurrentCash() + place6BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerSixPlace.getChipValue()));
    		totalWagerSixPlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		sixPlaceImage.setImage(null);
    		sixPlaceLabel.setText("");
    	}
    	if( sumOfDice == 8 ) {
    		int place8BetPay = (int)(place8Bet * 7) / 6;
    		player.setCurrentCash(player.getCurrentCash() + place8BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerEightPlace.getChipValue()));
    		totalWagerEightPlace.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		eightPlaceImage.setImage(null);
    		eightPlaceLabel.setText("");
    	}
    }
    
    public void checkOneTimeBets(int face1, int face2){
    	int sumOfDice = face1 + face2;
    	int hard2Bet = totalWagerHardTwo.getChipValue();
    	int hard3Bet = totalWagerHardThree.getChipValue();
    	int hard4Bet = totalWagerHardFour.getChipValue();
    	int hard6Bet = totalWagerHardSix.getChipValue();
    	int hard8Bet = totalWagerHardEight.getChipValue();
    	int hard10Bet = totalWagerHardTen.getChipValue();
    	int hard11Bet = totalWagerHardEleven.getChipValue();
    	int hard12Bet = totalWagerHardTwelve.getChipValue();
    	int fieldBet = totalWagerField.getChipValue();
    	
    	if( sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 4 || sumOfDice == 9 || sumOfDice == 10 || sumOfDice == 11 || sumOfDice == 12) {
    		if( sumOfDice == 2) {
    			int fieldBetPay = fieldBet * 2;
    			player.setCurrentCash(player.getCurrentCash() + fieldBetPay);
    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerField.getChipValue()));
        		totalWagerField.setChipValue(0);
        		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		}
    		else if( sumOfDice == 12) {
    			int fieldBetPay = fieldBet * 3;
    			player.setCurrentCash(player.getCurrentCash() + fieldBetPay);
    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerField.getChipValue()));
        		totalWagerField.setChipValue(0);
        		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		}
    		else {
    			int fieldBetPay = fieldBet;
    			player.setCurrentCash(player.getCurrentCash() + fieldBetPay);
    			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerField.getChipValue()));
        		totalWagerField.setChipValue(0);
        		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    		}
    	}
    	else {
    		int fieldBetPay = fieldBet;
			player.setCurrentCash(player.getCurrentCash() - fieldBetPay);
			wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerField.getChipValue()));
    		totalWagerField.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    		
    	if( face1 == 1 && face2 == 1 ) {
    		int hard2BetPay = hard2Bet * 30;
    		player.setCurrentCash(player.getCurrentCash() + hard2BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTwo.getChipValue()));
    		totalWagerHardTwo.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard2Bet);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTwo.getChipValue()));
    		totalWagerHardTwo.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( face1 == 6 && face2 == 6 ) {
    		int hard12BetPay = hard12Bet * 30;
    		player.setCurrentCash(player.getCurrentCash() + hard12BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTwelve.getChipValue()));
    		totalWagerHardTwelve.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard12Bet);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTwelve.getChipValue()));
    		totalWagerHardTwelve.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( (face1 == 1 && face2 == 2) || (face1 == 2 && face2 == 1) ) {
    		int hard3BetPay = hard3Bet * 15;
    		player.setCurrentCash(player.getCurrentCash() + hard3BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardThree.getChipValue()));
    		totalWagerHardThree.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard3Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardThree.getChipValue()));
    		totalWagerHardThree.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( face1 == 2 && face2 == 2 ) {
    		int hard4BetPay = hard4Bet * 7;
    		player.setCurrentCash(player.getCurrentCash() + hard4BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardFour.getChipValue()));
    		totalWagerHardFour.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard4Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardFour.getChipValue()));
    		totalWagerHardFour.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( face1 == 3 && face2 == 3 ) {
    		int hard6BetPay = hard6Bet * 9;
    		player.setCurrentCash(player.getCurrentCash() + hard6BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardSix.getChipValue()));
    		totalWagerHardSix.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard6Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardSix.getChipValue()));
    		totalWagerHardSix.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( face1 == 4 && face2 == 4 ) {
    		int hard8BetPay = hard8Bet * 9;
    		player.setCurrentCash(player.getCurrentCash() + hard8BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardEight.getChipValue()));
    		totalWagerHardEight.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard8Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardEight.getChipValue()));
    		totalWagerHardEight.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( face1 == 5 && face2 == 5 ) {
    		int hard10BetPay = hard10Bet * 7;
    		player.setCurrentCash(player.getCurrentCash() + hard10BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTen.getChipValue()));
    		totalWagerHardTen.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard10Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardTen.getChipValue()));
    		totalWagerHardTen.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	if( (face1 == 5 && face2 == 6) || (face1 == 6 && face2 == 5) ) {
    		int hard11BetPay = hard11Bet * 15;
    		player.setCurrentCash(player.getCurrentCash() + hard11BetPay);
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardEleven.getChipValue()));
    		totalWagerHardEleven.setChipValue(0);
    		balanceLabel.setText(String.valueOf(player.getCurrentCash()));
    	}
    	else {
    		player.setCurrentCash(player.getCurrentCash() - hard11Bet );
    		wagerLabel.setText(String.valueOf(Integer.parseInt(wagerLabel.getText()) - totalWagerHardEleven.getChipValue()));
    		totalWagerHardEleven.setChipValue(0);
    		balanceLabel.setText("" + String.valueOf(player.getCurrentCash()));
    	}
    }

	public void clearBoard() {
		passLineImage.setImage(null);
		passLineLabel.setText("");
		dontPassLineImage.setImage(null);
		dontPassLineLabel.setText("");
		onPuck4.setImage(null);
		onPuck5.setImage(null);
		onPuck6.setImage(null);
		onPuck8.setImage(null);
		onPuck9.setImage(null);
		onPuck10.setImage(null);
		totalWagerPassLine.setChipValue(0);
		totalWagerDontPassLine.setChipValue(0);
		totalWagerFourPlace.setChipValue(0);
		totalWagerFivePlace.setChipValue(0);
		totalWagerSixPlace.setChipValue(0);
		totalWagerEightPlace.setChipValue(0);
		totalWagerNinePlace.setChipValue(0);
		totalWagerTenPlace.setChipValue(0);
		fourPlaceImage.setImage(null);
		fourPlaceLabel.setText("");
		fivePlaceImage.setImage(null);
		fivePlaceLabel.setText("");
		sixPlaceImage.setImage(null);
		sixPlaceLabel.setText("");
		eightPlaceImage.setImage(null);
		eightPlaceLabel.setText("");
		ninePlaceImage.setImage(null);
		ninePlaceLabel.setText("");
		tenPlaceImage.setImage(null);
		tenPlaceLabel.setText("");
		int remainingWager = totalWagerFourCome.getChipValue() + totalWagerFiveCome.getChipValue() + totalWagerSixCome.getChipValue() +
				totalWagerEightCome.getChipValue() + totalWagerNineCome.getChipValue() + totalWagerTenCome.getChipValue() + totalWagerCome.getChipValue();
		wagerLabel.setText("" + String.valueOf(remainingWager));
		
	}
	
	public void clearOneTimeBets() {
		hardTwoImage.setImage(null);
		hardTwoLabel.setText("");
		hardThreeImage.setImage(null);
		hardThreeLabel.setText("");
		hardFourImage.setImage(null);
		hardFourLabel.setText("");
		hardSixImage.setImage(null);
		hardSixLabel.setText("");
		hardEightImage.setImage(null);
		hardEightLabel.setText("");
		hardTenImage.setImage(null);
		hardTenLabel.setText("");
		hardElevenImage.setImage(null);
		hardElevenLabel.setText("");
		hardTwelveImage.setImage(null);
		hardTwelveLabel.setText("");
		fieldImage.setImage(null);
		fieldLabel.setText("");
	}
    
    public void rollAnimation() throws InterruptedException {
    	if(passLineLabel.getText().equals("") && dontPassLineLabel.getText().equals("")) {
    		invalidBetLabel.setText("You need to place a line bet for the first roll!");
    	}
    	else {
    		invalidBetLabel.setText("");
    		clock.start();
    	}
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
