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
    private boolean valorEmail, valorCPF, valorTel, valorIdade = true;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Menu");
        Main.trocaTela("Entrar");

        Cliente buffer = new Cliente();

        buffer.setNome(nomeCadastro.getText());
        buffer.setEmail(emailCadastro.getText());
        buffer.setCpf(cpfCadastro.getText());
        buffer.setTelefone(telefoneCadastro.getText());

        valorEmail = Cliente.validarEmail(buffer.getEmail());
        if(valorEmail != true){
            Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("E-mail errado!");
            dialogoInfo.setHeaderText("Provavelmente você digitou seu e-mail errado");
            dialogoInfo.setContentText("Tente informar um e-mail que funcione desta vez, okay? :D");
            dialogoInfo.showAndWait();
        }
        valorTel = Cliente.validarTel(buffer.getTelefone());
        if (valorTel != true){
            Alert info = new Alert(Alert.AlertType.ERROR);
            info.setTitle("Telefone Invalido!");
            info.setHeaderText("Você digitou um telefone invalido!");
            info.setContentText("Tente informar um telefone neste formato: (XX)XXXXX-XXXX");
            info.showAndWait();
        }

        valorCPF = Cliente.validarCPF(buffer.getCpf());
        if(valorCPF != true){
            Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("CPF errado!");
            dialogoInfo.setHeaderText("Provavelmente você digitou seu CPF errado");
            dialogoInfo.setContentText("Tente informar um CPF que funcione desta vez, okay? :D");
            dialogoInfo.showAndWait();
        }

        if(valorCPF == true && valorTel == true && valorEmail == true && valorIdade == true){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastrado!");
            alert.setHeaderText(null);
            alert.setContentText("O cliente foi cadastrado com sucesso!");
            ClienteDAO.salvarCliente(buffer);
            alert.showAndWait();

////////////////////////////////////////////////////////////////
/////////ARRUMAR A QUESTÃO DA DATA!!!!!!!!/////////////////////
//////////////////////////////////////////////////////////////

            nomeCadastro.clear();
            emailCadastro.clear();
            cpfCadastro.clear();
            telefoneCadastro.clear();
        }
    }
}