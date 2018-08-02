package business;

import model.beans.Pacote;
import model.persistence.PacoteDAO;

public class VenderPacoteBusiness {

    public boolean validarPacote(Pacote pacote){

        boolean info;

            try {
                pacoteFamilia(pacote);
                adicionarDespesa(pacote);
                vagasDisponiveis(pacote);
                info = true;
                if (info == true){
                    PacoteDAO.salvarPacote(pacote);
                }
            }catch (NullPointerException e){
                //TODO MOSTRAR MENSAGEM DE ERRO
                info = false;
            }
        return info;
    }

    public void adicionarDespesa(Pacote pacote)throws NullPointerException{

        if(pacote.getDespesa() == 0){
            throw new NullPointerException();
        }else{
            double despesa = pacote.getValor() - (pacote.getDespesa() * pacote.getPessoas());
            pacote.setValor(despesa);
        }
    }

    public void pacoteFamilia(Pacote pacote)throws NullPointerException{

        if(pacote.getQtdClientes() == 0){
            throw new NullPointerException();
        }else{
            double valorTotal = pacote.getValor() * pacote.getPessoas();
            pacote.setValor(valorTotal);
        }
    }

    public void vagasDisponiveis(Pacote pacote){
        pacote.setQtdClientes(pacote.getQtVagas() - pacote.getQtdClientes());
    }
}