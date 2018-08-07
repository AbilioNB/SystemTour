package br.ufrpe.systemtour.controllers;

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
    private static Scene financeiro;
    private static Scene pagarScene;
    private static Scene venderScene;
    private static Scene pagamentoScene;


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
                Parent fxmlCadViagem = FXMLLoader.load(ScreensController.class.getResource("/CadViagens.fxml"));
                cadViagem = new Scene(fxmlCadViagem);
                return cadViagem;
            case "Financeiro":
                Parent fxmlFinanceiro = FXMLLoader.load(ScreensController.class.getResource("/financeiro.fxml"));
                financeiro = new Scene(fxmlFinanceiro);
                return financeiro;
            case "Pagar":
                Parent fxmlPagar = FXMLLoader.load(ScreensController.class.getResource("/pagar.fxml"));
                pagarScene = new Scene(fxmlPagar);
                return pagarScene;
            case "Vender":
                Parent fxmlVender = FXMLLoader.load(ScreensController.class.getResource("/venderPacote.fxml"));
                venderScene = new Scene(fxmlVender);
                return venderScene;
            case "Pagamento":
                Parent fxmlPagamento = FXMLLoader.load(ScreensController.class.getResource("/exibirPacotes.fxml"));
                pagamentoScene = new Scene(fxmlPagamento);
                return pagamentoScene;

        }
        return null;
    }
}
