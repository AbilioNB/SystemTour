package business;

import model.beans.Financeiro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinanceiroBusiness {

    Financeiro f = new Financeiro();
    public Boolean validar(Financeiro buffer){

        validarData(buffer.getDataPagamento());
        //TODO FUNÇÃO PRA CALCULAR CRÉDITO

        System.out.println("----------");
        System.out.println(buffer.getCpfCon());
        System.out.println(f.getCpfDoCliente());

        boolean info;

        if(buffer.getCpfCon().equals(buffer.getCpfDoCliente())){
            System.out.println("é igual");
            info = true;
        }else{
            info = false;
        }
    return info;
    }

    public Boolean validarData(String data){
        boolean info = true;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date dataPronta = formato.parse(data);
        } catch (ParseException e) {
            info = false;
        }
        return info;
    }

    public void receptaculo(String cpf){
        System.out.println(cpf);

        f.setCpfDoCliente(cpf);
        System.out.println(f.getCpfDoCliente());
    }
}