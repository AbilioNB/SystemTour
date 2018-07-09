package Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.beans.Cliente;
import model.persistence.ClienteDAO;
import sample.Main;


public class CadastrarController{

    @FXML
    private TextField nomeCadastro, emailCadastro, cpfCadastro, idadeCadastro, telefoneCadastro;
    private boolean valorEmail, valorCPF, valorTel;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Menu");
        Main.trocaTela("Entrar");

        String nome = nomeCadastro.getText();
        String email = emailCadastro.getText();
        String cpf = cpfCadastro.getText();
        String idade = idadeCadastro.getText();
        String telefone = telefoneCadastro.getText();

        valorEmail = Cliente.validarEmail(email);
        if(valorEmail != true){
            Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("E-mail errado!");
            dialogoInfo.setHeaderText("Provavelmente você digitou seu e-mail errado");
            dialogoInfo.setContentText("Tente informar um e-mail que funcione desta vez, okay? :D");
            dialogoInfo.showAndWait();
        }
        valorTel = Cliente.validarTel(telefone);
        if (valorTel != true){
            Alert info = new Alert(Alert.AlertType.ERROR);
            info.setTitle("Telefone Invalido!");
            info.setHeaderText("Você digitou um telefone invalido!");
            info.setContentText("Tente informar um telefone neste formato: (XX)XXXXX-XXXX");
            info.showAndWait();
        }

        valorCPF = Cliente.validarCPF(cpf);
        if(valorCPF != true){
            Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("CPF errado!");
            dialogoInfo.setHeaderText("Provavelmente você digitou seu CPF errado");
            dialogoInfo.setContentText("Tente informar um CPF que funcione desta vez, okay? :D");
            dialogoInfo.showAndWait();
        }

        if(valorCPF == true && valorTel == true && valorEmail == true){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastrado!");
            alert.setHeaderText(null);
            alert.setContentText("O cliente foi cadastrado com sucesso!");
            alert.showAndWait();
            Main.CadastrarCliente(nome, email, cpf, idade, telefone);
        }
    }
}