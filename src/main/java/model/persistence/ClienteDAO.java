package model.persistence;

import model.beans.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class ClienteDAO {

    private static HashMap<String,Cliente> repositorioCliente=new HashMap ();
    private static ClienteDAO instance = new ClienteDAO ();


    //adicionar cliente a lista
    public static void salvarCliente(Cliente user){
        repositorioCliente.put(user.getCpf(),user);
        //a partir daqui apagar
        System.out.println("Realmentefoi gravado!\n Numero de elementos no map :" + repositorioCliente.size()+"\n");


    }
    //remover cliente da lista
    public static void removerCliente(Cliente user){
        repositorioCliente.remove(user.getCpf());
    }

    public static void salveC(Cliente user){

        EntityManager em = new Connection().getConnection();

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        em.close();
        
    }


}