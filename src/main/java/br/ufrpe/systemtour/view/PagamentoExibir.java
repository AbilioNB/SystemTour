package view;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class PagamentoExibir {
    private SimpleStringProperty cpfDoPaganteEx;
    private SimpleDoubleProperty valorRecebidoEx;
    private SimpleStringProperty dataRecebimentoEx;
    private SimpleStringProperty idPagamentoEx;

    public PagamentoExibir(String cpf, Double valor, String data, String id){
        this.cpfDoPaganteEx = new SimpleStringProperty(cpf);
        this.valorRecebidoEx = new SimpleDoubleProperty(valor);
        this.dataRecebimentoEx = new SimpleStringProperty(data);
        this.idPagamentoEx = new SimpleStringProperty(id);
    }

    public String getCpfDoPaganteEx() {
        return cpfDoPaganteEx.get();
    }

    public SimpleStringProperty cpfDoPaganteExProperty() {
        return cpfDoPaganteEx;
    }

    public void setCpfDoPaganteEx(String cpfDoPaganteEx) {
        this.cpfDoPaganteEx.set(cpfDoPaganteEx);
    }

    public double getValorRecebidoEx() {
        return valorRecebidoEx.get();
    }

    public SimpleDoubleProperty valorRecebidoExProperty() {
        return valorRecebidoEx;
    }

    public void setValorRecebidoEx(double valorRecebidoEx) {
        this.valorRecebidoEx.set(valorRecebidoEx);
    }

    public String getDataRecebimentoEx() {
        return dataRecebimentoEx.get();
    }

    public SimpleStringProperty dataRecebimentoExProperty() {
        return dataRecebimentoEx;
    }

    public void setDataRecebimentoEx(String dataRecebimentoEx) {
        this.dataRecebimentoEx.set(dataRecebimentoEx);
    }

    public String getIdPagamentoEx() {
        return idPagamentoEx.get();
    }

    public SimpleStringProperty idPagamentoExProperty() {
        return idPagamentoEx;
    }

    public void setIdPagamentoEx(String idPagamentoEx) {
        this.idPagamentoEx.set(idPagamentoEx);
    }
}
