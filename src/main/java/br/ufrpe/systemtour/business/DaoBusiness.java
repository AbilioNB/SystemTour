package br.ufrpe.systemtour.business;


import br.ufrpe.systemtour.model.persistence.ClienteDAO;
import br.ufrpe.systemtour.model.persistence.ViagensDAO;

public class DaoBusiness {
    public static void apagarCliente(String cpf){
        ClienteDAO.removerCliente(cpf);
    }
    public static void apagarViagem(String id){
        ViagensDAO.removerViagem(id);
    }
}
