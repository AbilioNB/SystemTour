package controllers;

import javafx.fxml.FXML;
import sample.Main;

import java.io.IOException;

public class pagarController {
    @FXML
    protected void buttonPagar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
