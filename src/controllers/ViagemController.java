package controllers;

import business.ViagemBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Viagem;
import sample.Main;
import view.ViagemView;
import java.io.IOException;
import java.util.UUID;

public class ViagemController {

    @FXML
    private TextField origemViagem, destinoViagem, descricaoViagem, vagasViagem, dataPartidaViagem, dataChegadaViagem, unitarioViagem;

    @FXML
    protected void buttonEnviar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");

        Viagem bufferViagem = new Viagem();
        ViagemBusiness vb = new ViagemBusiness();
        ViagemView vv = new ViagemView();

        bufferViagem.setOrigem(origemViagem.getText());
        bufferViagem.setDestino(destinoViagem.getText());
        bufferViagem.setDescricao(descricaoViagem.getText());

        String vagas = vagasViagem.getText();
        try{
            int q = Integer.parseInt(vagas);
            bufferViagem.setQtVagas(q);
        }catch (NumberFormatException e){
            vv.mensagemErroVaga();
            return;
        }

        bufferViagem.setPartida(dataPartidaViagem.getText());
        bufferViagem.setChegada(dataChegadaViagem.getText());

        String valorUnitario = unitarioViagem.getText();
        try{
            int valorUni = Integer.parseInt(valorUnitario);
            bufferViagem.setValor(valorUni);
        }catch (NumberFormatException e){
            vv.mensagemErroValorUnitario();
            return;
        }

        UUID gerarId = UUID.randomUUID();
        String id = String.valueOf(gerarId);
        bufferViagem.setId(id);
        bufferViagem.setAtivo(1);

        vb.validarViagem(bufferViagem);

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
