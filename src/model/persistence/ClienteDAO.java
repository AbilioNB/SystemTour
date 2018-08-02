package model.persistence;

import model.beans.Cliente;

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
}