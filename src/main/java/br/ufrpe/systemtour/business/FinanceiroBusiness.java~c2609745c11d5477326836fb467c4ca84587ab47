package br.ufrpe.systemtour.business;

import br.ufrpe.systemtour.model.beans.Financeiro;
import br.ufrpe.systemtour.model.persistence.ClienteDAO;
import br.ufrpe.systemtour.model.persistence.FinanceiroDAO;
import view.FinanceiroView;

import java.util.Set;

public class FinanceiroBusiness{

    FinanceiroView fv = new FinanceiroView();

    public boolean validarFinanceiro(Financeiro financeiro) throws NullPointerException{

        boolean info;

        try{
            Set<String> cpf = retornaCPF();
            validarCPF(financeiro, cpf);
            FinanceiroDAO.salvarFinancas(financeiro);
            info = true;
        }catch (NullPointerException e){
            fv.erroContratoCliente();
            info = false;
        }
        return info;
    }

    public void validarCPF(Financeiro financeiro, Set<String> cpf) throws NullPointerException{
        System.out.println("entrou na função");
        for (String chave : cpf){
            System.out.println("oi1");
            if(chave != null){
                System.out.println("oi2");
                String nova = chave.replace("[", "");
                String nova2 = nova.replace("]", "");
                if(nova2.equals(financeiro.getCpfContrato())){
                    System.out.println("é igual");
                }else if(chave == null || financeiro.getCpfContrato().equals(null)){
                    System.out.println("não é igual");
                    throw new NullPointerException();
                }
            }
        }
    }

    //TODO VALIDAÇÃO DE CONTRATO
    public Set<String> retornaCPF(){
        Set<String> cpf = ClienteDAO.retornaCPF();
        return cpf;
    }
}