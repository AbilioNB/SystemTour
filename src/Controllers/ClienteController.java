package Controllers;

import business.ClienteBusiness;
import javafx.scene.control.Alert;
import model.beans.Cliente;
import model.persistence.ClienteDAO;
import view.ClienteView;

public class ClienteController {

    private boolean valorEmail, valorCPF, valorTel, valorIdade = true;

    ClienteBusiness cb = new ClienteBusiness();
    ClienteView cv = new ClienteView();

    public Boolean cadastrarCliente(Cliente buffer){

        Boolean ret = false;

        valorEmail = cb.validarEmail(buffer.getEmail());
        if(valorEmail != true){
            cv.mensagemErro();
        }
        valorTel = cb.validarTel(buffer.getTelefone());
        if (valorTel != true){
            cv.mensagemErro();
        }

        valorCPF = cb.validarCPF(buffer.getCpf());
        if(valorCPF != true){
            cv.mensagemErro();
        }

        if(valorCPF == true && valorTel == true && valorEmail == true && valorIdade == true){
            cv.mensagemCadastrado();
            ClienteDAO.salvarCliente(buffer);
            ret = true;
        }
        return ret;
    }
}
