package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.AdministradorBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Administrador;
import sample.Main;

import java.io.IOException;

public class AdministradorController {
    @FXML
    private TextField loginADM, senhaADM, nomeADM, emailADM, cpfADM, telefoneADM, dataADM;

    AdministradorBusiness ab = new AdministradorBusiness();

    @FXML
    protected void cadastrarAdministrador() throws IOException {
        Main.trocaTela("Entrar");

        Administrador bufferADM = new Administrador();

        bufferADM.setLogin(loginADM.getText());
        bufferADM.setSenha(senhaADM.getText());
        bufferADM.setNome(nomeADM.getText());
        bufferADM.setEmail(emailADM.getText());
        bufferADM.setCpf(cpfADM.getText());
        bufferADM.setTelefone(telefoneADM.getText());
        bufferADM.setData(dataADM.getText());

        ab.validarAdmnistrador(bufferADM);
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
