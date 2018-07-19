package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Cliente;
import sample.Main;

import java.io.IOException;

public class CadastrarController{

    @FXML
    private TextField nomeCadastro, emailCadastro, cpfCadastro, dataCadastro, telefoneCadastro;
    public boolean retorno;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) throws IOException {

        System.out.println("Menu");
        Main.trocaTela("Entrar");

        Cliente buffer = new Cliente();

        ClienteController cc = new ClienteController();

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