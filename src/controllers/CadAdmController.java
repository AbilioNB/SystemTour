package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Administrador;
import sample.Main;

import java.io.IOException;

public class CadAdmController {
    @FXML
    private TextField loginADM, senhaADM, nomeADM, emailADM, cpfADM, telefoneADM, dataADM;
    Boolean retornoADM, retornoROOT;

    public void rootADMCADASTRO(){
        Administrador bufferROOT = new Administrador();
        AdministradorController validarROOT = new AdministradorController();

        bufferROOT.setLogin("admin");
        bufferROOT.setSenha("admin");
        bufferROOT.setEmail("@");
        bufferROOT.setCpf("82242475118");
        bufferROOT.setTelefone("(81)99999-9999");
        bufferROOT.setData("03/06/1099");

        retornoROOT = validarROOT.CadastrarAdminitrador(bufferROOT);
    }

    @FXML
    protected void buttonEnviar() throws IOException {
        Main.trocaTela("Entrar");

        Administrador bufferADM = new Administrador();
        AdministradorController ac = new AdministradorController();

        bufferADM.setLogin(loginADM.getText());
        bufferADM.setSenha(senhaADM.getText());
        bufferADM.setNome(nomeADM.getText());
        bufferADM.setEmail(emailADM.getText());
        bufferADM.setCpf(cpfADM.getText());
        bufferADM.setTelefone(telefoneADM.getText());
        bufferADM.setData(dataADM.getText());

        retornoADM = ac.CadastrarAdminitrador(bufferADM);

        if(retornoADM == true){
            loginADM.clear();
            senhaADM.clear();
            nomeADM.clear();
            emailADM.clear();
            cpfADM.clear();
            telefoneADM.clear();
            dataADM.clear();
        }

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
