/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Covidround1to2all;
import model.Covidround1to2table;

/**
 *
 * @author kanya
 */
@WebService(serviceName = "CovidCaseRound1To2")
public class CovidCaseRound1To2 {
    
    @WebMethod(operationName = "findCovidCaseRound1To2ById")
    public Covidround1to2all findCovidCaseRound1To2ById(@WebParam(name = "id") int id) {
        Covidround1to2all c = Covidround1to2table.findCovidRound1To2ById(id);
        return c;
    }

   @WebMethod(operationName = "updateCovidCaseRound1To2ById")
    public Covidround1to2all updateCovidCaseRound1To2ById(@WebParam(name = "id") int id, @WebParam(name = "new_case") int new_case, @WebParam(name = "new_death") int new_death) {
        Covidround1to2all c = new Covidround1to2all();
        c.setId(id);
        c.setNewCase(new_case);
        c.setNewDeath(new_death);
        Covidround1to2all update = Covidround1to2table.updateCovidRound1To2(c);
        if (update == null) {
            return null;
        }
        return c;
    }
    
    @WebMethod(operationName = "removeCovidCaseRound1To2ById")
    public Covidround1to2all removeCovidCaseRound1To2ById(@WebParam(name = "id") int id) {
        Covidround1to2all c = new Covidround1to2all();
        c.setId(id);
        Covidround1to2all remove = Covidround1to2table.removeCovidRound1To2(c);
        if (remove == null) {
            return null;
        }
        return c;
    }
}
