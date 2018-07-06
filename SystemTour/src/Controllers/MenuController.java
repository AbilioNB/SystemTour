package Controllers;

import javafx.fxml.FXML;
import sample.Main;

public class MenuController  {

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Cadastrando");
        Main.trocaTela("Cadastrar");
    }
}
