package application.controller;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
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
    		loader.setLocation(StartSceneController.class.getResource("../../application/view/Board.fxml"));
    		AnchorPane startPane = (AnchorPane) loader.load();
    		BoardController controller = loader.getController();
    		//String cash = new String();
    		//cash = balanceField.getText();
    		try {
    			int balance = Integer.parseInt(balanceField.getText());
    		}
    		catch (NumberFormatException e){
    			errorLabel.setText("Error: please enter a whole number greater than 0");
    			balanceField.setText("0");
    		}
    		
//    		if( )
    		
    		if( balanceField.getText().isEmpty() || Integer.parseInt(balanceField.getText()) <= 0 ) {
    			errorLabel.setText("Error: please enter a whole number greater than 0");
    			balanceField.clear();
    		}
    		else {
    			int startingCash = Integer.parseInt(balanceField.getText());
            	controller.initialize(startingCash);
            	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        		int width = gd.getDisplayMode().getWidth();
        		int height = gd.getDisplayMode().getHeight();
        		AnchorPane.setTopAnchor(startPane, 0d);
        		AnchorPane.setRightAnchor(startPane, 0d);
        		AnchorPane.setBottomAnchor(startPane, 0d);
        		AnchorPane.setLeftAnchor(startPane, 0d);
        		//startPane.getChildren().setAll(controller);
            	Scene scene = new Scene(startPane/*, width-100, height-100*/);
            	Stage stage= new Stage();
            	//startPane.getChildren().add(new Group(startPane));
            	//stage.setMaximized(true);
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
            URL url = new File("src/application/view/Rules.fxml").toURI().toURL();
	    	startPane = FXMLLoader.load(url);
            Scene scene = new Scene(startPane);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
    	}
    }

}
