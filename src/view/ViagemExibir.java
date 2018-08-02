package view;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ViagemExibir {

    private SimpleStringProperty idEx;
    private SimpleStringProperty partidaEx;
    private SimpleIntegerProperty qtVagasEx;
    private SimpleDoubleProperty valorEx;
    private SimpleStringProperty destinoEx;

    public ViagemExibir(String destinoEx, String partidaEx, int vagasEx, Double valorEx, String idEx){
        this.destinoEx = new SimpleStringProperty(destinoEx);
        this.partidaEx = new SimpleStringProperty(partidaEx);
        this.qtVagasEx = new SimpleIntegerProperty(vagasEx);
        this.valorEx = new SimpleDoubleProperty(valorEx);
        this.idEx = new SimpleStringProperty(idEx);
    }
    public String getIdEx() {
        return idEx.get();
    }

    public SimpleStringProperty idExProperty() {
        return idEx;
    }

    public void setIdEx(String idEx) {
        this.idEx.set(idEx);
    }

    public String getPartidaEx() {
        return partidaEx.get();
    }

    public SimpleStringProperty partidaExProperty() {
        return partidaEx;
    }

    public void setPartidaEx(String partidaEx) {
        this.partidaEx.set(partidaEx);
    }

    public int getQtVagasEx() {
        return qtVagasEx.get();
    }

    public SimpleIntegerProperty qtVagasExProperty() {
        return qtVagasEx;
    }

    public void setQtVagasEx(int qtVagasEx) {
        this.qtVagasEx.set(qtVagasEx);
    }

    public double getValorEx() {
        return valorEx.get();
    }

    public SimpleDoubleProperty valorExProperty() {
        return valorEx;
    }

    public void setValorEx(double valorEx) {
        this.valorEx.set(valorEx);
    }

    public String getDestinoEx() {
        return destinoEx.get();
    }

    public SimpleStringProperty destinoExProperty() {
        return destinoEx;
    }

    public void setDestinoEx(String destinoEx) {
        this.destinoEx.set(destinoEx);
    }
}
