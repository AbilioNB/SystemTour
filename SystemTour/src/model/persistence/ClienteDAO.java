package model.persistence;

import model.beans.Cliente;

import java.util.HashMap;

public class ClienteDAO {

    private HashMap<String,Cliente> repositorioCliente=new HashMap ();
    private static ClienteDAO instance = new ClienteDAO ();


        //adicionar cliente a lista
        public void salvarCliente(Cliente user){
            repositorioCliente.put(user.getCpf(),user);
        }
        //remover cliente da lista
        public void removerCliente(Cliente user){

            repositorioCliente.remove(user.getCpf());
        }


}
