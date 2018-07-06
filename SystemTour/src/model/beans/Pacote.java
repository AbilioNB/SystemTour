package model.beans;
import java.util.ArrayList;

public class Pacote extends Viagem {

    ArrayList<Cliente> nomeCpf = new ArrayList();

    private double taxaDesconto;
    private Viagem viagemPacote;
    private int qtdClientes;

    public ArrayList <Cliente> getNomeCpf() {
        return nomeCpf;
    }

    public void setNomeCpf(ArrayList <Cliente> nomeCpf) {
        this.nomeCpf = nomeCpf;
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
