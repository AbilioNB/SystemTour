package controllers;

import business.FinanceiroBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Financeiro;
import model.persistence.ClienteDAO;
import sample.Main;
import view.FinanceiroView;

import java.io.IOException;
import java.util.Set;

public class FinanceiroController {

    @FXML
    TextField cpfFinanceiro, contratoFinanceiro, valorFinanceiro, dataFinanceiro;

    FinanceiroBusiness fb = new FinanceiroBusiness();

    @FXML
    protected void buttonEfetuar(javafx.event.ActionEvent actionEvent)throws IOException{

        boolean check;

        Financeiro bufferFinanceiro = new Financeiro();
        FinanceiroView fv  = new FinanceiroView();

        try {
            bufferFinanceiro.setCpfContrato(cpfFinanceiro.getText());
            bufferFinanceiro.setNumeroContrato(contratoFinanceiro.getText());
            check = fb.validarFinanceiro(bufferFinanceiro);
            if(check == true){
                System.out.println("teste");
                Main.trocaTela("Pagar");
            }else{
                System.out.println("aaaaaaaaaaaaaaaaaaaaa");
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            fv.erroContratoCliente();
        }
    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
