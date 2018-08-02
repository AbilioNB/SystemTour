package model.persistence;

import model.beans.Pacote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PacoteDAO {

    private static HashMap<String, Pacote> repositorioPacote = new HashMap();
    private static PacoteDAO instance = new PacoteDAO();

    //adicionar pacote a lista
    public static void salvarPacote(Pacote pacote) {
        repositorioPacote.put(pacote.getidPassar(), pacote);
        //a partir daqui apagar
        System.out.println("SALVOU");
    }
    public static List<Pacote> pegarPacote(){
        List<Pacote> listPacote = new ArrayList<Pacote>();

        for (Pacote buffer:  repositorioPacote.values()) {
            listPacote.add(buffer);
        }
        return listPacote;
    }
    //remover pacote da lista
    public static void removerPacote(String id) {
        for (Pacote buffer: repositorioPacote.values()){
            if (id == buffer.getId()){
                repositorioPacote.remove(buffer.getId());
            }
        }
    }
}
