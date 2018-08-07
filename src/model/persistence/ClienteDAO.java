package model.persistence;

import model.beans.Cliente;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    public static void removerCliente(Cliente user) {
        repositorioCliente.remove(user.getCpf());
    }

    public static Set<String> retornaCPF() {

        Set<String> cpfs = repositorioCliente.keySet();
//        for(Iterator<String> iterator = cpfs.iterator(); iterator.hasNext();){
//            String cpf = iterator.next();
//            if(cpf != null){
//
//            }
//        }
        return cpfs;
    }


}