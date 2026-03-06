package org.example.joycecientifica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("joyce.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 285,477 );
        stage.setTitle("Joyce!");
        stage.setScene(scene);
        stage.show();
    }
}
