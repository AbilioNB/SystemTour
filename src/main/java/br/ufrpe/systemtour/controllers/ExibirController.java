package br.ufrpe.systemtour.controllers;

import br.ufrpe.systemtour.business.DaoBusiness;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import br.ufrpe.systemtour.model.beans.Cliente;
import br.ufrpe.systemtour.model.persistence.ClienteDAO;
import br.ufrpe.systemtour.sample.Main;
import view.ClienteExibir;
import view.ClienteView;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ExibirController implements Initializable {
    @FXML
    private javafx.scene.control.TableView<ClienteExibir> cTable;

    @FXML
    private TableColumn<ClienteExibir,String> cNome;

    @FXML
    private TableColumn<ClienteExibir,String> cTelefone;

    @FXML
    private TableColumn<ClienteExibir,String> cCPF;

    @FXML
    private Button buttonRemover;

    private String nomePassar;
    private String telPassar;
    private String cpfPassar;

    private List<ClienteExibir>lisTCliente = new ArrayList();
    private ObservableList<ClienteExibir>observableListCliente;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarListaClientes();
        cTable.getSelectionModel().selectedItemProperty().addListener((
                observable, oldValue, newValue)-> clienteSelecionado(newValue));
    }
    public void carregarListaClientes(){
        cNome.setCellValueFactory(new PropertyValueFactory<>("nomeEx"));
        cTelefone.setCellValueFactory(new PropertyValueFactory<>("telefoneEx"));
        cCPF.setCellValueFactory(new PropertyValueFactory<>("cpfEx"));

        for (Cliente buffer: ClienteDAO.pegarNomes()){
            ClienteExibir c1 = new ClienteExibir(buffer.getNome(), buffer.getTelefone(),buffer.getCpf());
            lisTCliente.add(c1);
        }

        observableListCliente = FXCollections.observableArrayList(lisTCliente);

        cTable.setItems(observableListCliente);

    }
    public void clienteSelecionado(ClienteExibir cliente){
        if (cliente != null){
            nomePassar = cliente.getNomeEx();
            telPassar = cliente.getTelefoneEx();
            cpfPassar = cliente.getCpfEx();
            System.out.println("Cliente selecionado foi: " + cliente.getNomeEx());
        }
    }
    public String getNomePassar(){
        return nomePassar;
    }
    public String getTelPassar(){
        return telPassar;
    }
    public String getCpfPassar(){
        return cpfPassar;
    }
    @FXML
    protected void buttonExcluir (){
        ClienteExibir cliente = cTable.getSelectionModel().getSelectedItem();
        if (cliente != null){
            DaoBusiness.apagarCliente(cpfPassar);
            ClienteView.mensagemRemover(cliente.getNomeEx());
            cTable.getItems().remove(cliente);
        }
    }
    @FXML
    protected void buttonVoltar (javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
    @FXML
    protected void buttonEditar (javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("EditarCliente");
    }
}