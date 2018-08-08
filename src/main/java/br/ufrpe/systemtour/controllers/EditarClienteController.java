package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.sample.Main;
import javafx.event.ActionEvent;

import java.io.IOException;

public class EditarClienteController {
    public void cadastrarButton(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Exibir");
    }

    public void buttonVoltar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Exibir");
    }
}
