package br.ufrpe.systemtour.model.beans;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="bancoId")
public class Administrador extends Pessoa {

//   private Integer bancoId;
    private String login;
    private String senha;
    private int id;

//    public Integer getBancoId() {
//        return bancoId;
//    }
//
//    public void setBancoId(Integer bancoId) {
//        this.bancoId = bancoId;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
