package business;

import model.beans.Viagem;
import model.persistence.ViagensDAO;
import view.ViagemView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViagemBusiness {

    ViagemView vv = new ViagemView();



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


    public Boolean validarOrigemDestino(Viagem v){

        Boolean info;

        if(v.getOrigem() == null || v.getDestino()== null){
            vv.mensagemErroOrigemeDestino();
            info = false;
        } else {
            info = true;
        }
    return info;
    }

    public void adicionarDespesa(Viagem viagem){

        if(viagem.getDespesa() == 0){
            return;
        }else{
            double despesa = viagem.getValor() - (viagem.getDespesa() * viagem.getPessoas());
            viagem.setValor(despesa);
        }
    }

    public void pacoteFamilia(Viagem viagem){

        if(viagem.getPessoas() == 0){
            return;
        }else {
            double valorTotal = viagem.getValor() * viagem.getPessoas();
            viagem.setValor(valorTotal);
        }
    }

    public void validarViagem(Viagem viagem){

        ViagensDAO salvar = new ViagensDAO();

        boolean dataPartida, dataChegada, origemEDestino;

        dataPartida = validarData(viagem.getPartida());
        dataChegada = validarData(viagem.getChegada());

        pacoteFamilia(viagem);
        adicionarDespesa(viagem);



        if(dataPartida == true && dataChegada == true){
            viagem.setAtivo(1);
            salvar.salvarViagem(viagem);
            System.out.println(viagem.getValor());
        }

        if(dataPartida == false || dataChegada == false){
            vv.mensagemErroData();
        }
    }
}