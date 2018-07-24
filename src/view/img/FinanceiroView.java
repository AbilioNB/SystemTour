package view.img;

import javafx.scene.control.Alert;

public class FinanceiroView {

    public void erroContratoCliente(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("CPF ou número de contrato errado(s)");
        alert.setHeaderText(null);
        alert.setContentText("Cheque novamente o CPF e o número de contrato");
        alert.showAndWait();
    }

}
