package Libreria1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class mainprincipal {

    public static void main(String[] args) {
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager en = emf.createEntityManager();
    }
    
}
