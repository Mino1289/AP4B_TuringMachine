package com.turingmachine.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.turingmachine.core.DifficultyLevel;
import com.turingmachine.core.Game;

/**
 * JavaFX App
 */
public class TuringMachine extends Application {
    private static Game game;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Font.loadFont(getClass().getResourceAsStream("C:/Users/pourc/Desktop/AP4B_TuringMachine/turingmachine/src/main/resources/com/turingmachine/gui/font/PressStart2P-Regular.ttf"),
        // 14);
        stage.setResizable(false); // Empêche la redimension de la fenêtre

        scene = new Scene(loadFXML("main-menu").load(), 800, 800);
        stage.setScene(scene);
        stage.setTitle("TuringMachine");
        game = new Game(new ArrayList<>(), DifficultyLevel.EASY);
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