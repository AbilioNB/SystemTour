package model.beans;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Viagem {
    private String vagas;
    private String destino;
    private String origem;
    private String descricao;
    private String id;
    private String partida;
    private String chegada;
    private int qtVagas;
    private double valor;
    private int ativo;
    private int despesa = 40;
    private int pessoas = 3;

    private SimpleStringProperty idEx;
    private SimpleStringProperty partidaEx;
    private SimpleIntegerProperty qtVagasEx;
    private SimpleDoubleProperty valorEx;
    private SimpleStringProperty destinoEx;

    public Viagem(String destinoEx, String partidaEx, Integer vagasEx, Double valorEx, String idEx){
        this.destinoEx = new SimpleStringProperty(destinoEx);
        this.partidaEx = new SimpleStringProperty(partidaEx);
        this.qtVagasEx = new SimpleIntegerProperty(vagasEx);
        this.valorEx = new SimpleDoubleProperty(valorEx);
        this.idEx = new SimpleStringProperty(id);
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
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

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getDespesa() {
        return despesa;
    }

    public void setDespesa(int despesa) {
        this.despesa = despesa;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
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

    public String getPartidaEx() {
        return partidaEx.get();
    }

    public SimpleStringProperty partidaExProperty() {
        return partidaEx;
    }

    public void setPartidaEx(String partidaEx) {
        this.partidaEx.set(partidaEx);
    }

    public int getQtVagasEx() {
        return qtVagasEx.get();
    }

    public SimpleIntegerProperty qtVagasExProperty() {
        return qtVagasEx;
    }

    public void setQtVagasEx(int qtVagasEx) {
        this.qtVagasEx.set(qtVagasEx);
    }

    public double getValorEx() {
        return valorEx.get();
    }

    public SimpleDoubleProperty valorExProperty() {
        return valorEx;
    }

    public void setValorEx(double valorEx) {
        this.valorEx.set(valorEx);
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

    public Viagem() {
        super();
    }


}
