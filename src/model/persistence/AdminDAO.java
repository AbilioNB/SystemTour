package model.persistence;

import model.beans.Administrador;
import model.beans.Cliente;

import java.util.HashMap;

public class AdminDAO {

    private static HashMap<String,Administrador> repositorioADM=new HashMap ();
    private static AdminDAO instance = new AdminDAO ();

    public static void salvarCliente(Administrador adm){
        repositorioADM.put(adm.getCpf(),adm);
        System.out.println("Realmentefoi gravado!\n Numero de elementos no map :" + repositorioADM.size()+"\n");
    }

    public static void removerADM(Administrador adm){


    }
}
