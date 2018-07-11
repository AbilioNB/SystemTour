package model.beans;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    ArrayList<Viagem> viagensFeitas = new ArrayList();

    public static Boolean validarEmail(String email) {

        Boolean resp = true;

        int i = email.indexOf("@");
        if (i < 0) {
            resp = false;
        }
        return resp;
    }

    public static Boolean validarCPF(String cpf) {

        char dig1, dig2;
        int diminui = 11, resultado;
        int soma = 0, num;

        if (cpf.length() != 11) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            num = (int) (cpf.charAt(i) - 48);
            diminui = diminui - 1;
            soma = soma + (num * diminui);
        }
        resultado = 11 - (soma % 11);
        if (resultado == 10 || resultado == 11) {
            dig1 = '0';
        } else {
            dig1 = (char) (resultado + 48);
        }

        ///////////////////////////////////////////////////////////////


        int diminui2 = 12, resultado2 = 0;
        int soma2 = 0, num2;

        for (int j = 0; j < 10; j++) {
            num2 = (int) (cpf.charAt(j) - 48);
            diminui2 = diminui2 - 1;
            soma2 = soma2 + (num2 * diminui2);
        }

        resultado2 = 11 - (soma2 % 11);

        if (resultado2 == 10 || resultado2 == 11) {
            dig2 = '0';
        } else {
            dig2 = (char) (resultado2 + 48);
        }

        if (dig1 == cpf.charAt(9) && (dig2 == cpf.charAt(10))) {
            return (true);
        } else {
            return (false);
        }
    }

    public static Boolean validarTel(String tel) {
        Boolean info = true;
        if ((tel == null) || (tel.length() != 14)) {
            System.out.println("funcionou");
            info = false;
        } else {
            info = true;
        }
        return info;
    }
}
