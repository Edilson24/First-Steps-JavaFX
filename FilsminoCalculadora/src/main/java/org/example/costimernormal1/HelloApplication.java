package org.example.costimernormal1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mino.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 267, 494);
        stage.setTitle("Filsmino!");
        stage.setScene(scene);
        stage.show();
    }
}
