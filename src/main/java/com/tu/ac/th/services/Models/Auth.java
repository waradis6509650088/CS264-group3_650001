package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Auth {
    String id;
    String loginTime;

    public Auth(String authInfoString){
        JSONParser parser = new JSONParser();
        try{
            JSONObject jsonObject = (JSONObject) parser.parse(authInfoString);
            this.id = (String) jsonObject.get("ID KEY");
            this.loginTime = (String) jsonObject.get("LOGIN TIME KEY");
        }   catch (ParseException e) {
                System.out.println("Failed to parse JSON string.");
        }
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    
    
}
