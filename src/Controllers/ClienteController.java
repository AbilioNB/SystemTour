package Controllers;

import business.ClienteBusiness;
import model.beans.Cliente;
import model.persistence.ClienteDAO;
import view.ClienteView;

public class ClienteController {

    private boolean valorEmail, valorCPF, valorTel, valorIdade, valorData = true;

    ClienteBusiness cb = new ClienteBusiness();
    ClienteView cv = new ClienteView();

    public Boolean cadastrarCliente(Cliente buffer){

        Boolean ret = false;

        valorEmail = cb.validarEmail(buffer.getEmail());
        valorTel = cb.validarTel(buffer.getTelefone());
        valorCPF = cb.validarCPF(buffer.getCpf());
        valorData = cb.validarIdade(buffer.getData());

        if(valorEmail != true || valorTel != true ||valorCPF != true || valorData != true){
            cv.mensagemErro();
        }

        if(valorCPF == true && valorTel == true && valorEmail == true &&  valorData == true){
            cv.mensagemCadastrado();
            ClienteDAO.salvarCliente(buffer);
            ret = true;
        }
        return ret;
    }
}
