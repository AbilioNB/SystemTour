package Controllers;

import javafx.fxml.FXML;
import sample.Main;

public class CadAdmController {
    @FXML
    protected void buttonEnviar(javafx.event.ActionEvent actionEvent){
        Main.trocaTela("");
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent){
        Main.trocaTela("Entrar");
    }
}
