/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author kanya
 */
public class CovidCaseRound1To2 {
    public static void main(String [] args) throws Exception {
        String filepath = "/home/kanya/NetBeansProjects/ClassWorkTest/covid_round1to2_all.json";
        writeData(filepath);
        readData(filepath);
    }
    
    public static ResultSet insertData(long year, long weeknum, long new_case, long total_case, long new_case_excludeabroad, long total_case_excludeabroad, 
            long new_recovered, long total_recovered, long new_death, long total_death, String update_date, long case_foreign, long case_prison, 
            long case_walkin, long case_new_prev, long case_new_diff, long death_new_prev, long death_new_diff) throws Exception {
      //Getting the connection
      String mysqlUrl = "jdbc:derby://localhost:1527/CovidRound1To2All";
      Connection con = DriverManager.getConnection(mysqlUrl, "app", "app");
      System.out.println("Connection established......");
      //Creating the Statement
      Statement statement = con.createStatement();
      //Retrieving the records
      // insert the data
      statement.executeUpdate("INSERT INTO CovidRound1To2All"
              + "(years, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad, new_recovered, total_recovered, "
              + "new_death, total_death, update_date, case_foreign, case_prison, case_walkin, case_new_prev, case_new_diff, death_new_prev, death_new_diff)" 
              + "VALUES ("
              + year + ","
              + weeknum + ","
              + new_case + "," 
              + total_case + "," 
              + new_case_excludeabroad + ","  
              + total_case_excludeabroad + ","
              + new_recovered + ","
              + total_recovered + ","
              + new_death + "," 
              + total_death + "," 
              + "'" + update_date + "'" + ","
              + case_foreign + "," 
              + case_prison + ","
              + case_walkin + ","
              + case_new_prev + ","
              + case_new_diff + ","
              + death_new_prev + ","
              + death_new_diff
              + ")");
      ResultSet rs = statement.executeQuery("Select * from CovidRound1To2All");
      return rs;
   }
    
   public static void readData(String filepath) {
    //JSON parser object to parse read file
    JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader(filepath))
    {
        //Read JSON file
        Object obj = jsonParser.parse(reader);

        JSONArray list = (JSONArray) obj;
        System.out.println(list);

        //Iterate over employee array
        list.forEach( emp -> {
            try {
                parseClassroomObject( (JSONObject) emp );
            } catch (Exception ex) {
                Logger.getLogger(CovidCaseRound1To2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } );

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }   catch (org.json.simple.parser.ParseException ex) { 
            Logger.getLogger(CovidCaseRound1To2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
   }
   
   private static void parseClassroomObject(JSONObject data) throws Exception 
    {
        //Get employee object within list
        System.out.println("------------------------------------");
        //JSONObject classworkObject = (JSONObject) data.get("");
        long year = (long) data.get("year");
        long weeknum = (long) data.get("weeknum");  
        String province = (String) data.get("province");
        long new_case = (long) data.get("new_case");
        long total_case = (long) data.get("total_case"); 
        long new_case_excludeabroad = (long) data.get("new_case_excludeabroad");
        long total_case_excludeabroad = (long) data.get("total_case_excludeabroad");
        long new_death = (long) data.get("new_death");
        long total_death = (long) data.get("total_death");
        String update_date = (String) data.get("update_date");
        long new_recovered = (long) data.get("new_recovered");
        long total_recovered = (long) data.get("total_recovered");
        long case_foreign = (long) data.get("case_foreign");
        long case_prison = (long) data.get("case_prison");
        long case_walkin = (long) data.get("case_walkin");
        long case_new_prev = (long) data.get("case_new_prev");
        long case_new_diff = (long) data.get("case_new_diff");
        long death_new_prev = (long) data.get("death_new_prev");
        long death_new_diff = (long) data.get("death_new_diff");
        
        System.out.println("year : " + year);
        System.out.println("weeknum : " + weeknum);   
        System.out.println("new_case : " + new_case);
        System.out.println("total_case : " + total_case);   
        System.out.println("new_case_excludeabroad : " + new_case_excludeabroad);
        System.out.println("total_case_excludeabroad : " + total_case_excludeabroad);
        System.out.println("new_recovered : " + new_recovered);
        System.out.println("total_recovered : " + total_recovered);
        System.out.println("new_death : " + new_death);   
        System.out.println("total_death : " + total_death);
        System.out.println("case_foreign : " + case_foreign);
        System.out.println("case_prison : " + case_prison);
        System.out.println("case_walkin : " + case_walkin);
        System.out.println("case_new_prev : " + case_new_prev);
        System.out.println("case_new_diff : " + case_new_diff);
        System.out.println("death_new_prev : " + death_new_prev);
        System.out.println("death_new_diff : " + death_new_diff);
        System.out.println("update_date : " + update_date);
        insertData(year, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad, new_recovered, total_recovered, new_death, 
        total_death, update_date, case_foreign, case_prison, case_walkin, case_new_prev, case_new_diff, death_new_prev, death_new_diff); 
    }
 
    
    public static void writeData(String filepath){
        try {
            URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/round-1to2-all");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            FileWriter file = new FileWriter(filepath);
            String output;
            System.out.println("Output from Server .... \n");
            //write output to json file 
            while ((output = br.readLine()) != null) {
               System.out.println(output);
               file.write(output);
            }          
            file.close();
      
            System.out.println("JSON file created......");
            conn.disconnect();

        } catch (MalformedURLException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
