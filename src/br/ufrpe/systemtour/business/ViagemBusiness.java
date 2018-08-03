package br.ufrpe.systemtour.business;

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

    public void validarOrigemDestino(Viagem v) throws NullPointerException{

        if(v.getOrigem() == null || v.getDestino()== null){
            vv.mensagemErroOrigemeDestino();
            throw new NullPointerException();
        } else{}
    }

    public void validarViagem(Viagem viagem){

        try {
            validarData(viagem.getPartida());
            validarData(viagem.getChegada());
            validarOrigemDestino(viagem);
            viagem.setAtivo(1);
            ViagensDAO.salvarViagem(viagem);

        }catch (NullPointerException e){
            vv.mensagemErroData();
        }
    }
}