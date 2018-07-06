package Controllers;

import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import model.beans.Cliente;
import sample.Main;

import java.util.HashMap;



public class CadastrarController {

    @FXML
    private TextField campoNome;


    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Menu");
        Main.trocaTela("Entrar");
  
    }






}
