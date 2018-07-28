package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Main;
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

        ClienteExibir c1 = new ClienteExibir("Gabriel", "(81)99999-9999", "70561283435");
        ClienteExibir c2 = new ClienteExibir("Kelvin","(81)88888-8888","10835895475");
        ClienteExibir c3 = new ClienteExibir("Abilio","(81)77777-7777","11487004478");

        lisTCliente.add(c1);
        lisTCliente.add(c2);
        lisTCliente.add(c3);

        observableListCliente = FXCollections.observableArrayList(lisTCliente);

        cTable.setItems(observableListCliente);

    }
    public void clienteSelecionado(ClienteExibir cliente){
        if (cliente != null){
            System.out.println("Cliente selecionado foi: " + cliente.getNomeEx());
        }
    }
    @FXML
    protected void buttonExcluir (){
        ClienteExibir cliente = cTable.getSelectionModel().getSelectedItem();
        if (cliente != null){
            ClienteView.mensagemRemover(cliente.getNomeEx());
            cTable.getItems().remove(cliente);
        }
    }
    @FXML
    protected void buttonVoltar (javafx.event.ActionEvent actionEvent) throws IOException {
        Main.trocaTela("Entrar");
    }
    @FXML
    protected void buttonEditar (javafx.event.ActionEvent actionEvent){
        // Main.trocaTela("");
    }
}