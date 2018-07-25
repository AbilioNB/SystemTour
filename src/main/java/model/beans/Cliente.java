package model.beans;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
@Entity
public class Cliente extends Pessoa {

    @Id
    private long id;

    private String cpf;

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /*
    ArrayList<Viagem> viagensFeitas = new ArrayList();*/

}
