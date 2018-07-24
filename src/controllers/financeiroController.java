package controllers;

import javafx.fxml.FXML;
import sample.Main;

import java.io.IOException;

public class financeiroController {
    @FXML
    protected void buttonEfetuar(javafx.event.ActionEvent actionEvent)throws IOException{
        Main.trocaTela("Pagar");
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
