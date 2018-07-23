package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import model.beans.Cliente;
import sample.Main;
import view.ClienteView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ExibirController implements Initializable {
    @FXML
    private javafx.scene.control.TableView<Cliente> cTable;

    @FXML
    private TableColumn<Cliente,String> cNome;

    @FXML
    private TableColumn<Cliente,String> cTelefone;

    @FXML
    private TableColumn<Cliente,String> cCPF;

    @FXML
    private Button buttonRemover;

    private List<Cliente>lisTCliente = new ArrayList();
    private ObservableList<Cliente>observableListCliente;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarListaClientes();
        cTable.getSelectionModel().selectedItemProperty().addListener((
                observable, oldValue, newValue)-> clienteSelecionado(newValue));
    }
    public void carregarListaClientes(){
        cNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        cTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        cCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));

        Cliente c1 = new Cliente("Gabriel", "(81)99999-9999", "70561283435");
        Cliente c2 = new Cliente("Kelvin","(81)88888-8888","10835895475");
        Cliente c3 = new Cliente("Abilio","(81)77777-7777","11487004478");

        lisTCliente.add(c1);
        lisTCliente.add(c2);
        lisTCliente.add(c3);

        observableListCliente = FXCollections.observableArrayList(lisTCliente);

        cTable.setItems(observableListCliente);

    }
    public void clienteSelecionado(Cliente cliente){
        if (cliente != null){
        System.out.println("Cliente selecionado foi: " + cliente.getNome());
        }
    }
    @FXML
    protected void buttonExcluir (){
        Cliente cliente = cTable.getSelectionModel().getSelectedItem();
        if (cliente != null){
        ClienteView.mensagemRemover(cliente.getNome());
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
