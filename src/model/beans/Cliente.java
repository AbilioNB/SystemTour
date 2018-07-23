package model.beans;

import javax.swing.*;
import javafx.beans.property.SimpleStringProperty;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    ArrayList<Viagem> viagensFeitas = new ArrayList();

    private  SimpleStringProperty nome;
    private SimpleStringProperty telefone;
    private  SimpleStringProperty cpf;

    public Cliente(String nome, String tel, String CPF) {
        this.nome = new SimpleStringProperty(nome);
        this.telefone = new SimpleStringProperty(tel);
        this.cpf = new SimpleStringProperty(CPF);
    }
    public String getNome() {
        return nome.get();
    }

    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getTelefone() {
        return telefone.get();
    }

    public SimpleStringProperty telefoneProperty() {
        return telefone;
    }

    public void setTelefone(String cel) {
        this.telefone.set(cel);
    }

    public String getCPF() {
        return cpf.get();
    }

    public SimpleStringProperty cpfProperty() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf.set(CPF);
    }

    public Cliente() {
        super();
    }
}
