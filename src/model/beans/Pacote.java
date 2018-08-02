package model.beans;

public class Pacote extends Viagem {

    private String cpfTitular;
    private double taxaDesconto;
    private Viagem viagemPacote;
    private int qtdClientes;
    private Integer idPassar;

    public int getid(){
        return idPassar;
    }
    public void setIdPassar(int valor){
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

    public Viagem getViagemPacote() {
        return viagemPacote;
    }

    public void setViagemPacote(Viagem viagemPacote) {
        this.viagemPacote = viagemPacote;
    }

    public int getQtdClientes() {
        return qtdClientes;
    }

    public void setQtdClientes(int qtdClientes) {
        this.qtdClientes = qtdClientes;
    }
}
