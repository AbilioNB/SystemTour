package br.ufrpe.systemtour.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import br.ufrpe.systemtour.sample.Main;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController  {

    @FXML
    private javafx.scene.control.Button closeButton;

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
        Main.trocaTela("Pagamento");
    }

    public void buttonFinanceiro(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Financeiro");
    }

    @FXML
    protected void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
