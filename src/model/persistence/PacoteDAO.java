package model.persistence;

import model.beans.Pacote;
import java.util.HashMap;

public class PacoteDAO {

    private static HashMap<String, Pacote> repositorioPacote = new HashMap();
    private static PacoteDAO instance = new PacoteDAO();

    //adicionar pacote a lista
    public static void salvarPacote(Pacote pacote) {
        repositorioPacote.put(pacote.getId(), pacote);
        //a partir daqui apagar
        System.out.println("SALVOU");
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
