/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Covidcaseallpro;

/**
 *
 * @author kanya
 */
@WebService(serviceName = "CovidCaseAll")
public class CovidCaseAll {    

    @WebMethod(operationName = "findCovidCaseAllById")
    public Covidcaseallpro findCovidCaseAllById(@WebParam(name = "id") int id) {
        Covidcaseallpro c = findCovidCaseAllByIdService(id);
        return c;
    }
    
    @WebMethod(operationName = "findCovidCaseAll")
    public List<Covidcaseallpro> findCovidCaseAll() {
        List<Covidcaseallpro> c = findCovidCaseAllService();
        return c;
    }
    
    @WebMethod(operationName = "findCovidCaseAllByWeeknum")
    public List<Covidcaseallpro> findCovidCaseAllByWeeknum(@WebParam(name = "weeknum") int weeknum) {
       List<Covidcaseallpro> c = findCovidCaseAllWeeknumService(weeknum);
       return c;
    }
    
    public static Covidcaseallpro findCovidCaseAllByIdService(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseAllProjectPU");
        EntityManager em = emf.createEntityManager();
        Covidcaseallpro c = em.find(Covidcaseallpro.class, id);
        if (c == null) {
            return null;
        }
        em.close();
        return c;
    }

    public static List<Covidcaseallpro> findCovidCaseAllService() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseAllProjectPU");
        EntityManager em = emf.createEntityManager();
        List<Covidcaseallpro> c = (List<Covidcaseallpro>) em.createNamedQuery("Covidcaseallpro.findAll").getResultList();
        em.close();
        return c;
    }
    
    public static List<Covidcaseallpro> findCovidCaseAllWeeknumService(int weeknum) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidCaseAllProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Covidcaseallpro.findByWeeknum");
        query.setParameter("weeknum", weeknum);
        List<Covidcaseallpro> c = (List<Covidcaseallpro>) query.getResultList();
        em.close();
        return c;
    }

}
