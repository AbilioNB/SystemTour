package br.ufrpe.systemtour.business;


import model.beans.Pagamento;
import model.persistence.PagamentoDAO;

public class PagarBusiness {

    public void validarPagamento(Pagamento pagamento){
            PagamentoDAO.salvarPagamento(pagamento);
            System.out.println("salvou");
    }
}