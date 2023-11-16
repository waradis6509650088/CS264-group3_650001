package com.tu.ac.th.services.Models;

public class NormalForm {

    private String date;
    private String topic;
    private StudentInfo studentInfo;
    private Address address;
    private String advisor;
    private CaseData caseData;

    // Constructor with parameters
    public NormalForm() {
        this.date = "hi";
        this.topic = "hi";
        this.studentInfo = new StudentInfo();
        this.address = new Address();
        this.advisor = "hi";
        this.caseData = new CaseData();
    }
    public NormalForm(String date, String topic, StudentInfo studentInfo, Address address, String advisor, CaseData caseData) {
        this.date = date;
        this.topic = topic;
        this.studentInfo = studentInfo;
        this.address = address;
        this.advisor = advisor;
        this.caseData = caseData;
    }

    // Getters and setters...

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

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public CaseData getCaseData() {
        return caseData;
    }

    public void setCaseData(CaseData caseData) {
        this.caseData = caseData;
    }

    // Nested classes with constructors, getters, and setters...
    public static class StudentInfo {
        private String prefix;
        private String studentFirstName;
        private String studentLastName;
        private String studentId;
        private String studentYear;
        private String studyField;

        // Default constructor
        public StudentInfo() {
            this.prefix = "defaultPrefix";
            this.studentFirstName = "defaultFirstName";
            this.studentLastName = "defaultLastName";
            this.studentId = "defaultStudentId";
            this.studentYear = "defaultStudentYear";
            this.studyField = "defaultStudyField";
        }

        // Constructor with parameters
        public StudentInfo(String prefix, String studentFirstName, String studentLastName, String studentId, String studentYear, String studyField) {
            this.prefix = prefix;
            this.studentFirstName = studentFirstName;
            this.studentLastName = studentLastName;
            this.studentId = studentId;
            this.studentYear = studentYear;
            this.studyField = studyField;
        }

        // Getters and setters...

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
    }

    public static class Address {
        private String addressNumber;
        private String moo;
        private String tumbol;
        private String amphur;
        private String province;
        private String postalCode;
        private String mobilePhone;
        private String phone;

        // Default constructor
        public Address() {
            this.addressNumber = "defaultAddressNumber";
            this.moo = "defaultMoo";
            this.tumbol = "defaultTumbol";
            this.amphur = "defaultAmphur";
            this.province = "defaultProvince";
            this.postalCode = "defaultPostalCode";
            this.mobilePhone = "defaultMobilePhone";
            this.phone = "defaultPhone";
        }

        // Constructor with parameters
        public Address(String addressNumber, String moo, String tumbol, String amphur, String province, String postalCode, String mobilePhone, String phone) {
            this.addressNumber = addressNumber;
            this.moo = moo;
            this.tumbol = tumbol;
            this.amphur = amphur;
            this.province = province;
            this.postalCode = postalCode;
            this.mobilePhone = mobilePhone;
            this.phone = phone;
        }

        // Getters and setters...

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
    }

    public static class CaseData {
        private String requestType;
        private String term;
        private String year;
        private String cause;
        private TamasatInfo tamasatInfo;
        private OtherInfo otherInfo;
        private String because;
        private DebtInfo debtInfo;
        private DefermentInfo defermentInfo;
        private String otherOptionTopic;

        // Default constructor
        public CaseData() {
            this.requestType = "defaultRequestType";
            this.term = "defaultTerm";
            this.year = "defaultYear";
            this.cause = "defaultCause";
            this.tamasatInfo = new TamasatInfo();
            this.otherInfo = new OtherInfo();
            this.because = "defaultBecause";
            this.debtInfo = new DebtInfo();
            this.defermentInfo = new DefermentInfo();
            this.otherOptionTopic = "defaultOtherOptionTopic";
        }

        // Constructors with parameters
        public CaseData(String requestType, String term, String year, String cause, TamasatInfo tamasatInfo, OtherInfo otherInfo, String because, DebtInfo debtInfo, DefermentInfo defermentInfo, String otherOptionTopic) {
            this.requestType = requestType;
            this.term = term;
            this.year = year;
            this.cause = cause;
            this.tamasatInfo = tamasatInfo;
            this.otherInfo = otherInfo;
            this.because = because;
            this.debtInfo = debtInfo;
            this.defermentInfo = defermentInfo;
            this.otherOptionTopic = otherOptionTopic;
        }

        // Getters and setters...

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

        public TamasatInfo getTamasatInfo() {
            return tamasatInfo;
        }

        public void setTamasatInfo(TamasatInfo tamasatInfo) {
            this.tamasatInfo = tamasatInfo;
        }

        public OtherInfo getOtherInfo() {
            return otherInfo;
        }

        public void setOtherInfo(OtherInfo otherInfo) {
            this.otherInfo = otherInfo;
        }

        public String getBecause() {
            return because;
        }

        public void setBecause(String because) {
            this.because = because;
        }

        public DebtInfo getDebtInfo() {
            return debtInfo;
        }

        public void setDebtInfo(DebtInfo debtInfo) {
            this.debtInfo = debtInfo;
        }

        public DefermentInfo getDefermentInfo() {
            return defermentInfo;
        }

        public void setDefermentInfo(DefermentInfo defermentInfo) {
            this.defermentInfo = defermentInfo;
        }

        public String getOtherOptionTopic() {
            return otherOptionTopic;
        }

        public void setOtherOptionTopic(String otherOptionTopic) {
            this.otherOptionTopic = otherOptionTopic;
        }
    }

    public static class TamasatInfo {
        private String faculty;
        private String field;

        // Default constructor
        public TamasatInfo() {
            this.faculty = "defaultFaculty";
            this.field = "defaultField";
        }

        // Constructor with parameters
        public TamasatInfo(String faculty, String field) {
            this.faculty = faculty;
            this.field = field;
        }

        // Getters and setters...

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }

    public static class OtherInfo {
        private String faculty;
        private String field;

        // Default constructor
        public OtherInfo() {
        }

        // Constructor with parameters
        public OtherInfo(String faculty, String field) {
            this.faculty = faculty;
            this.field = field;
        }

        // Getters and setters...

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }

    public static class DebtInfo {
        private String numDebt;
        private String gradeChoice;

        // Default constructor
        public DebtInfo() {
            this.numDebt = "defaultNumDebt";
            this.gradeChoice = "defaultGradeChoice";
        }

        // Constructor with parameters
        public DebtInfo(String numDebt, String gradeChoice) {
            this.numDebt = numDebt;
            this.gradeChoice = gradeChoice;
        }

        // Getters and setters...

        public String getNumDebt() {
            return numDebt;
        }

        public void setNumDebt(String numDebt) {
            this.numDebt = numDebt;
        }

        public String getGradeChoice() {
            return gradeChoice;
        }

        public void setGradeChoice(String gradeChoice) {
            this.gradeChoice = gradeChoice;
        }
    }

    public static class DefermentInfo {
        private String term;
        private String year;
        private String defermentMonth;

        // Default constructor
        public DefermentInfo() {
            this.term = "defaultTerm";
            this.year = "defaultYear";
            this.defermentMonth = "defaultDefermentMonth";
        }

        // Constructor with parameters
        public DefermentInfo(String term, String year, String defermentMonth) {
            this.term = term;
            this.year = year;
            this.defermentMonth = defermentMonth;
        }

        // Getters and setters...

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

        public String getDefermentMonth() {
            return defermentMonth;
        }

        public void setDefermentMonth(String defermentMonth) {
            this.defermentMonth = defermentMonth;
        }
    }
}
