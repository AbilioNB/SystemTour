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
        primaryStage.setTitle("System Tour");

        Parent fxmllogin = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
        loginScane = new Scene(fxmllogin);

        primaryStage.setScene(loginScane);
        primaryStage.show();

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
            case "Financeiro":
                stage.setScene(ScreensController.pegarCena("Financeiro"));
                stage.show();
                break;
            case "Pagar":
                stage.setScene(ScreensController.pegarCena("Pagar"));
                stage.show();
                break;
            case "Vender":
                stage.setScene(ScreensController.pegarCena("Vender"));
                stage.show();
                break;
            case "Pagamento":
                stage.setScene(ScreensController.pegarCena("Pagamento"));
                stage.show();
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}