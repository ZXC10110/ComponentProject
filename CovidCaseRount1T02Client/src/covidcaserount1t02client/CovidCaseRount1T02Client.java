/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidcaserount1t02client;

import services.Covidround1To2All;

/**
 *
 * @author kanya
 */
public class CovidCaseRount1T02Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Covidround1To2All id = findCovidCaseRound1To2ById(5);
       System.out.println(id.getId());
       System.out.println(id.getNewCase());
       
       Covidround1To2All remove = removeCovidCaseRound1To2ById(4);
       Covidround1To2All update = updateCovidCaseRound1To2ById(5, 56, 2);
       
       System.out.println(update.getId());
       System.out.println(update.getNewCase());
    }

    private static Covidround1To2All findCovidCaseRound1To2ById(int id) {
        services.CovidCaseRound1To2_Service service = new services.CovidCaseRound1To2_Service();
        services.CovidCaseRound1To2 port = service.getCovidCaseRound1To2Port();
        return port.findCovidCaseRound1To2ById(id);
    }

    private static Covidround1To2All removeCovidCaseRound1To2ById(int id) {
        services.CovidCaseRound1To2_Service service = new services.CovidCaseRound1To2_Service();
        services.CovidCaseRound1To2 port = service.getCovidCaseRound1To2Port();
        return port.removeCovidCaseRound1To2ById(id);
    }

    private static Covidround1To2All updateCovidCaseRound1To2ById(int id, int newCase, int newDeath) {
        services.CovidCaseRound1To2_Service service = new services.CovidCaseRound1To2_Service();
        services.CovidCaseRound1To2 port = service.getCovidCaseRound1To2Port();
        return port.updateCovidCaseRound1To2ById(id, newCase, newDeath);
    } 
}
