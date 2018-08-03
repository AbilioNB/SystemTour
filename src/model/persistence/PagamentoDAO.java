package model.persistence;

import model.beans.Pagamento;

import java.util.HashMap;

public class PagamentoDAO {

    private static HashMap<String, Pagamento> repositorioPagamento = new HashMap();

    public static void salvarPagamento(Pagamento pagamento) {
        repositorioPagamento.put(pagamento.getCpfDoPagante(), pagamento);
    }

    public static void removerPagamento(Pagamento pagamento){
        repositorioPagamento.remove(pagamento.getCpfDoPagante() );
    }

}
