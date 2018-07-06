package Controllers;

import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.beans.Cliente;
import sample.Main;
public class CadastrarController{
    @FXML
    private TextField nomeCadastro, emailCadastro, cpfCadastro, idadeCadastro, telefoneCadastro;
    private boolean valorEmail, valorCPF;
    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Menu");
        Main.trocaTela("Entrar");
  
    }
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

        valorCPF = Cliente.validarCPF(cpf);

        if(valorCPF == true){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastrado!");
            alert.setHeaderText(null);
            alert.setContentText("O cliente foi cadastrado com sucesso!");
            alert.showAndWait();
        }else{
            Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("CPF errado!");
            dialogoInfo.setHeaderText("Provavelmente você digitou seu CPF errado");
            dialogoInfo.setContentText("Tente informar um CPF que funcione desta vez, okay? :D");
            dialogoInfo.showAndWait();
        }

        Main.CadastrarCliente(nome,email,cpf,idade,telefone);
    }
}

