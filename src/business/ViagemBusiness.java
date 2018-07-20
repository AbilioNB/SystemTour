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

    public Boolean validarOrigemDestino(String origem, String destino){

        Boolean info;

        if(origem == null || destino == null){
            vv.mensagemErroOrigemeDestino();
            info = false;
        } else {
            info = true;
        }
    return info;
    }

    public void validarViagem(Viagem viagem){

        ViagensDAO salvar = new ViagensDAO();

        boolean dataPartida, dataChegada, origemEDestino;

        dataPartida = validarData(viagem.getPartida());
        dataChegada = validarData(viagem.getChegada());
        origemEDestino = validarOrigemDestino(viagem.getOrigem(), viagem.getDestino());

        if(dataPartida == true && dataChegada == true && origemEDestino == true){
            salvar.salvarViagem(viagem);
        }

        if(dataPartida == false || dataChegada == false || origemEDestino == false){
            vv.mensagemErroData();
        }
    }
}