package view;

import javafx.scene.control.Alert;

public class ClienteView {

    public void mensagemErro(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("Provavelmente você digitou alguma informação errada, cheque os itens a seguir:");
        dialogoInfo.setContentText("E-mail, CPF: 00000000000, Telefone:(00)99999-9999, Data de Nascimento: DD/MM/AAAA");
        dialogoInfo.showAndWait();
    }

    public void mensagemCadastrado(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastrado!");
        alert.setHeaderText(null);
        alert.setContentText("O cliente foi cadastrado com sucesso!");
        alert.showAndWait();
    }
    public static void mensagemRemover(String nome){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Removido!");
        alert.setHeaderText(null);
        alert.setContentText("O cliente "+ nome +" foi removido com sucesso!");
        alert.showAndWait();
    }

}
