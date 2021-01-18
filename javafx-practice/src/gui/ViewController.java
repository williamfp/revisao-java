package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction(){
        //More complete version (with header)
        //Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);

        //Simplified version (without header)
        Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.INFORMATION);
    }
}
