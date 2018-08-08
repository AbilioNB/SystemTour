package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Pacote;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
    //Parte do Banco
    public static void setHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //Fazer uma nova leitura do banco
        HashMap<String,Pacote> bufHash = new HashMap();
        List<Pacote> bufferList = em.createQuery("from Pessoa ",Pacote.class).getResultList();
        for (Pacote buffer :bufferList){
            bufHash.put(buffer.getId(),buffer);
        }
        //Testa se ja tem da merge se n salva
        for (Pacote buffer:repositorioPacote.values()) {
            if(bufHash.containsKey(buffer.getId())){
                Pacote buf2 = bufHash.get(buffer.getId());
                buffer.setBancoId(buf2.getBancoId());
                em.merge(buffer);
            }else {
                em.persist(buffer);
            }
        }

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
    public static void getHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        List<Pacote> bufferList = em.createQuery("from Pacote ",Pacote.class).getResultList();
        for (Pacote buffer :bufferList){
            repositorioPacote.put(buffer.getId(),buffer);
        }
        em.close();
        emf.close();
    }
}
