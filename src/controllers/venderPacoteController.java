package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sample.Main;
import controllers.ViagemController;

import java.io.IOException;

public class venderPacoteController {

    @FXML
    protected void buttonVoltar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }

    @FXML
    protected void buttonEnviar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }

    @FXML
    protected void buttonTestar(ActionEvent actionEvent) {
        System.out.println(ViagemController.getDestinoPassar());
        System.out.println(ViagemController.getDataPassar());
        System.out.println(ViagemController.getVagasPassar());
        System.out.println(ViagemController.getValorPassar());
        System.out.println(ViagemController.getIdPassar());
    }
}
