package nl.betabit.betabit;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class SceneController {
    HashMap<String, URL> screens = new HashMap<>();

    public void addScreen(String name, URL screen) {
        screens.put(name, screen);
    }

    public void removeScreen(String name) {
        screens.remove(name);
    }

    public Scene activate(String name) throws IOException {
        FXMLLoader loader = new FXMLLoader(screens.get(name));
        return new Scene(loader.load(), 800, 800);
    }
}