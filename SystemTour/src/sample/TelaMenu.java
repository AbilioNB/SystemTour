package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TelaMenu.fxml"));
        primaryStage.setTitle("Gerencia Tour");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
