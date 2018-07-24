package controllers;

import business.ViagemBusiness;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.beans.Viagem;
import sample.Main;
import view.ViagemView;

import java.util.*;
import java.io.IOException;
import java.net.URL;

public class ViagemController implements Initializable {
    @FXML
    private javafx.scene.control.TableView<Viagem> vTable;
    @FXML
    private TableColumn<Viagem, String> vDestino;
    @FXML
    private TableColumn<Viagem, String> vDate;
    @FXML
    private TableColumn<Viagem, Integer> vVagas;
    @FXML
    private TableColumn<Viagem, Double> vValor;
    @FXML
    private TableColumn<Viagem, String> vID;
    @FXML
    private Button buttonRemover;

    private List<Viagem>ListViagem = new ArrayList();
    private ObservableList<Viagem> observableListViagem;

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

        Viagem v1 = new Viagem("Disney", "01/09/2018",70,50.00 , "3435");
        Viagem v2 = new Viagem("Moreno","06/10/2018",80,350.00 ,"5475");
        Viagem v3 = new Viagem("Galego","20/11/2018",90,500.00 ,"4478");

        ListViagem.add(v1);
        ListViagem.add(v2);
        ListViagem.add(v3);

        observableListViagem = FXCollections.observableArrayList(ListViagem);

        vTable.setItems(observableListViagem);
    }
    public void viagemSelecionada(Viagem viagem){
        if (viagem != null){
            System.out.println("Viagem para " + viagem.getDestinoEx() + " foi selecionada");
        }
    }
    @FXML
    protected void buttonRemover(){
        Viagem viagem = vTable.getSelectionModel().getSelectedItem();
        if (viagem != null){
            ViagemView.mensagemRemover(viagem.getDestinoEx());
            vTable.getItems().remove(viagem);
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

        Random gerarId = new Random();
        int geradorId = gerarId.nextInt(101);
        String id = Integer.toString(geradorId);
        bufferViagem.setId(id);

       vb.validarViagem(bufferViagem);

    }
    @FXML
    protected void buttonVoltar(javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
}
