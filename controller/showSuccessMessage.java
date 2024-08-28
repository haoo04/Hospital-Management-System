package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class showSuccessMessage {

    @FXML
    private Button closePage;

    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) closePage.getScene().getWindow();
        stage.close();
    }

}