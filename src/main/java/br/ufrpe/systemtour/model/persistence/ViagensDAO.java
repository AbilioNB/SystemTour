package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Viagem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViagensDAO {

    private static HashMap<String,Viagem> repositorioViagem = new HashMap ();
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

    //Parte destinada ao banco de dados :
    //Inserindo o Hash no banco
    public static void setHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (Viagem buffer:repositorioViagem.values()) {
            em.persist(buffer);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    //Recuperando o Hash do Banco
    public  static void getHash(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
       List<Viagem> bufferList = em.createQuery("from Viagem",Viagem.class).getResultList();
        for (Viagem buffer :bufferList){
            repositorioViagem.put(buffer.getId(),buffer);
        }
        em.close();
        emf.close();
    }


}
