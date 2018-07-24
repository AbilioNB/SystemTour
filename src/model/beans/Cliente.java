package model.beans;

import javafx.beans.property.SimpleStringProperty;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    ArrayList<Viagem> viagensFeitas = new ArrayList();

    private  SimpleStringProperty nomeEx;
    private SimpleStringProperty telefoneEx;
    private  SimpleStringProperty cpfEx;

    private String contrato;

    public Cliente(String nomeEx, String telEx, String CPFEx) {
        this.nomeEx = new SimpleStringProperty(nomeEx);
        this.telefoneEx = new SimpleStringProperty(telEx);
        this.cpfEx = new SimpleStringProperty(CPFEx);
    }

    public String getNomeEx() {
        return nomeEx.get();
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {

        this.contrato = contrato;

    }

    public String getCpfEx() {
        return cpfEx.get();
    }

    public void setCpfEx(String cpfEx) {
        this.cpfEx.set(cpfEx);
    }

    public SimpleStringProperty nomeExProperty() {
        return nomeEx;
    }

    public void setNomeEx(String nomeEx) {
        this.nomeEx.set(nomeEx);
    }

    public String getTelefoneEx() {
        return telefoneEx.get();
    }

    public SimpleStringProperty telefoneExProperty() {
        return telefoneEx;
    }

    public void setTelefoneEx(String cel) {
        this.telefoneEx.set(cel);
    }

    public SimpleStringProperty cpfExProperty() {
        return cpfEx;
    }

    public Cliente() {
        super();
    }
}