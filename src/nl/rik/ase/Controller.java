/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rik.ase;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.openide.util.Exceptions;

/**
 *
 * @author Rik
 */
public class Controller {
    
    public static JSONObject getWeather(String countryCode, String city) {
        JSONObject jsonResponse = null;
        
        try {
            jsonResponse = JsonReader.readJsonFromUrl("http://api.openweathermap.org/data/2.5/weather?q="+city+","+countryCode+"&appid=cf2f84ffb6cd60e1459c5e111a5c8782");
            System.out.println(jsonResponse.toString());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (JSONException ex) {
            Exceptions.printStackTrace(ex);
        }
        
        return jsonResponse;
    }
    
    public static JSONObject getLocation() {
        JSONObject jsonResponse = null;
        
        try {
            jsonResponse = JsonReader.readJsonFromUrl("http://ip-api.com/json");
            System.out.println(jsonResponse.toString());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (JSONException ex) {
            Exceptions.printStackTrace(ex);
        }
        
        return jsonResponse;
    }
    
}
