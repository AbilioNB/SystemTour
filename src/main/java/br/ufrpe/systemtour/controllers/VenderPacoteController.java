package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.VenderPacoteBusiness;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import br.ufrpe.systemtour. model.beans.Pacote;
import br.ufrpe.systemtour.sample.Main;

import java.io.IOException;

public class VenderPacoteController {

    @FXML
    TextField desconto, qtdClientes, cpfTitular, valorParcelas;

    VenderPacoteBusiness vpb = new VenderPacoteBusiness();

    @FXML
    protected void buttonVoltar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("CriarViagem");
    }

    @FXML
    protected void buttonEnviar(ActionEvent actionEvent) throws IOException {
        boolean check;

        Pacote buffer = new Pacote();

        buffer.setDestinoPassar(ViagemController.getDestinoPassar());

        buffer.setTaxaDesconto(Double.parseDouble(desconto.getText()));

        String parcelas = valorParcelas.getText();
        int parcelasvalor = Integer.parseInt(parcelas);
        buffer.setParcelas(parcelasvalor);



        String vagas = qtdClientes.getText();
        try{
            int q = Integer.parseInt(vagas);
            buffer.setQtdClientes(q);
        }catch (NumberFormatException e){}

        buffer.setCpfTitular(cpfTitular.getText());




        check = vpb.salvarPacote(buffer, ViagemController.getValorPassar());

        if(check == true){
            Main.trocaTela("Entrar");
        }
    }

    @FXML
    protected void buttonTestar(ActionEvent actionEvent) {
        System.out.println("Viagem para: " + ViagemController.getDestinoPassar());
        System.out.println("Data de partida: " + ViagemController.getDataPassar());
        System.out.println("Quantidade de vagas: " + ViagemController.getVagasPassar());
        System.out.println("Valor Unitério: " + ViagemController.getValorPassar());
        System.out.println("Id da viagem: " + ViagemController.getIdPassar());
    }
}