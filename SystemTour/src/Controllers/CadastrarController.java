package Controllers;


import javafx.fxml.FXML;
import sample.Main;

public class CadastrarController {
    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Menu");
        Main.trocaTela("Entrar");
    }
}
