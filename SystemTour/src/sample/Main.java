package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;
    private static Scene loginScane;
    private static Scene menuScane;
    private static Scene cadastroScane;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("Gerencia Tour");

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
        loginScane = new Scene(fxmlLogin, 300, 275);
        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("menu.fxml"));
        menuScane = new Scene(fxmlMenu, 400, 300);
        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("cadastrar.fxml"));
        cadastroScane = new Scene(fxmlCadastro, 400, 300);

        primaryStage.setScene(loginScane);
        primaryStage.show();
    }
    public static void trocaTela(String tela){
        switch (tela){
            case "Entrar":
                stage.setScene(menuScane);
                break;
            case "Cadastrar":
                stage.setScene(cadastroScane);
                break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
