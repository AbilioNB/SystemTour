package model.persistence;

import model.beans.Viagem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViagensDAO {

    private static HashMap<String,Viagem> repositorioViagem=new HashMap ();
    private static ViagensDAO instance = new ViagensDAO();

    public static void salvarViagem(Viagem viagem){
        repositorioViagem.put(viagem.getId(), viagem);
    }

    //remover viagem da lista
    public static void removerViagem(String id) {
        for (Viagem buffer: repositorioViagem.values()){
            if (id == buffer.getId()){
                repositorioViagem.remove(buffer.getId());
            }
        }
    }

    //Todos as viagens
    public static List<Viagem> pegarViagem(){
        List<Viagem> listViagem = new ArrayList<Viagem>();

        for (Viagem buffer:  repositorioViagem.values()) {
            listViagem.add(buffer);
        }
        return listViagem;
    }

}
