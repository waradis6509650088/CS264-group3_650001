package com.tu.ac.th.services.Models;

import java.sql.Date;
import java.sql.Time;

import org.json.simple.JSONObject;

public class NormalForm {
    private String id;
    private String fname;
    private String lname;
    private Date date;
    private Time time;
    private String topic;
    private String topicInfo;
    private String profOp;
    private String headOp;
    private String deanAssistOp;
    private String deanOp;

    // Constructors

    public NormalForm(JSONObject json) {
        this.id = (String) json.get("id");
        this.fname = (String) json.get("fname");
        this.lname = (String) json.get("lname");
        this.date = (Date) json.get("date");
        this.time = (Time) json.get("time");
        this.topic = (String) json.get("topic");
        this.topicInfo = (String) json.get("topicInfo");
        this.profOp = (String) json.get("profOp");
        this.headOp = (String) json.get("headOp");
        this.deanAssistOp = (String) json.get("deanAssistOp");
        this.deanOp = (String) json.get("deanOp");
    }

    // Getter and Setter Methods for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicInfo() {
        return topicInfo;
    }

    public void setTopicInfo(String topicInfo) {
        this.topicInfo = topicInfo;
    }

    public String getProfOp() {
        return profOp;
    }

    public void setProfOp(String profOp) {
        this.profOp = profOp;
    }

    public String getHeadOp() {
        return headOp;
    }

    public void setHeadOp(String headOp) {
        this.headOp = headOp;
    }

    public String getDeanAssistOp() {
        return deanAssistOp;
    }

    public void setDeanAssistOp(String deanAssistOp) {
        this.deanAssistOp = deanAssistOp;
    }

    public String getDeanOp() {
        return deanOp;
    }

    public void setDeanOp(String deanOp) {
        this.deanOp = deanOp;
    }
}