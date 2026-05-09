package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneManager {
    private static Stage stage;
    private static final String VIEWS_PATH = "/views/";
    private static final String CSS_PATH = "/resources/css/style.css";

    public static void initialize(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchScene(String fxmlName) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource(VIEWS_PATH + fxmlName + ".fxml"));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(SceneManager.class.getResource(CSS_PATH).toExternalForm());
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stage getStage() {
        return stage;
    }
}
