package br.ufrpe.systemtour.business;

import model.beans.Cliente;
import model.persistence.ClienteDAO;
import view.ClienteView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClienteBusiness {

    ClienteView cv = new ClienteView();

    private void validarEmail(String email) throws NullPointerException{

        int i = email.indexOf("@");
        if (i < 0) {
            throw new NullPointerException();
        }
    }

    private void validarCPF(String cpf) throws NullPointerException{

        char dig1, dig2;
        int diminui = 11, resultado;
        int soma = 0, num;

            if (cpf.length() != 11) {
                throw new NullPointerException();
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

            if (dig1 == cpf.charAt(9) && (dig2 == cpf.charAt(10))) {} else {
                throw new NullPointerException();
            }
    }

    private void validarTel(String tel) throws NullPointerException {

        Boolean info;

        if ((tel == null) || (tel.length() != 14)) {
            throw new NullPointerException();
        } else {
            info = true;
        }
    }

    private Boolean validarData(String data){

        Boolean info = true;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date dataPronta = formato.parse(data);
        } catch (ParseException e) {
            //TODO ALTERAR EXCEÇÃO
            System.out.println(e.getMessage());
            info = false;
        }
        return info;
    }

    private int calcularIdade(String data, String pattern){

        DateFormat sdf = new SimpleDateFormat(pattern);

        Date dataNascInput = null;

        try {
            dataNascInput= sdf.parse(data);
        } catch (Exception e) {}

        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.setTime(dataNascInput);
        Calendar today = Calendar.getInstance();

        int idade = today.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        dataNascimento.add(Calendar.YEAR, idade);

        if (today.before(dataNascimento)) {
            idade--;
        }
        return idade;
    }

    public void validarCliente(Cliente clienteBuffer){

        try {
            validarEmail(clienteBuffer.getEmail());
            validarCPF(clienteBuffer.getCpf());
            validarTel(clienteBuffer.getTelefone());
            validarData(clienteBuffer.getData());
            int idade = calcularIdade(clienteBuffer.getData(), "dd/MM/yyyy");
            clienteBuffer.setIdade(idade);
            cv.mensagemCadastrado();
            ClienteDAO.salvarCliente(clienteBuffer);
        }catch (NullPointerException e){
            cv.mensagemErro();
        }
    }
}