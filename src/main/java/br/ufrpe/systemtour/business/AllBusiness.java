package br.ufrpe.systemtour.business;


import br.ufrpe.systemtour.model.persistence.*;

public  class AllBusiness {


    public void gravarHashs(){
       AdminDAO.setHash();
       ClienteDAO.setHash();
       PacoteDAO.setHash();
       PagamentoDAO.setHash();
        ViagensDAO.setHash();
    }

    public void recuperarHashs(){
        AdminDAO.getHash();
        ClienteDAO.getHash();
        PacoteDAO.getHash();
        PagamentoDAO.getHash();
        ViagensDAO.getHash();

    }
}
