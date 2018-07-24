package model.beans;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Viagem {
    private SimpleStringProperty destino;
    private String origem;
    private String descricao;
    private SimpleStringProperty id;
    private SimpleStringProperty partida;
    private String chegada;
    private SimpleIntegerProperty qtVagas;
    private SimpleDoubleProperty valor;
    private int ativo;
    private int despesa = 40;
    private int pessoas = 3;

    public Viagem(String destino, String partida, Integer vagas, Double valor, String id){
        this.destino = new SimpleStringProperty(destino);
        this.partida = new SimpleStringProperty(partida);
        this.qtVagas = new SimpleIntegerProperty(vagas);
        this.valor = new SimpleDoubleProperty(valor);
        this.id = new SimpleStringProperty(id);
    }

    public Viagem() {
        super();
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

    public String getDestino() {
        return destino.get();
    }

    public SimpleStringProperty destinoProperty() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino.set(destino);
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
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getPartida() {
        return partida.get();
    }

    public SimpleStringProperty partidaProperty() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida.set(partida);
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public int getQtVagas() {
        return qtVagas.get();
    }

    public SimpleIntegerProperty qtVagasProperty() {
        return qtVagas;
    }

    public void setQtVagas(int qtVagas) {
        this.qtVagas.set(qtVagas);
    }

    public double getValor() {
        return valor.get();
    }

    public SimpleDoubleProperty valorProperty() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }
}
