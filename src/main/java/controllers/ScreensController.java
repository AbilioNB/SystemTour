package controllers;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.lang.String;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensController {
    private static Stage stage;
    private static Scene menuScane;
    private static Scene cadastroScane;
    private static Scene exibirScane;
    private static Scene cadAdmScene;
    private static Scene cadViagem;


    public static Scene pegarCena(String scene) throws IOException {
        switch (scene){
            case "Entrar":
                Parent fxmlMenu = FXMLLoader.load(ScreensController.class.getResource("/menu.fxml"));
                menuScane = new Scene(fxmlMenu);
                return menuScane;
            case "Cadastrar":
                Parent fxmlCadastro = FXMLLoader.load(ScreensController.class.getResource("/cadastrar.fxml"));
                cadastroScane = new Scene(fxmlCadastro);
                return cadastroScane;
            case "Exibir":
                Parent fxmlExibir = FXMLLoader.load(ScreensController.class.getResource("/exibirClientes.fxml"));
                exibirScane = new Scene(fxmlExibir);
                return exibirScane;
            case "ADM":
                Parent fxmlCadAdm = FXMLLoader.load(ScreensController.class.getResource("/cadAdm.fxml"));
                cadAdmScene = new Scene(fxmlCadAdm);
                return cadAdmScene;
            case "CriarViagem":
                Parent fxmlCadViagem = FXMLLoader.load(ScreensController.class.getResource("/cadViagens.fxml"));
                cadViagem = new Scene(fxmlCadViagem);
                return cadViagem;
        }
        return null;
    }
}
