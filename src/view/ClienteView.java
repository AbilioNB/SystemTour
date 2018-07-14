package view;

import javafx.scene.control.Alert;
import model.persistence.ClienteDAO;

public class ClienteView {

    public void mensagemErro(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("Provavelmente você digitou alguma informação errada, cheque os itens a seguir:");
        dialogoInfo.setContentText("E-mail, CPF, Telefone");
        dialogoInfo.showAndWait();
    }

    public void mensagemCadastrado(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastrado!");
        alert.setHeaderText(null);
        alert.setContentText("O cliente foi cadastrado com sucesso!");
        alert.showAndWait();
    }

}
