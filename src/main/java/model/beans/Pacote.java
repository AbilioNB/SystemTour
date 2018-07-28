package model.beans;
import javax.persistence.*;
import java.util.ArrayList;
@Entity
public class Pacote extends Viagem {



    private double taxaDesconto;
   @Embedded
    private Viagem viagemPacote;
    private int qtdClientes;
    private double valorFinal;
    @Id
    private double pacoteId;
    @ManyToOne
    private int idCliente;



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
