package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.sample.Main;
import javafx.event.ActionEvent;

import java.io.IOException;

public class EditarViagemController {
    public void buttonVoltar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("CriarViagem");
    }

    public void buttonEditar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("CriarViagem");
    }
}
