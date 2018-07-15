package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sample.Main;

public class MenuController  {

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        Main.trocaTela("Cadastrar");
    }
    @FXML
    protected void buttonExibir (javafx.event.ActionEvent actionEvent){
        Main.trocaTela("Exibir");
    }
    @FXML
    protected void buttonADM(javafx.event.ActionEvent actionEvent){
        Main.trocaTela("ADM");
    }
}
