package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NormalForm {
    private String date;
    private String topic;
    private String studentInfo;
    private String address;
    private String advisor;
    private String caseData;

    // Constructor ที่ใช้ jsonString เป็นพารามิเตอร์
    public NormalForm(String jsonString) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(jsonString);
            // ดึงข้อมูลจาก JSON และกำหนดค่าให้กับ field ของ FormModel
            this.date = (String) json.get("date");
            this.topic = (String) json.get("topic");

            // สร้าง String จาก JSON string ของ studentInfo
            this.studentInfo = json.get("studentInfo").toString();

            // สร้าง String จาก JSON string ของ address
            this.address = json.get("address").toString();

            this.advisor = (String) json.get("advisor");

            // สร้าง String จาก JSON string ของ caseData
            this.caseData = json.get("caseData").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getters and Setters (ตัวอย่างเพียงคลาสเดียว)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(String studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getCaseData() {
        return caseData;
    }

    public void setCaseData(String caseData) {
        this.caseData = caseData;
    }
}