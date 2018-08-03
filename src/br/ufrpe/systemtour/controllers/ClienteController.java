package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.ClienteBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Cliente;
import sample.Main;
import java.io.IOException;

public class ClienteController {

    @FXML
    private TextField nomeCadastro, emailCadastro, cpfCadastro, dataCadastro, telefoneCadastro;

    ClienteBusiness cb = new ClienteBusiness();

    @FXML
    protected void cadastrarCliente(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");

        Cliente buffer = new Cliente();

        buffer.setNome(nomeCadastro.getText());
        buffer.setEmail(emailCadastro.getText());
        buffer.setCpf(cpfCadastro.getText());
        buffer.setData(dataCadastro.getText());
        buffer.setTelefone(telefoneCadastro.getText());

        cb.validarCliente(buffer);
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException{
        Main.trocaTela("Entrar");
    }
}