package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Run extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        SceneManager.initialize(primaryStage);
        SceneManager.switchScene("Main");
        primaryStage.setTitle("Multi-View App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
