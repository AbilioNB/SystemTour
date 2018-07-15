package Controllers;

import business.ClienteBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Cliente;
import sample.Main;

public class CadastrarController{

    @FXML
    private TextField nomeCadastro, emailCadastro, cpfCadastro, dataCadastro, telefoneCadastro;
    public boolean retorno;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {

        System.out.println("Menu");
        Main.trocaTela("Entrar");

        Cliente buffer = new Cliente();

        ClienteController cc = new ClienteController();
        ClienteBusiness cb = new ClienteBusiness();

        buffer.setNome(nomeCadastro.getText());
        buffer.setEmail(emailCadastro.getText());
        buffer.setCpf(cpfCadastro.getText());
        buffer.setData(dataCadastro.getText());
        buffer.setTelefone(telefoneCadastro.getText());

        retorno = cc.cadastrarCliente(buffer);

        if(retorno == true){

            nomeCadastro.clear();
            emailCadastro.clear();
            cpfCadastro.clear();
            dataCadastro.clear();
            telefoneCadastro.clear();
        }
    }
}