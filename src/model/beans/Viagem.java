package model.beans;

import java.util.Date;

public class Viagem {
    private String destino;
    private String origem;
    private String descricao;
    private String id;
    private String partida;
    private String chegada;
    private int qtVagas;
    private double valor;
    private int ativo;

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public int getQtVagas() {
        return qtVagas;
    }

    public void setQtVagas(int qtVagas) {
        this.qtVagas = qtVagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
