package br.ufrpe.systemtour.model.beans;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "bancoID")
public class Pacote extends Viagem {

    private String destinoPassar;
    private String cpfTitular;
    private double taxaDesconto;
    private int qtdClientes;
    private String idPassar;
    private int parcelas;
    private double valorParcelado;
    private Double valorTotal;


    public String getIdPassar() {
        return idPassar;
    }

    public double getValorParcelado() {
        return valorParcelado;
    }

    public void setValorParcelado(double valorParcelado) {
        this.valorParcelado = valorParcelado;
    }

    public String getDestinoPassar(){
        return destinoPassar;
    }
    public void setDestinoPassar(String destino){
        this.destinoPassar = destino;
    }
    public int getParcelas(){
        return parcelas;
    }
    public void setParcelas(int parcela){
        this.parcelas = parcela;
    }
    public Double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal (Double valor){
        this.valorTotal = valor;
    }

    public String getidPassar(){
        return idPassar;
    }

    public void setIdPassar(String valor){
        idPassar = valor;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public int getQtdClientes() {
        return qtdClientes;
    }

    public void setQtdClientes(int qtdClientes) {
        this.qtdClientes = qtdClientes;
    }
}
