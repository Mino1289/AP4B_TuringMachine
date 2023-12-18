package com.turingmachine.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.turingmachine.core.Game;

/**
 * JavaFX App
 */
public class App extends Application {
    private static Game game;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("criteria-card-selection").load(), 640, 480);
        stage.setScene(scene);
        stage.setTitle("TuringMachine");
        stage.getIcons().add(new Image("file: TMLogo.png"));
        game = new Game();
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        FXMLLoader loader = loadFXML(fxml);
        scene.setRoot(loader.load());
        // Here you can get the controller
        // Object controller = loader.getController();
        // if (controller instanceof TMController) {
        //     ((TMController) controller).setGame(game);
        // }    
    }

    private static FXMLLoader loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
        launch();
    }

}