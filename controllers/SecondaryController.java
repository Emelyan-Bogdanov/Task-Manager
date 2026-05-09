package application.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import application.SceneManager;

public class SecondaryController {
    @FXML
    private Button btnGoToMain;

    @FXML
    public void initialize() {
        btnGoToMain.setOnAction(e -> SceneManager.switchScene("Main"));
    }
}
