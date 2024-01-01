package com.turingmachine.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class TuringMachine extends Application {
    // private static Game game;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setResizable(false); // Prevent from reducing the window's size

        scene = new Scene(loadFXML("main-menu").load(), 800, 800);
        stage.setScene(scene);
        stage.setTitle("TuringMachine");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        FXMLLoader loader = loadFXML(fxml);
        scene.setRoot(loader.load());
    }

    private static FXMLLoader loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TuringMachine.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
        launch();
    }

}