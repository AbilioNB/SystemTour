package model.persistence;

import model.beans.Pagamento;

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

}
