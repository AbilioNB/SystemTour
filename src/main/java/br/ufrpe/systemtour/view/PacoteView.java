package view;

import javafx.scene.control.Alert;

public class PacoteView {

    public static void mensagemAlerta(String cpf){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ARENÇÃO");
        alert.setHeaderText(null);
        alert.setContentText("O CPF: "+ cpf +" Não tem nenhum pacote vinculado");
        alert.showAndWait();
    }
}
