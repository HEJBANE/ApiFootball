package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;




public class Ui extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ui.class.getResource("Ui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 710, 369);
        stage.setTitle("Reset Client for Competitions");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}