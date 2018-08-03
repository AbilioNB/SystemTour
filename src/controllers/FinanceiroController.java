package controllers;

import sample.Main;
import systemtour.FinanceiroBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FinanceiroController {

    @FXML
    TextField cpfFinanceiro, contratoFinanceiro, valorFinanceiro, dataFinanceiro;

    FinanceiroBusiness fb = new FinanceiroBusiness();

    @FXML
    protected void buttonEfetuar(javafx.event.ActionEvent actionEvent)throws IOException{
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
