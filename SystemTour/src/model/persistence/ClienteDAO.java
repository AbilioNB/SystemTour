package model.persistence;

import model.beans.Cliente;
import java.util.HashMap;

public class ClienteDAO {

    private static HashMap<String,Cliente> repositorioCliente=new HashMap ();
    private static ClienteDAO instance = new ClienteDAO ();


        //adicionar cliente a lista
        public static void salvarCliente(Cliente user){
            repositorioCliente.put(user.getCpf(),user);
        }
        //remover cliente da lista
        public static void removerCliente(Cliente user){
            repositorioCliente.remove(user.getCpf());
        }


}
