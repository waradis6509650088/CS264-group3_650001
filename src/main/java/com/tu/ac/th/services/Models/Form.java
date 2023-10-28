package com.tu.ac.th.services.Models;

import org.json.simple.JSONObject;

public class Form {
    private String username;
    private String date;
    private String topic;

    private String prefix;
    private String studentFirstName;

    private String studentLastName;
    private String studentId;
    private String studentYear;
    private String studyField;
    private String addressNumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private String postalCode;
    private String mobilePhone;
    private String phone;
    private String advisor;
    private String wantTu;
    private String term;
    private String year;
    private String cause;
    private String OtherFac;
    private String OtherField;
    private String wantOther;
    private String FacOther;
    private String FieldOther;
    private String numDebt;
    private String grade;
    private String Nograde;
    private String Defement;
    private String DefementTerm;
    private String OtherOption;
    private String OtherOptionTopic;
    private String Because;
    private String CheckStatus;

    public Form(JSONObject json){
        this.setUsername((String) json.get("username"));
        this.setDate((String) json.get("date"));
        this.setTopic((String) json.get("topic"));
        this.setPrefix((String) json.get("prefix"));
        this.setStudentFirstName((String) json.get("studentFirstName"));
        this.setStudentLastName((String) json.get("studentLastName"));
        this.setStudentId((String) json.get("studentId"));
        this.setStudentYear((String) json.get("studentYear"));
        this.setStudyField((String) json.get("studyField"));
        this.setAddressNumber((String) json.get("addressNumber"));
        this.setMoo((String) json.get("moo"));
        this.setTumbol((String) json.get("tumbol"));
        this.setAmphur((String) json.get("amphur"));
        this.setProvince((String) json.get("province"));
        this.setPostalCode((String) json.get("postalCode"));
        this.setMobilePhone((String) json.get("mobilePhone"));
        this.setPhone((String) json.get("phone"));
        this.setAdvisor((String) json.get("advisor"));
        this.setWantTu((String) json.get("wantTu"));
        this.setTerm((String) json.get("term"));
        this.setYear((String) json.get("year"));
        this.setCause((String) json.get("cause"));
        this.setOtherFac((String) json.get("OtherFac"));
        this.setOtherField((String) json.get("OtherField"));
        this.setWantOther((String) json.get("wantOther"));
        this.setFacOther((String) json.get("FacOther"));
        this.setFieldOther((String) json.get("FieldOther"));
        this.setNumDebt((String) json.get("numDebt"));
        this.setGrade((String) json.get("grade"));
        this.setNograde((String) json.get("Nograde"));
        this.setDefement((String) json.get("Defement"));
        this.setDefementTerm((String) json.get("DefementTerm"));
        this.setOtherOption((String) json.get("OtherOption"));
        this.setOtherOptionTopic((String) json.get("OtherOptionTopic"));
        this.setBecause((String) json.get("Because"));
        this.setCheckStatus((String) json.get("CheckStatus"));
    }



    //getter setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
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
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
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
    public String getAdvisor() {
        return advisor;
    }
    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }
    public String getWantTu() {
        return wantTu;
    }
    public void setWantTu(String wantTu) {
        this.wantTu = wantTu;
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
    public String getOtherFac() {
        return OtherFac;
    }
    public void setOtherFac(String otherFac) {
        OtherFac = otherFac;
    }
    public String getOtherField() {
        return OtherField;
    }
    public void setOtherField(String otherField) {
        OtherField = otherField;
    }
    public String getWantOther() {
        return wantOther;
    }
    public void setWantOther(String wantOther) {
        this.wantOther = wantOther;
    }
    public String getFacOther() {
        return FacOther;
    }
    public void setFacOther(String facOther) {
        FacOther = facOther;
    }
    public String getFieldOther() {
        return FieldOther;
    }
    public void setFieldOther(String fieldOther) {
        FieldOther = fieldOther;
    }
    public String getNumDebt() {
        return numDebt;
    }
    public void setNumDebt(String numDebt) {
        this.numDebt = numDebt;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getNograde() {
        return Nograde;
    }
    public void setNograde(String nograde) {
        Nograde = nograde;
    }
    public String getDefement() {
        return Defement;
    }
    public void setDefement(String defement) {
        Defement = defement;
    }
    public String getDefementTerm() {
        return DefementTerm;
    }
    public void setDefementTerm(String defementTerm) {
        DefementTerm = defementTerm;
    }
    public String getOtherOption() {
        return OtherOption;
    }
    public void setOtherOption(String otherOption) {
        OtherOption = otherOption;
    }
    public String getOtherOptionTopic() {
        return OtherOptionTopic;
    }
    public void setOtherOptionTopic(String otherOptionTopic) {
        OtherOptionTopic = otherOptionTopic;
    }
    public String getBecause() {
        return Because;
    }
    public void setBecause(String because) {
        Because = because;
    }
    public String getCheckStatus() {
        return CheckStatus;
    }
    public void setCheckStatus(String checkStatus) {
        CheckStatus = checkStatus;
    }

    
    

}
