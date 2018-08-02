package view;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PacoteExibir {
    private SimpleStringProperty destinoEx;
    private SimpleDoubleProperty valorParcelaEx;
    private SimpleIntegerProperty qtRestanteEx;
    private SimpleDoubleProperty valorTotalEx;
    private SimpleStringProperty idEx;

    public PacoteExibir(String des, Double val, int res, Double valT, String id){
        this.destinoEx = new SimpleStringProperty(des);
        this.valorParcelaEx = new SimpleDoubleProperty(val);
        this.qtRestanteEx = new SimpleIntegerProperty(res);
        this.valorTotalEx = new SimpleDoubleProperty(valT);
        this.idEx = new SimpleStringProperty(id);
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

    public double getValorParcelaEx() {
        return valorParcelaEx.get();
    }

    public SimpleDoubleProperty valorParcelaExProperty() {
        return valorParcelaEx;
    }

    public void setValorParcelaEx(double valorParcelaEx) {
        this.valorParcelaEx.set(valorParcelaEx);
    }

    public int getQtRestanteEx() {
        return qtRestanteEx.get();
    }

    public SimpleIntegerProperty qtRestanteExProperty() {
        return qtRestanteEx;
    }

    public void setQtRestanteEx(int qtRestanteEx) {
        this.qtRestanteEx.set(qtRestanteEx);
    }

    public double getValorTotalEx() {
        return valorTotalEx.get();
    }

    public SimpleDoubleProperty valorTotalExProperty() {
        return valorTotalEx;
    }

    public void setValorTotalEx(double valorTotalEx) {
        this.valorTotalEx.set(valorTotalEx);
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
}
