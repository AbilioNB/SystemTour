package business;

import model.beans.Financeiro;
import model.persistence.FinanceiroDAO;
import view.FinanceiroView;

import java.util.Set;

public class FinanceiroBusiness{

    FinanceiroView fv = new FinanceiroView();

    public boolean validarFinanceiro(Financeiro financeiro, Set<String> cpf){

        boolean info;

        try{
            validarCPF(financeiro, cpf);
            FinanceiroDAO.salvarFinancas(financeiro);
            info = true;
        }catch (NullPointerException e){
            fv.erroContratoCliente();
            info = false;
        }
        return info;
    }

    public void validarCPF(Financeiro financeiro, Set<String> cpf)throws NullPointerException{

        for (String chave : cpf){
            if(chave != null){
                String nova = chave.replace("[", "");
                String nova2 = nova.replace("]", "");
                if(nova2.equals(financeiro.getCpfContrato())){
                    System.out.println("é igual");
                }else{
                    throw new NullPointerException();
                }
            }
        }
    }

    //TODO VALIDAÇÃO DE CONTRATO
    public void validarContrato(){

    }
}