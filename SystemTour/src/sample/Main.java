package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {
    private static Stage stage;
    private static Scene loginScane;
    private static Scene menuScane;
    private static Scene cadastroScane;
    private static Scene exibirScane;
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
        Parent fxmlExibir = FXMLLoader.load(getClass().getResource("exibirClientes.fxml"));
        exibirScane = new Scene(fxmlExibir, 300, 400);

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
            case "Exibir":
                stage.setScene(exibirScane);
        }
    }

    public static void CadastrarCliente(String nome, String email, String cpf, String idade, String telefone){

    }


    public static void main(String[] args) {
        launch(args);
    }
}