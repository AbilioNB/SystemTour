package Controllers;

import javafx.fxml.FXML;
import sample.Main;

public class ExibirController {
    @FXML
    protected void buttonVoltar (javafx.event.ActionEvent actionEvent){
        System.out.println("Retornando ao Menu");
        Main.trocaTela("Entrar");
    }
    @FXML
    protected void buttonExcluir (javafx.event.ActionEvent actionEvent){
        System.out.println("Excluindo");
       // Main.trocaTela("");
    }
    @FXML
    protected void buttonEditar (javafx.event.ActionEvent actionEvent){
        System.out.println("Editando");
       // Main.trocaTela("");
    }
}
