package org.example.costumercal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("costumer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 285, 500);
        stage.setTitle("Elio!");
        stage.setScene(scene);
        stage.show();
    }
}
