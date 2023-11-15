package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NormalForm {
    private long id;
    private Date date;
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
    private String tamasatFac;
    private String tamasatField;
    private String otherFac;
    private String otherField;
    private String otherOptionTopic;
    private String otherCause;

    // Constructors

    public NormalForm(String jsonString) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(jsonString);
            this.id = (Long) json.get("id");
            this.date = new SimpleDateFormat("yyyy-MM-dd").parse((String) json.get("date"));
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
            this.tamasatFac = (String) json.get("tamasatFac");
            this.tamasatField = (String) json.get("tamasatField");
            this.otherFac = (String) json.get("otherFac");
            this.otherField = (String) json.get("otherField");
            this.otherOptionTopic = (String) json.get("otherOptionTopic");
            this.otherCause = (String) json.get("otherCause");
        } catch (Exception e) {
            System.out.println("Failed to parse json string");
        }
    }

    public NormalForm() {
        // Default constructor
    }

    // Getter and Setter Methods for all fields

    // ... (same as in AddDropForm class)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public String getTamasatFac() {
        return tamasatFac;
    }

    public void setTamasatFac(String tamasatFac) {
        this.tamasatFac = tamasatFac;
    }

    public String getTamasatField() {
        return tamasatField;
    }

    public void setTamasatField(String tamasatField) {
        this.tamasatField = tamasatField;
    }

    public String getOtherFac() {
        return otherFac;
    }

    public void setOtherFac(String otherFac) {
        this.otherFac = otherFac;
    }

    public String getOtherField() {
        return otherField;
    }

    public void setOtherField(String otherField) {
        this.otherField = otherField;
    }

    public String getOtherOptionTopic() {
        return otherOptionTopic;
    }

    public void setOtherOptionTopic(String otherOptionTopic) {
        this.otherOptionTopic = otherOptionTopic;
    }

    public String getOtherCause() {
        return otherCause;
    }

    public void setOtherCause(String otherCause) {
        this.otherCause = otherCause;
    }
}