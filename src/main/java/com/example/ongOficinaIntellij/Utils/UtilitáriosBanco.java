package com.example.ongOficinaIntellij.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UtilitáriosBanco {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void initConection(){
        emf = Persistence.createEntityManagerFactory("exemploPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public static Query createQuery(String sql){
        return em.createQuery(sql);
    }


    public static void commit(){
        em.getTransaction().commit();
    }

}
