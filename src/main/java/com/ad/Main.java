package com.ad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/MousePointerScene.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("images/icon.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void stop() {
        System.exit(1);
    }
}