/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidcaseallprojectclient;

import java.util.List;
import services.Covidcaseallpro;

/**
 *
 * @author kanya
 */
public class CovidCaseAllProjectClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Covidcaseallpro> all = findCovidCaseAll();
        System.out.println(all);
        Covidcaseallpro id = findCovidCaseAllById(1);
        System.out.println(id.getNewCase());
        System.out.println(id.getNewDeath());
        List<Covidcaseallpro> week = findCovidCaseAllByWeeknum(23);
        System.out.println(week);
    }

    private static java.util.List<services.Covidcaseallpro> findCovidCaseAll() {
        services.CovidCaseAll_Service service = new services.CovidCaseAll_Service();
        services.CovidCaseAll port = service.getCovidCaseAllPort();
        return port.findCovidCaseAll();
    }

    private static Covidcaseallpro findCovidCaseAllById(int id) {
        services.CovidCaseAll_Service service = new services.CovidCaseAll_Service();
        services.CovidCaseAll port = service.getCovidCaseAllPort();
        return port.findCovidCaseAllById(id);
    }

    private static java.util.List<services.Covidcaseallpro> findCovidCaseAllByWeeknum(int weeknum) {
        services.CovidCaseAll_Service service = new services.CovidCaseAll_Service();
        services.CovidCaseAll port = service.getCovidCaseAllPort();
        return port.findCovidCaseAllByWeeknum(weeknum);
    }
    
    
    
}
