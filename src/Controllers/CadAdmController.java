package Controllers;

import business.AdministradorBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Administrador;
import sample.Main;

public class CadAdmController {
    @FXML
    private TextField loginADM, senhaADM, nomeADM, emailADM, cpfADM, telefoneADM, dataADM;
    Boolean retornoADM;

    @FXML
    protected void buttonEnviar(javafx.event.ActionEvent actionEvent){
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
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent){
        Main.trocaTela("Entrar");
    }
}
