package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Administrador;

import java.util.HashMap;

public class AdminDAO {

    private static HashMap<String,Administrador> repositorioADM=new HashMap ();
    private static AdminDAO instance = new AdminDAO ();

    public static void salvarAdmin(Administrador adm){
        repositorioADM.put(adm.getCpf(), adm);
    }

    public static void removerADM(Administrador adm){   


    }
}
