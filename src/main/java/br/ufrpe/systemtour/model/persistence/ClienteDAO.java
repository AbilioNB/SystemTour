package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class ClienteDAO {

    private static HashMap<String, Cliente> repositorioCliente = new HashMap();
    private static ClienteDAO instance = new ClienteDAO();


    //adicionar cliente a lista
    public static void salvarCliente(Cliente user) {
        repositorioCliente.put(user.getCpf(), user);
        //a partir daqui apagar
        System.out.println("Realmentefoi gravado!\n Numero de elementos no map :" + repositorioCliente.size() + "\n");
    }
    //remover cliente da lista
    public static void removerCliente(String cpf) {
        for (Cliente buffer: repositorioCliente.values()){
            if (cpf == buffer.getCpf()){
                repositorioCliente.remove(buffer.getCpf());
            }
        }
    }
    public static Set<String> retornaCPF() {

        Set<String> cpfs = repositorioCliente.keySet();
        return cpfs;
    }
    //Todos os clientes
    public static List<Cliente> pegarNomes(){
        List<Cliente> listClientes = new ArrayList<Cliente>();

        for (Cliente buffer:  repositorioCliente.values()) {
            listClientes.add(buffer);
        }
        return listClientes;
    }
    //Verificar CPF
    public static boolean buscaCpf (String buffer){

        return repositorioCliente.containsKey(buffer);
    }
    //Retornar 1 cliente baseado no cpf 
    public static Cliente buscarCliente( String cpf){
        return repositorioCliente.get(cpf);

    }
    //Parte do Banco
    //Gravar
    public static void setHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //Fazer uma nova leitura do banco
        HashMap<String,Cliente> bufHash = new HashMap();
        List<Cliente> bufferList = em.createQuery("from Cliente ",Cliente.class).getResultList();
        for (Cliente buffer :bufferList){
            bufHash.put(buffer.getCpf(),buffer);
        }
        //Testa se ja tem da merge se n salva
        for (Cliente buffer:repositorioCliente.values()) {
            if(bufHash.containsKey(buffer.getCpf())){
                Cliente buf2 = bufHash.get(buffer.getCpf());
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
    //Recuperar
    public static void getHash(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
        EntityManager em = emf.createEntityManager();
        List<Cliente> bufferList = em.createQuery("from Cliente ",Cliente.class).getResultList();
        for (Cliente buffer :bufferList){
            repositorioCliente.put(buffer.getCpf(),buffer);
        }
        em.close();
        emf.close();
    }
}