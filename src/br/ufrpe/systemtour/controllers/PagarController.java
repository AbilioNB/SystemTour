package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.PagarBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Pagamento;
import sample.Main;

import java.io.IOException;
import java.util.Random;

public class PagarController {
    @FXML
    TextField valorFinanceiro, dataFinanceiro;

    VenderPacoteController vpc = new VenderPacoteController();
    PagarBusiness pb = new PagarBusiness();

    @FXML
    protected void buttonPagar(javafx.event.ActionEvent actionEvent)throws IOException {

            Main.trocaTela("Entrar");
            Pagamento bufferPagamento = new Pagamento();
            bufferPagamento.setCpfDoPagante("qualquerCPF");
            bufferPagamento.setDataDoRecebimento(dataFinanceiro.getText());
            bufferPagamento.setValorRecebido(Double.parseDouble(valorFinanceiro.getText()));
            Random gerarId = new Random();
            int geradorId = gerarId.nextInt(10001);
            String id = Integer.toString(geradorId);
            bufferPagamento.setId(id);
            pb.validarPagamento(bufferPagamento);

    }
}
