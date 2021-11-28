package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StartSceneController {
	//this is the Home Screen for the game
	//It will ask you how much money you would like to bet during the game and it will return it as getStartingCash()
	//It also has a button that will take you to a rules screen
	//Then will let you play the game

    @FXML
    private Button rulesButton;

    @FXML
    private AnchorPane startPane;

    @FXML
    private TextField nameField;

    @FXML
    private TextField balanceField;
    
    @FXML
    private Label errorLabel;

    @FXML
    private Button playButton;

    @FXML
    void toGame(ActionEvent event) throws IOException {
    	Object source = event.getSource();
    	if(source == playButton) {
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(StartSceneController.class.getResource("../../application/view/Board.fxml")); //take you to the main board screen to play the game
    		AnchorPane startPane = (AnchorPane) loader.load();
    		BoardController controller = loader.getController();
    		try {
    			Integer.parseInt(balanceField.getText());  
    		}
    		catch (NumberFormatException e){
    			errorLabel.setText("Error: please enter a whole number greater than 0");			//this is where the starting amount is entered and also makes the amount is over 0
    			balanceField.setText("0");
    		}	
    		if( balanceField.getText().isEmpty() || Integer.parseInt(balanceField.getText()) <= 0 ) {
    			errorLabel.setText("Error: please enter a whole number greater than 0");
    			balanceField.clear();
    		}
    		else {
    			int startingCash = Integer.parseInt(balanceField.getText());
            	controller.initialize(startingCash);
            	Scene scene = new Scene(startPane);
            	Stage stage= new Stage();
            	stage.setScene(scene);
            	stage.show();
            	Stage startStage = (Stage) playButton.getScene().getWindow();
            	startStage.close();
    		}
    	}
    }

    @FXML
    void toRules(ActionEvent event) throws IOException {
    	Object source = event.getSource();
    	if(source == rulesButton) {
            URL url = new File("src/application/view/Rules.fxml").toURI().toURL();  //will take you to the rules screen
	    	startPane = FXMLLoader.load(url);
            Scene scene = new Scene(startPane);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
    	}
    }

}
