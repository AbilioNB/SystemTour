package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.beans.Pacote;
import model.persistence.PacoteDAO;
import sample.Main;
import view.PacoteExibir;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ExibirPacotesController implements Initializable {

    @FXML
    private javafx.scene.control.TableView<PacoteExibir> pTable;
    @FXML
    private TableColumn<PacoteExibir, String> pDestino;
    @FXML
    private TableColumn<PacoteExibir, Double> pValor;
    @FXML
    private TableColumn<PacoteExibir, Integer> pParcelas;
    @FXML
    private TableColumn<PacoteExibir, Double> pTotal;
    @FXML
    private TableColumn<PacoteExibir, Integer> pId;

    @FXML
    TextField cpfBucarEx;

    private List<PacoteExibir> ListPacote = new ArrayList();
    private ObservableList<PacoteExibir> observableListPacote;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pTable.getSelectionModel().selectedItemProperty().addListener((
                observable, oldValue, newValue)-> pacoteSelecionado(newValue));
    }
    public void pacoteSelecionado(PacoteExibir pacote){
        if (pacote != null){
            System.out.println("O Pacote " + pacote.getDestinoEx() + " foi selecionado");
        }
    }
    public void carregarListaPacote(){

        pDestino.setCellValueFactory(new PropertyValueFactory<>("destinoEx"));
        pValor.setCellValueFactory(new PropertyValueFactory<>("valorParcelaEx"));
        pParcelas.setCellValueFactory(new PropertyValueFactory<>("qtRestanteEx"));
        pTotal.setCellValueFactory(new PropertyValueFactory<>("valorTotalEx"));
        pId.setCellValueFactory(new PropertyValueFactory<>("idEx"));

        for (Pacote buffer: PacoteDAO.pegarPacote()){
            if (cpfBucarEx.getText().equals(buffer.getCpfTitular())){
                PacoteExibir v1 = new PacoteExibir(buffer.getDestinoPassar(), buffer.getValorParcelado(), buffer.getParcelas(), buffer.getValorTotal(), buffer.getidPassar());
                ListPacote.add(v1);
            }
        }



        observableListPacote = FXCollections.observableArrayList(ListPacote);

        pTable.setItems(observableListPacote);
    }

    public void buttonPagar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Pagar");
    }

    public void buttonMenu(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }

    public void buttonBuscar(ActionEvent actionEvent) {
        carregarListaPacote();
    }
}
