package br.ufrpe.systemtour.business;


import br.ufrpe.systemtour.model.beans.Pagamento;
import br.ufrpe.systemtour.model.persistence.PagamentoDAO;

public class PagarBusiness {

    public void validarPagamento(Pagamento pagamento){
            PagamentoDAO.salvarPagamento(pagamento);
            System.out.println("salvou");
    }
}