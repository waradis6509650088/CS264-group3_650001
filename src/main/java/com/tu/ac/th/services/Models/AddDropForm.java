package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddDropForm {
    private String id;
    private String date;
    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private String studentYear;
    private String studyField;
    private String advisor;
    private String addressNumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private String postalCode;
    private String mobilePhone;
    private String phone;
    private String cause;
    private String addSubjectList;
    private String dropSubjectList;

    // Constructors

    public AddDropForm(String jsonString) {
        JSONParser parser = new JSONParser();
        try{
            JSONObject json = (JSONObject) parser.parse(jsonString);
            this.id = (String) json.get("id");
            this.date = (String) json.get("date");
            this.studentFirstName = (String) json.get("studentFirstName");
            this.studentLastName = (String) json.get("studentLastName");
            this.studentId = (String) json.get("studentId");
            this.studentYear = (String) json.get("studentYear");
            this.studyField = (String) json.get("studyField");
            this.advisor = (String) json.get("advisor");
            this.addressNumber = (String) json.get("addressNumber");
            this.moo = (String) json.get("moo");
            this.tumbol = (String) json.get("tumbol");
            this.amphur = (String) json.get("amphur");
            this.province = (String) json.get("province");
            this.postalCode = (String) json.get("postalCode");
            this.mobilePhone = (String) json.get("mobilePhone");
            this.phone = (String) json.get("phone");
            this.cause = (String) json.get("cause");
            this.addSubjectList = (String) json.get("addSubjectList").toString();
            this.dropSubjectList = (String) json.get("dropSubjectList").toString();
        }catch(Exception e){
            System.out.println("Failed to parse json string");
        }
        
    }
    public AddDropForm() {
        super();
    }

    @Override
    public String toString() {
        return "addDropForm{" +
                "id=" + this.id +
                ", date=" + this.date +
                ", studentFirstName='" + this.studentFirstName + '\'' +
                ", studentLastName='" + this.studentLastName + '\'' +
                ", studentId='" + this.studentId + '\'' +
                ", studentYear='" + this.studentYear + '\'' +
                ", studyField='" + this.studyField + '\'' +
                ", advisor='" + this.advisor + '\'' +
                ", addressNumber='" + this.addressNumber + '\'' +
                ", moo='" + this.moo + '\'' +
                ", tumbol='" + this.tumbol + '\'' +
                ", amphur='" + this.amphur + '\'' +
                ", province='" + this.province + '\'' +
                ", postalCode='" + this.postalCode + '\'' +
                ", mobilePhone='" + this.mobilePhone + '\'' +
                ", phone='" + this.phone + '\'' +
                ", cause='" + this.cause + '\'' +
                ", addSubjectList='" + this.addSubjectList + '\'' +
                ", dropSubjectList='" + this.dropSubjectList + '\'' +
                '}';
    }
    // Getter and Setter Methods for all fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudyField() {
        return studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getTumbol() {
        return tumbol;
    }

    public void setTumbol(String tumbol) {
        this.tumbol = tumbol;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getAddSubjectList() {
        return addSubjectList;
    }

    public void setAddSubjectList(String addSubjectList) {
        this.addSubjectList = addSubjectList;
    }

    public String getDropSubjectList() {
        return dropSubjectList;
    }

    public void setDropSubjectList(String dropSubjectList) {
        this.dropSubjectList = dropSubjectList;
    }
}
