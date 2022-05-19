package nl.betabit.betabit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static SceneController sceneController = new SceneController();
    @Override
    public void start(Stage stage) throws IOException {
        sceneController.addScreen("dashboard", HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Hello!");
        stage.setScene(sceneController.activate("dashboard"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}