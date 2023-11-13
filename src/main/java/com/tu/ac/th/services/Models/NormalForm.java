package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NormalForm {
    private String requestType;
    private String term;
    private String year;
    private String cause;
    private String tamasatInfo;
    private String otherInfo;

   
    // Constructors
    public NormalForm(){
        super();
    }


    public NormalForm(String jsonString) {
        JSONParser parser = new JSONParser();
        try{
            JSONObject json = (JSONObject) parser.parse(jsonString);
            this.requestType = (String) json.get("requestType");
            this.term = (String) json.get("term");
            this.year = (String) json.get("year");
            this.cause = (String) json.get("cause");
    
            JSONObject tamasatInfoJson = (JSONObject) json.get("tamasatInfo");
            this.tamasatInfo = tamasatInfoJson.toJSONString();
    
            JSONObject otherInfoJson = (JSONObject) json.get("otherInfo");
            this.otherInfo = otherInfoJson.toJSONString();
        }
        catch(Exception e){
            System.out.println("Failed to parse json string");
        }
    }

     public String getRequestType() {
        return requestType;
    }


    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }


    public String getTerm() {
        return term;
    }


    public void setTerm(String term) {
        this.term = term;
    }


    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }


    public String getCause() {
        return cause;
    }


    public void setCause(String cause) {
        this.cause = cause;
    }


    public String getTamasatInfo() {
        return tamasatInfo;
    }


    public void setTamasatInfo(String tamasatInfo) {
        this.tamasatInfo = tamasatInfo;
    }


    public String getOtherInfo() {
        return otherInfo;
    }


    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }


}