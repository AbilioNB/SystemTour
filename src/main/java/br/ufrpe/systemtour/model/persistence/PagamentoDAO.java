package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Pagamento;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PagamentoDAO {

    private static HashMap<String, Pagamento> repositorioPagamento = new HashMap();

    public static void salvarPagamento(Pagamento pagamento) {
        repositorioPagamento.put(pagamento.getCpfDoPagante(), pagamento);
    }
    public static List<Pagamento> pegarPagamento(){
        List<Pagamento> listPagamento = new ArrayList<Pagamento>();

        for (Pagamento buffer:  repositorioPagamento.values()) {
            listPagamento.add(buffer);
        }
        return listPagamento;
    }

    public static void removerPagamento(Pagamento pagamento){
        repositorioPagamento.remove(pagamento.getCpfDoPagante() );
    }

    //Parte do banco

    //Salvando
    public static void setHash(){

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            for (Pagamento buffer:repositorioPagamento.values()) {
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
        List<Pagamento> bufferList = em.createQuery("from Pagamento ",Pagamento.class).getResultList();
        for ( Pagamento buffer :bufferList){
            repositorioPagamento.put(buffer.getId(),buffer);
        }
        em.close();
        emf.close();
    }


}
