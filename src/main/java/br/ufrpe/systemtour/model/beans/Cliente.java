package br.ufrpe.systemtour.model.beans;


import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="bancoId")
public class Cliente extends Pessoa {

//    private Integer bancoId;
//
//    public Integer getBancoId() {
//        return bancoId;
//    }
//
//    public void setBancoId(Integer bancoId) {
//        this.bancoId = bancoId;
//    }

    public Cliente() {
        super();
    }
}