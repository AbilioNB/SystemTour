package Controllers;

import business.AdministradorBusiness;
import model.beans.Administrador;
import model.persistence.AdminDAO;
import view.AdministradorView;

public class AdministradorController {

    private boolean valorLogin, valorEmail, valorCPF, valorTel, valorData;

    AdministradorBusiness ab = new AdministradorBusiness();
    AdministradorView av = new AdministradorView();

    public Boolean CadastrarAdminitrador(Administrador buffer){

        Boolean retorno = false;

        valorLogin = ab.validarLogin(buffer.getLogin());
        valorEmail = ab.validarEmail(buffer.getEmail());
        valorCPF = ab.validarCPF(buffer.getCpf());
        valorTel = ab.validarTel(buffer.getTelefone());
        valorData = ab.validarData(buffer.getData());


        //TODO Validação de Login
        //if(valorLogin != true){
        //    av.mensagemErroLogin();
        //}

        if(valorEmail != true || valorCPF != true || valorTel != true || valorData != true){
            av.mensagemErro();
        }

        if(valorLogin == true && valorEmail == true && valorCPF == true && valorTel == true && valorData == true){

            if(buffer.getLogin() == "admin"){
                AdminDAO.salvarAdmin(buffer);
            }else{
                av.mensagemCadastro();
                AdminDAO.salvarAdmin(buffer);
                retorno = true;
            }

        }
    return retorno;
    }

}
