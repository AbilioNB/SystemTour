package model.persistence;

import model.beans.Cliente;
import model.beans.Financeiro;

import java.util.HashMap;

public class FinanceiroDAO {

    private static HashMap<String, Financeiro> repositorioFinanceiro = new HashMap ();
    private static FinanceiroDAO instance = new FinanceiroDAO ();


    private static HashMap<String, Financeiro> repositorioCpfCadastro = new HashMap ();

    //adicionar cliente a lista
    public static void salvarFinancas(Financeiro financeiro){
        repositorioFinanceiro.put(financeiro.getCpfContrato(),financeiro);


    }
    //remover cliente da lista
    public static void removerFinancas(Financeiro financeiro){
        repositorioFinanceiro.remove(financeiro.getCpfContrato());
    }

    public static void salvarCpfCliente(Cliente cliente) {

    }
}