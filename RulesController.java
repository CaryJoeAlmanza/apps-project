package application.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RulesController { 
	
	//this is the rules controller for the rules scene
	//This scene is filled with links that will take the player to websites to learn how to play the game

    @FXML
    private Hyperlink quickVideoLink;

    @FXML
    private Hyperlink wikiLink;

    @FXML
    private AnchorPane rulesPane;

    @FXML
    private Button backButton;

    @FXML
    private Hyperlink longVideoLink;

    @FXML
    void openLink(ActionEvent event) {
    	Object source = event.getSource();
    	if(source == wikiLink) {
    		try {
				Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Craps")); //directs the player to a website 
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
    	}
    	if( source == quickVideoLink) {
    		try {
				Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=qNsSpNm_iCw&ab_channel=ColorUp"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
    	}
    	if( source == longVideoLink) {
    		try {
				Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=T6i5SkIn2VY&t=2093s&ab_channel=ColorUp"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
    	}

    }

    @FXML
    void goBack(ActionEvent event) throws IOException { //go back button to take them back to the home screen
    	Object source = event.getSource();
    	if(source == backButton) {
            URL url = new File("src/application/view/StartScreen.fxml").toURI().toURL();
	    	rulesPane = FXMLLoader.load (url);
            Scene scene = new Scene(rulesPane);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
    	}
    }
}
