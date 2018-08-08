package br.ufrpe.systemtour.model.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer bancoId;

    public Integer getBancoId() {
        return bancoId;
    }

    public void setBancoId(Integer bancoId) {
        this.bancoId = bancoId;
    }

    public Cliente() {
        super();
    }
}