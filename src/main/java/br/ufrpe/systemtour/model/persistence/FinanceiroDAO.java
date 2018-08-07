package br.ufrpe.systemtour.model.persistence;

import br.ufrpe.systemtour.model.beans.Cliente;
import br.ufrpe.systemtour.model.beans.Financeiro;

import java.util.HashMap;
import java.util.Set;

public class FinanceiroDAO {

    private static HashMap<String, Financeiro> repositorioFinanceiro = new HashMap ();
    private static FinanceiroDAO instance = new FinanceiroDAO ();

    //adicionar cliente a lista
    public static void salvarFinancas(Financeiro financeiro){
        repositorioFinanceiro.put(financeiro.getCpfContrato(),financeiro);


    }
    //remover cliente da lista
    public static void removerFinancas(Financeiro financeiro){
        repositorioFinanceiro.remove(financeiro.getCpfContrato());
    }
}