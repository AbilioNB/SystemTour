package controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class MenuController  {

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Cadastrar");
    }
    @FXML
    protected void buttonExibir (javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Exibir");
    }
    @FXML
    protected void buttonADM(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("ADM");
    }
    @FXML
    protected void buttonCadViagem(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("CriarViagem");
    }
    @FXML
    protected void buttonPagar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Financeiro");
    }
}
