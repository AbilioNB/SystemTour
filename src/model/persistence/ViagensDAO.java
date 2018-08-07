package model.persistence;

import model.beans.Viagem;

import java.util.HashMap;

public class ViagensDAO {

    private static HashMap<String,Viagem> repositorioViagem=new HashMap ();
    private static ViagensDAO instance = new ViagensDAO();

    public static void salvarViagem(Viagem viagem){
        repositorioViagem.put(viagem.getId(), viagem);
    }

}
