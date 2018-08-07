package br.ufrpe.systemtour.model.beans;

public class Financeiro {

    private String cpfContrato;
    private String numeroContrato;
    private String dataPagamento;
    private Double valorPago;

    public String getCpfContrato() {
        return cpfContrato;
    }

    public void setCpfContrato(String cpfContrato) {
        this.cpfContrato = cpfContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
}
