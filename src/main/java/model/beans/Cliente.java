package model.beans;

import org.hibernate.annotations.Cascade;
import model.beans.*;
import javax.persistence.*;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

@Entity
public class Cliente extends Pessoa {


    @OneToMany
    private List<Pacote> viagensRealizadas = new ArrayList<Pacote>();

}
