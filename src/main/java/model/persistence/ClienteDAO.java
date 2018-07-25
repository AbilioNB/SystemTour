package model.persistence;

import model.beans.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClienteDAO {

    /*private static HashMap<String,Cliente> repositorioCliente=new HashMap ();
    //private static ClienteDAO instance = new ClienteDAO ();


    //adicionar cliente a lista
    public static void salvarCliente(Cliente user){
        repositorioCliente.put(user.getCpf(),user);
        //a partir daqui apagar
        System.out.println("Realmentefoi gravado!\n Numero de elementos no map :" + repositorioCliente.size()+"\n");


    }
    //remover cliente da lista
    public static void removerCliente(Cliente user){
        repositorioCliente.remove(user.getCpf());
    }*/
    //Iniciando JPA parte
    public void salveC(Cliente user){

        EntityManager em = new Connection().getConnection();

       try{
           em.getTransaction().begin();
           em.persist(user);
           em.getTransaction().commit();
       } catch (Exception e){
           em.getTransaction().rollback();
           System.out.println("Erro ao salvar! \nDescrição:"+ e);
       }finally {
           em.close();
       }
    }
   public static void editarC(Cliente user){
        EntityManager em = new Connection().getConnection();
        try{
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
            System.out.println("Erro ao editar cliente! \nDescrição:"+ e);
        }finally {
            em.close();
        }
    }
   //Busca de 1 Cliente
    public  Cliente buscaUnica(Cliente user){
        EntityManager em = new Connection().getConnection();
        Cliente buffer = new Cliente();
        try {
            buffer= em.find(Cliente.class,user.getCpf());
        }catch (Exception e){
            System.err.println(e);
        }finally {
            em.close();
        }
        return buffer;
    }
    //Busca da Lista de clientes
    public List<Cliente> buscaCompleta(){
        EntityManager em = new Connection().getConnection();
        List<Cliente> listaClientes = null;
//Caso não rode aqui ele pede que seja criado uma lista do tipo comum e não do tipo cliente.
        try{
            listaClientes = em.createQuery("from Cliente", Cliente.class ).getResultList();
        }catch (Exception e ){
            System.err.println(e);
        }finally {
            em.close();
        }
        return listaClientes;
    }

    //Removendo
    public void removerCliente(String key){
        EntityManager em = new Connection().getConnection();
        try {
            Cliente buffer = em.find(Cliente.class,key);
            em.getTransaction().begin();
            em.remove(buffer);

        }catch (Exception e){
                System.err.println(e);
                em.getTransaction().rollback();
        }finally {
            em.close();
        }


    }


}