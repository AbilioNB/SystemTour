package systemtour;

import model.beans.Pacote;
import model.persistence.PacoteDAO;

import java.util.Random;

public class VenderPacoteBusiness {

    public boolean validarPacote(Pacote pacote, Double valor){

        boolean info;

            try {
                pacoteFamilia(pacote, valor);
                //adicionarDespesa(pacote);
                vagasDisponiveis(pacote);
                parcelasPacote(pacote);
                info = true;
            }catch (NullPointerException e){
                //TODO MOSTRAR MENSAGEM DE ERRO
                info = false;
            }
        return info;
    }

    public boolean salvarPacote(Pacote pacote, Double valor){

        boolean info = false, check;
        try{
            check = validarPacote(pacote, valor);
            if(check == true){
                Random gerarId = new Random();
                int geradorId = gerarId.nextInt(10001);
                String id = Integer.toString(geradorId);
                pacote.setIdPassar(id);
                PacoteDAO.salvarPacote(pacote);
                info = true;
            }
        }catch (NullPointerException e){
            System.out.println("errou");
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

    public void parcelasPacote(Pacote pacote){

        double calculo = pacote.getValorTotal() / pacote.getParcelas();
        pacote.setValorParcelado(calculo);
    }

    public void pacoteFamilia(Pacote pacote, Double valor)throws NullPointerException{

        if(pacote.getQtdClientes() == 0){
            throw new NullPointerException();
        }else{
            Double valorTotal = valor * pacote.getQtdClientes();
            pacote.setValorTotal(valorTotal);
        }
    }

    public void vagasDisponiveis(Pacote pacote){
        pacote.setQtdClientes(pacote.getQtVagas() - pacote.getQtdClientes());
    }
}