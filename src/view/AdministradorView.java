package view;

import javafx.scene.control.Alert;

public class AdministradorView {

    public void mensagemErro(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("Provavelmente você digitou alguma informação errada, cheque os itens a seguir:");
        dialogoInfo.setContentText("Login, E-mail, CPF {000.000.000-00}, Telefone {(00)99999-9999}, Data de Nascimento {DD/MM/AAAA}");
        dialogoInfo.showAndWait();
    }

    public void mensagemCadastro(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastrado!");
        alert.setHeaderText(null);
        alert.setContentText("O Administrador foi cadastrado com sucesso!");
        alert.showAndWait();

    }

    public void mensagemErroLogin(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login errado");
        alert.setHeaderText("Seu Login já está sendo usado por outro usuário");
        alert.setContentText("Insira outro");
        alert.showAndWait();
    }

}
