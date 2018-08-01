package controllers;

import business.VenderPacoteBusiness;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.beans.Pacote;
import sample.Main;

import java.io.IOException;
import java.util.Random;

public class VenderPacoteController {

    @FXML
    TextField desconto, qtdClientes, cpfTitular, valorDespesa;

    VenderPacoteBusiness vpb = new VenderPacoteBusiness();

    @FXML
    protected void buttonVoltar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("CriarViagem");
    }

    @FXML
    protected void buttonEnviar(ActionEvent actionEvent) throws IOException {
        boolean check;

        Pacote buffer = new Pacote();

        buffer.setTaxaDesconto(Double.parseDouble(desconto.getText()));

        String despesa = valorDespesa.getText();
        try{
            int despesavalor = Integer.parseInt(despesa);
            buffer.setDespesa(despesavalor);
        }catch (NumberFormatException e){}


        String vagas = qtdClientes.getText();
        try{
            int q = Integer.parseInt(vagas);
            buffer.setQtdClientes(q);
        }catch (NumberFormatException e){}

        buffer.setCpfTitular(cpfTitular.getText());


        check = vpb.validarPacote(buffer);
        if(check == true){
            Main.trocaTela("Entrar");
            Random gerarId = new Random();
            int geradorId = gerarId.nextInt(101);
            String id = Integer.toString(geradorId);
            buffer.setIdPassar(geradorId);
            System.out.println(buffer.getid());
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