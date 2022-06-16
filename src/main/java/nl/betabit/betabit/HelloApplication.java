package nl.betabit.betabit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import nl.betabit.betabit.entities.*;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    static User user = new User();

    @Override
    public void start(Stage stage) throws IOException {
        SceneController sceneController = (SceneController) AppFactory.get("scenecontroller");
        sceneController.addScreen("dashboard", HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Hello!");
        stage.setScene(sceneController.activate("dashboard"));
        stage.show();
    }

    public static void main(String[] args) {
        // Register factory
        try {
            AppFactory.register("scenecontroller", new SceneController());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        launch();
    }

    public static void loadData() {
        // Create random ProfileContainers
        ProfileContainer basicProfile = new ProfileContainer(1, "Basic", "#000000", 1, 0, 0);
        new ProfileContainer(2, "Medium", "#000000", 2, 100, 0);
        new ProfileContainer(3, "Advanced", "#000000", 3, 200, 0);
        new ProfileContainer(4, "Elite", "#000000", 4, 300, 0);

        // Create random PictureContainers
        PictureContainer basicPicture = new PictureContainer(1, "Basic", "#000000", 1, 0, 0);
        new PictureContainer(2, "Medium", "#000000", 2, 100, 0);
        new PictureContainer(3, "Advanced", "#000000", 3, 200, 0);
        new PictureContainer(4, "Elite", "#000000", 4, 300, 0);

        // Create random Badges
        new Badge(1, "Basic", "#000000");
        new Badge(2, "Medium", "#000000");
        new Badge(3, "Advanced", "#000000");
        new Badge(4, "Elite", "#000000");

        // Create random Transports
        new Transport(1, "Car", 30);
        new Transport(2, "Bike", 0);
        new Transport(3, "Walk", 0);
        new Transport(4, "Public Transport", 25);

        // Create random Users
        new User("John Doe", "john@example.com", "password", "admin", 400, 0, 2, 1, basicPicture, basicProfile);
        new User("Jane Doe", "jane@example.com", "password", "user", 900, 700, 3, 3, basicPicture, basicProfile);
        new User("John Smith", "john@example.com", "password", "user", 0, 0, 0, 0, basicPicture, basicProfile);
        new User("Tim User", "tim.user@example.com", "password", "user", 200, 0, 0, 0, basicPicture, basicProfile);
        new User("Tim Admin", "tim.admin@example.com", "password", "admin", 0, 0, 0, 0, basicPicture, basicProfile);
    }
}