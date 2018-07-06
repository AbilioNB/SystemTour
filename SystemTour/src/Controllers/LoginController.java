package Controllers;

import javafx.fxml.FXML;
import sample.Main;



public class LoginController {
    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Entrou");
        Main.trocaTela("Entrar");
    }
}
