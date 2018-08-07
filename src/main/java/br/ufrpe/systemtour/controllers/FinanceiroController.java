package br.ufrpe.systemtour.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import br.ufrpe.systemtour.sample.Main;
import br.ufrpe.systemtour.model.beans.Pagamento;
import br.ufrpe.systemtour.model.persistence.PagamentoDAO;
import javafx.fxml.FXML;
import view.PagamentoExibir;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FinanceiroController implements Initializable {

    @FXML
    private javafx.scene.control.TableView<PagamentoExibir> tablePagamento;
    @FXML
    private TableColumn<PagamentoExibir, String> cpfPagamento;
    @FXML
    private TableColumn<PagamentoExibir, Double> valorPagamento;
    @FXML
    private TableColumn<PagamentoExibir, String> dataPagamento;
    @FXML
    private TableColumn<PagamentoExibir, String> idPagamento;

    private List<PagamentoExibir> ListPagamento = new ArrayList();
    private ObservableList<PagamentoExibir> observableListPagamento;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarListPagamento();
    }
    public void carregarListPagamento(){

        cpfPagamento.setCellValueFactory(new PropertyValueFactory<>("cpfDoPaganteEx"));
        valorPagamento.setCellValueFactory(new PropertyValueFactory<>("valorRecebidoEx"));
        dataPagamento.setCellValueFactory(new PropertyValueFactory<>("dataRecebimentoEx"));
        idPagamento.setCellValueFactory(new PropertyValueFactory<>("idPagamentoEx"));


        for (Pagamento buffer: PagamentoDAO.pegarPagamento()){
            PagamentoExibir v1 = new PagamentoExibir(buffer.getCpfDoPagante(), buffer.getValorRecebido(), buffer.getDataDoRecebimento(), buffer.getId());
            ListPagamento.add(v1);
        }
        observableListPagamento = FXCollections.observableArrayList(ListPagamento);

        tablePagamento.setItems(observableListPagamento);

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent)throws IOException {
        Main.trocaTela("Entrar");
    }
}
