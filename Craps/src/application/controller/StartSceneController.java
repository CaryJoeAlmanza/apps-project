package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    private Button playButton;

    @FXML
    void toGame(ActionEvent event) throws IOException {
    	Object source = event.getSource();
    	if(source == playButton) {
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(StartSceneController.class.getResource("../../application/view/Board.fxml"));
    		AnchorPane startPane = (AnchorPane) loader.load();
    		//BoardController controller = loader.getController();
    		//controller.setLabels(usernameField.getText());
    		//controller.initalize();
    		Scene scene = new Scene(startPane);
    		Stage stage= new Stage();
    		stage.setScene(scene);
    		stage.show();
    		Stage startStage = (Stage) playButton.getScene().getWindow();
    		startStage.close();
    		
    	}

    }

    @FXML
    void toRules(ActionEvent event) {

    }

}