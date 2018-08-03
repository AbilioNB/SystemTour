package br.ufrpe.systemtour.controllers;

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

//    public static String cpf;
//
//    public static String getCpf() {
//        cpf = cpfBucarEx.getText();
//        return cpf;
//    }


    private static String destinoPass;
    private static Double valorPass;
    private static int parcelaPass;
    private static Double totalPass;
    private static String idPass;

    private boolean chave = true;

    public static String getDestinoPass() {
        return destinoPass;
    }
    public void setDestinoPass(String destinoPass) {
        this.destinoPass = destinoPass;
    }
    public static Double getValorPass() {
        return valorPass;
    }
    public void setValorPass(Double valorPass) {
        this.valorPass = valorPass;
    }
    public static int getParcelaPass() {
        return parcelaPass;
    }
    public void setParcelaPass(int parcelaPass) {
        this.parcelaPass = parcelaPass;
    }
    public static Double getTotalPass() {
        return totalPass;
    }
    public void setTotalPass(Double totalPass) {
        this.totalPass = totalPass;
    }
    public static String getIdPass() {
        return idPass;
    }
    public void setIdPass(String idPass) {
        this.idPass = idPass;
    }

    private List<PacoteExibir> ListPacote = new ArrayList();
    private ObservableList<PacoteExibir> observableListPacote;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pTable.getSelectionModel().selectedItemProperty().addListener((
                observable, oldValue, newValue)-> pacoteSelecionado(newValue));
    }
    public void pacoteSelecionado(PacoteExibir pacote){
        if (pacote != null){
            setDestinoPass(pacote.getDestinoEx());
            setParcelaPass(pacote.getQtRestanteEx());
            setValorPass(pacote.getValorParcelaEx());
            setTotalPass(pacote.getValorTotalEx());
            setIdPass(pacote.getIdEx());
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
            if (cpfBucarEx.getText().equals(buffer.getCpfTitular()) && buffer.getParcelas() > 0){
                PacoteExibir v1 = new PacoteExibir(buffer.getDestinoPassar(), buffer.getValorParcelado(), buffer.getParcelas(), buffer.getValorTotal(), buffer.getidPassar());
                ListPacote.add(v1);
            }
        }
        observableListPacote = FXCollections.observableArrayList(ListPacote);
        pTable.setItems(observableListPacote);
    }

    public void buttonPagar(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Pagar");
        System.out.println(getDestinoPass());
        System.out.println(getValorPass());
        System.out.println(getParcelaPass());
        System.out.println(getTotalPass());
        System.out.println(getIdPass());
    }

    public void buttonMenu(ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }

    public void buttonBuscar(ActionEvent actionEvent) {
        if (chave == true) {
            pTable.refresh();
            carregarListaPacote();
            cpfBucarEx.clear();
            chave = false;
        }
    }
}
