package controllers;

import business.AdministradorBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.Main;
import view.AdministradorView;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField admROOT, senhaROOT;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) throws IOException {

        AdministradorBusiness ab = new AdministradorBusiness();
        AdministradorView av = new AdministradorView();

        String loginroot = admROOT.getText();
        String senharoot = senhaROOT.getText();

        try{
            ab.validarRoot(loginroot, senharoot);
            Main.trocaTela("Entrar");
        }catch (NullPointerException e){
            av.mensagemErroLogin();
        }
    }
}
