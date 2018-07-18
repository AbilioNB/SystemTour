package Controllers;

import business.AdministradorBusiness;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Main;
import view.AdministradorView;

public class LoginController {

    @FXML
    private TextField admROOT, senhaROOT;
    private Button btnLogin;
    private Boolean retorno;

    @FXML
    protected void buttonAction(javafx.event.ActionEvent actionEvent) {

        AdministradorBusiness ab = new AdministradorBusiness();
        AdministradorView av = new AdministradorView();

        String loginroot = admROOT.getText();
        String senharoot = senhaROOT.getText();

        retorno = ab.validarRoot(loginroot, senharoot);
        if(retorno == true){
            Main.trocaTela("Entrar");
        }
        if(retorno == false){
            av.mensagemErroLogin();
        }
    }
}
