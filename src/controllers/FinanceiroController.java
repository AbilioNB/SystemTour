package controllers;

import business.FinanceiroBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Financeiro;
import sample.Main;
import java.io.IOException;

public class FinanceiroController {

    @FXML
    TextField cpfFinanceiro, contratoFinanceiro, valorFinanceiro, dataFinanceiro;

    FinanceiroBusiness fb = new FinanceiroBusiness();

    @FXML
    protected void buttonEfetuar(javafx.event.ActionEvent actionEvent)throws IOException{

        Financeiro bufferFinanceiro = new Financeiro();

        bufferFinanceiro.setCpfCon(cpfFinanceiro.getText());
        bufferFinanceiro.setNumeroContrato(contratoFinanceiro.getText());
        bufferFinanceiro.setValorPago(valorFinanceiro.getText());
        bufferFinanceiro.setDataPagamento(dataFinanceiro.getText());



        boolean check;

        check = fb.validar(bufferFinanceiro);
        if(check == false){
            Main.trocaTela("Pagar");
        }else{
            System.out.println("hello");
        }
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
