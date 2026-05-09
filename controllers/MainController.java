package application.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import application.SceneManager;

public class MainController {
    @FXML
    private Button btnGoToSecondary;

    @FXML
    public void initialize() {
        btnGoToSecondary.setOnAction(e -> SceneManager.switchScene("Secondary"));
    }
}
