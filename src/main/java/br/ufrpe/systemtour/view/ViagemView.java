package view;

import javafx.scene.control.Alert;

public class ViagemView {

    public void mensagemErroVaga(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("A quantidade de vagas não pode ser nula");
        dialogoInfo.setContentText("Insira uma quantidade de vagas válida");
        dialogoInfo.showAndWait();
    }

    public void mensagemErroValorUnitario(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("O valor não pode ser nulo");
        dialogoInfo.setContentText("Insira um valor válido");
        dialogoInfo.showAndWait();
    }

    public void mensagemErroData(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("Digite uma data correta");
        dialogoInfo.setContentText("Formato: DD/MM/AAAA");
        dialogoInfo.showAndWait();
    }

    public void mensagemErroOrigemeDestino(){
        Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
        dialogoInfo.setTitle("Informação errada!");
        dialogoInfo.setHeaderText("O endereço de origem e/ou destino não podem ser nulos");
        dialogoInfo.setContentText("Insira uma origem ou destino válidos");
        dialogoInfo.showAndWait();
    }
    public static void mensagemRemover(String nome){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Removido!");
        alert.setHeaderText(null);
        alert.setContentText("A viagem para "+ nome +" foi removida com sucesso!");
        alert.showAndWait();
    }

}
