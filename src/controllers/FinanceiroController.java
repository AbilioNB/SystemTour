package controllers;

import business.FinanceiroBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Financeiro;
import model.persistence.ClienteDAO;
import sample.Main;
import java.io.IOException;
import java.util.Set;

public class FinanceiroController {

    @FXML
    TextField cpfFinanceiro, contratoFinanceiro, valorFinanceiro, dataFinanceiro;

    FinanceiroBusiness fb = new FinanceiroBusiness();

    @FXML
    protected void buttonEfetuar(javafx.event.ActionEvent actionEvent)throws IOException{

        Financeiro bufferFinanceiro = new Financeiro();

        boolean check;

        bufferFinanceiro.setCpfContrato(cpfFinanceiro.getText());
        bufferFinanceiro.setNumeroContrato(contratoFinanceiro.getText());

        Set<String> cpf = ClienteDAO.retornaCPF();
        check = fb.validarFinanceiro(bufferFinanceiro, cpf);

        if(check == true){
            Main.trocaTela("Pagar");
        }

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
