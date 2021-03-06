package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.setTitle(" Sunshine Cinema Bishkek - Seat Reservation System");

        try {
            stage.getIcons().add(new Image("images/icon.png"));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}