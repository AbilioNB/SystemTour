package br.ufrpe.systemtour.model.beans;

import javax.persistence.*;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer bancoId;

    private String cpfDoPagante;
    private double valorRecebido;
    private String dataDoRecebimento;
    private String id;

    public String getCpfDoPagante() {
        return cpfDoPagante;
    }

    public void setCpfDoPagante(String cpfDoPagante) {
        this.cpfDoPagante = cpfDoPagante;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public String getDataDoRecebimento() {
        return dataDoRecebimento;
    }

    public void setDataDoRecebimento(String dataDoRecebimento) {
        this.dataDoRecebimento = dataDoRecebimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
