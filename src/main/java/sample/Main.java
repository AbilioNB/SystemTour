package sample;

import controllers.AdministradorController;
import controllers.ScreensController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage stage;
    private static Scene loginScane;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("Gerencia Tour");

        Parent fxmllogin = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
        loginScane = new Scene(fxmllogin);

        primaryStage.setScene(loginScane);
        primaryStage.show();

        AdministradorController cadastroRoot = new AdministradorController();
        cadastroRoot.rootADMCADASTRO();

    }
    public static void trocaTela(String tela) throws IOException {
        switch (tela){
            case "Entrar":
                stage.setScene(ScreensController.pegarCena("Entrar"));
                stage.show();
                break;
            case "Cadastrar":
                stage.setScene(ScreensController.pegarCena("Cadastrar"));
                stage.show();
                break;
            case "Exibir":
                stage.setScene(ScreensController.pegarCena("Exibir"));
                stage.show();
                break;
            case "ADM":
                stage.setScene(ScreensController.pegarCena("ADM"));
                stage.show();
                break;
            case "CriarViagem":
                stage.setScene(ScreensController.pegarCena("CriarViagem"));
                stage.show();
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}