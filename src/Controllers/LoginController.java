package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.Main;

public class LoginController {

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
            Main.trocaTela("Entrar");
    }
}
