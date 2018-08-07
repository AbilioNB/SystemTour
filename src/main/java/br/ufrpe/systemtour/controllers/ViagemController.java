package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.ViagemBusiness;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import br.ufrpe.systemtour.model.beans.Viagem;
import br.ufrpe.systemtour.model.persistence.ViagensDAO;
import br.ufrpe.systemtour.sample.Main;
import view.ViagemExibir;
import view.ViagemView;

import java.util.*;
import java.io.IOException;
import java.net.URL;

public class ViagemController implements Initializable {
    @FXML
    private javafx.scene.control.TableView<ViagemExibir> vTable;
    @FXML
    private TableColumn<ViagemExibir, String> vDestino;
    @FXML
    private TableColumn<ViagemExibir, String> vDate;
    @FXML
    private TableColumn<ViagemExibir, Integer> vVagas;
    @FXML
    private TableColumn<ViagemExibir, Double> vValor;
    @FXML
    private TableColumn<ViagemExibir, String> vID;
    @FXML
    private Button buttonRemover;

    private static String destinoPassar;
    private static String dataPassar;
    private static int vagasPassar;
    private static double valorPassar;
    private static String idPassar;

    private List<ViagemExibir>ListViagem = new ArrayList();
    private ObservableList<ViagemExibir> observableListViagem;

    @FXML
    private TextField origemViagem, destinoViagem, descricaoViagem, vagasViagem, dataPartidaViagem, dataChegadaViagem, unitarioViagem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarListaViagem();
        vTable.getSelectionModel().selectedItemProperty().addListener((
                observable, oldValue, newValue)-> viagemSelecionada(newValue));
    }
    public void carregarListaViagem(){
        vDestino.setCellValueFactory(new PropertyValueFactory<>("destinoEx"));
        vDate.setCellValueFactory(new PropertyValueFactory<>("partidaEx"));
        vVagas.setCellValueFactory(new PropertyValueFactory<>("qtVagasEx"));
        vValor.setCellValueFactory(new PropertyValueFactory<>("valorEx"));
        vID.setCellValueFactory(new PropertyValueFactory<>("idEx"));

        for (Viagem buffer: ViagensDAO.pegarViagem()){
            ViagemExibir v1 = new ViagemExibir(buffer.getDestino(), buffer.getPartida(), buffer.getQtVagas(), buffer.getValor(), buffer.getId());
            ListViagem.add(v1);
        }

        ViagemExibir v3 = new ViagemExibir("Galego","20/11/2018",90,500.00 ,"4478");
        ListViagem.add(v3);

        observableListViagem = FXCollections.observableArrayList(ListViagem);

        vTable.setItems(observableListViagem);
    }
    public void viagemSelecionada(ViagemExibir viagem){
        if (viagem != null){
            destinoPassar = viagem.getDestinoEx();
            dataPassar = viagem.getPartidaEx();
            vagasPassar = viagem.getQtVagasEx();
            valorPassar = viagem.getValorEx();
            idPassar = viagem.getIdEx();
            System.out.println("Viagem para " + viagem.getDestinoEx() + " foi selecionada");
        }
    }
    @FXML
    protected void buttonPacote()throws IOException{
        Main.trocaTela("Vender");
    }
    public static String getDestinoPassar(){
        return destinoPassar;
    }
    public static String getDataPassar(){
        return dataPassar;
    }
    public static int getVagasPassar(){
        return vagasPassar;
    }
    public static double getValorPassar(){
        return valorPassar;
    }
    public static String getIdPassar(){
        return idPassar;
    }

    @FXML
    protected void buttonRemover(){
        ViagemExibir viagem = vTable.getSelectionModel().getSelectedItem();
        if (viagem != null){
            vTable.getItems().remove(viagem);
            ViagensDAO.removerViagem(idPassar);
            ViagemView.mensagemRemover(viagem.getDestinoEx());
        }
    }

    @FXML
    protected void buttonEnviar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");

        Viagem bufferViagem = new Viagem();
        ViagemBusiness vb = new ViagemBusiness();
        ViagemView vv = new ViagemView();

        bufferViagem.setOrigem(origemViagem.getText());
        bufferViagem.setDestino(destinoViagem.getText());
        bufferViagem.setDescricao(descricaoViagem.getText());

        String vagas = vagasViagem.getText();
        try{
            int q = Integer.parseInt(vagas);
            bufferViagem.setQtVagas(q);
        }catch (NumberFormatException e){
            vv.mensagemErroVaga();
            return;
        }

        bufferViagem.setPartida(dataPartidaViagem.getText());
        bufferViagem.setChegada(dataChegadaViagem.getText());

        String valorUnitario = unitarioViagem.getText();
        try{
            int valorUni = Integer.parseInt(valorUnitario);
            bufferViagem.setValor(valorUni);
        }catch (NumberFormatException e){
            vv.mensagemErroValorUnitario();
            return;
        }
//        String despesa = valorDespesa.getText();
//        try{
//            int despesavalor = Integer.parseInt(despesa);
//            buffer.setDespesa(Double.valueOf(despesavalor));
//        }catch (NumberFormatException e){}

        Random gerarId = new Random();
        int geradorId = gerarId.nextInt(10001);
        String id = Integer.toString(geradorId);
        bufferViagem.setId(id);

       vb.validarViagem(bufferViagem);

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
