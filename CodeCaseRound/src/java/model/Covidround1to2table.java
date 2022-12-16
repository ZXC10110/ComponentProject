/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kanya
 */
public class Covidround1to2table {
    
    public static Covidround1to2all findCovidRound1To2ById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseRound1To2PU");
        EntityManager em = emf.createEntityManager();
        Covidround1to2all c = em.find(Covidround1to2all.class, id);
        if (c == null) {
            return null;
        }
        em.close();
        return c;
    }
    
     public static Covidround1to2all updateCovidRound1To2(Covidround1to2all c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseRound1To2PU");
        EntityManager em = emf.createEntityManager();
        Covidround1to2all fromDb = em.find(Covidround1to2all.class, c.getId());
        if (fromDb == null) {
            return null;
        }
        try {
            fromDb.setNewCase(c.getNewCase());
            fromDb.setNewDeath(c.getNewDeath());
            em.getTransaction().begin();
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return fromDb;
    }
     
     public static Covidround1to2all removeCovidRound1To2(Covidround1to2all c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseRound1To2PU");
        EntityManager em = emf.createEntityManager();
        Covidround1to2all fromDb = em.find(Covidround1to2all.class,  c.getId());
        if (fromDb == null) {
            return null;
        }
        try {
            em.getTransaction().begin();
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

}
