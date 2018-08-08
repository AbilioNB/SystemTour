package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Administrador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.List;

public class AdminDAO {

    private static HashMap<String,Administrador> repositorioADM=new HashMap ();
    private static AdminDAO instance = new AdminDAO ();

    public static void salvarAdmin(Administrador adm){
        repositorioADM.put(adm.getCpf(), adm);
    }

    public static void removerADM(Administrador adm){   
        repositorioADM.remove(adm.getCpf());
    }
    //Parte do Banco

    //Gravando
    public static void setHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (Administrador buffer:repositorioADM.values()) {
            em.persist(buffer);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    //Recuperando
    public static void getHash(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        List<Administrador> bufferList = em.createQuery("from Administrador ",Administrador.class).getResultList();
        for (Administrador buffer :bufferList){
           repositorioADM.put(buffer.getCpf(),buffer);
        }
        em.close();
        emf.close();
    }
}