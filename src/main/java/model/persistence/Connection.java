package model.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistarq");
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
