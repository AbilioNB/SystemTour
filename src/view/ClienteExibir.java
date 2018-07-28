package view;

import javafx.beans.property.SimpleStringProperty;

public class ClienteExibir {

    private SimpleStringProperty nomeEx;
    private SimpleStringProperty telefoneEx;
    private  SimpleStringProperty cpfEx;


    public ClienteExibir(String nomeEx, String telEx, String CPFEx) {
        this.nomeEx = new SimpleStringProperty(nomeEx);
        this.telefoneEx = new SimpleStringProperty(telEx);
        this.cpfEx = new SimpleStringProperty(CPFEx);
    }
    public String getNomeEx() {
        return nomeEx.get();
    }
    public SimpleStringProperty nomeExProperty() {
        return nomeEx;
    }

    public void setNomeEx(String nomeEx) {
        this.nomeEx.set(nomeEx);
    }
    public String getCpfEx() {
        return cpfEx.get();
    }
    public void setCpfEx(String cpfEx) {
        this.cpfEx.set(cpfEx);
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

}
