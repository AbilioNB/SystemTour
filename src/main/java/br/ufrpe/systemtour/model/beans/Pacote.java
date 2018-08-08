package br.ufrpe.systemtour.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pacote extends Viagem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer bancoId;
    private String destinoPassar;
    private String cpfTitular;
    private double taxaDesconto;
    private int qtdClientes;
    private String idPassar;
    private int parcelas;
    private double valorParcelado;
    private Double valorTotal;

    @Override
    public Integer getBancoId() {
        return bancoId;
    }

    @Override
    public void setBancoId(Integer bancoId) {
        this.bancoId = bancoId;
    }

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
