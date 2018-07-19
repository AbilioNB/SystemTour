package controllers;

import javafx.fxml.FXML;
import sample.Main;

import java.io.IOException;

public class CadViagensController {
    @FXML
    protected void buttonEnviar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
