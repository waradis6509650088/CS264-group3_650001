//script for adding content to table
function addDropTable_addContent(){
    dat1 = document.getElementById("addDropChoice").value;
    dat2 = document.getElementById("subjectID").value;
    dat3 = document.getElementById("subjectName").value;
    dat4 = document.getElementById("studentSection").value;
    dat5 = document.getElementById("subjectDateTime").value;
    dat6 = document.getElementById("subjectCredit").value;
    dat7 = document.getElementById("subjectProfessor").value;

    //creating table
    table = document.getElementById("addDropTable");

    if(dat1 != "" &&
        dat2 != "" &&
        dat3 != "" &&
        dat4 != "" &&
        dat5 != "" &&
        dat6 != "" &&
        dat7 != "" ){

        let row = table.insertRow(-1);
        row.id = "tableRow_" + table.rows.length;

        c1 = row.insertCell(0);
        c2 = row.insertCell(1);
        c3 = row.insertCell(2);
        c4 = row.insertCell(3);
        c5 = row.insertCell(4);
        c6 = row.insertCell(5);
        c7 = row.insertCell(6);

        c1.innerText = dat1;
        c2.innerText = dat2;
        c3.innerText = dat3;
        c4.innerText = dat4;
        c5.innerText = dat5;
        c6.innerText = dat6;
        c7.innerText = dat7;


        //reset input field
        document.getElementById("subjectID").value = "";
        document.getElementById("subjectName").value = "";
        document.getElementById("studentSection").value = "";
        document.getElementById("subjectDateTime").value = "";
        document.getElementById("subjectCredit").value = "";
        document.getElementById("subjectProfessor").value = "";
    }
}

//script for delete subject in the table
function addDropTable_deleteSubject(){
    rowCount = document.getElementById('addDropTable').rows.length;
    if(rowCount != 1){
        table = document.getElementById("addDropTable").deleteRow(-1);
    }

}

//script for turning table to array
function combineFormAndTable() {
    const table = document.getElementById("addDropTable");

    if(table.rows.length > 1){
        addSubObj = [];
        dropSubObj = [];

        for(i = table.rows.length; i > 1 ; i--){
            datTable = document.getElementById("tableRow_" + i);
            // console.log(datTable.innerText);
            cells = datTable.getElementsByTagName("td");
            obj = {
                    "subjectCode" : cells[1].innerText,
                    "subjectName" : cells[2].innerText,
                    "subjectSection" : cells[3].innerText,
                    "subjectDate" : cells[4].innerText,
                    "subjectCredit" : cells[5].innerText,
                    "subjectTeacher" : cells[6].innerText,
                    "subjectTeacherCheck" : "false"
                }
            if(cells[0].innerText == "เพิ่ม"){
                addSubObj.push(obj);
            }
            else{
                dropSubObj.push(obj);
            }
        }
    }
    else{
        console.log("no data");
    }
    myJson = {
        "addSubjectList" : addSubObj,
        "dropSubjectList" : dropSubObj,
    }
    

    studentJson = adInfoFormToJSON();//form info to json
    result = jsonConcat(studentJson,myJson)
    console.log( JSON.stringify(result))

    return JSON.stringify(result);
}

//concat json object
function jsonConcat(o1, o2) {
    for (var key in o2) {
    o1[key] = o2[key];
    }
    return o1;
}

//validate add drop table
function validateForm() {
    var addSubjectCount = parseInt(document.getElementById("addsubject").value);
    var dropSubjectCount = parseInt(document.getElementById("dropsubject").value);

    if (addSubjectCount + dropSubjectCount < 1) {
        alert("ต้องมีอย่างน้อย 1 รายวิชาที่จะขอเพิ่มหรือถอน");
        return false;
    }
    return true;
}

//submit addDropForm to api
function submitAddDropFormAPI(){

    let children = document.querySelectorAll('input, textarea, select');
    // find if any of them are empty
    let findEmpty = Array.from(children).find((element)=>{
        if(element.value.length < 1){return true}
        return false
    });
    // check if found an empty child
    if(findEmpty){
        // // if so alert
        // alert("กรอกข้อมูลให้ครบ");
    }else{
        // if not submit form
        let table = document.getElementById("addDropTable");
        if (table.rows.length < 2) {
            alert("กรุณาเพิ่ม/ถอนอย่างน้อย 1 วิชาก่อนยืนยัน");
        } else {
            studentString = combineFormAndTable();
            console.log(studentString)
            url = 'http://localhost:8080/api/form/saveAddDropForm';
            fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(studentString)
            })
            .then(response => response.text())
            .then(data => {
                console.log(data);
            })
            document.location.assign("SuccessForm.html");
        };
    }
    
}

//collect data addDropForm to JSON
function adInfoFormToJSON(){
        const jsonData = {
            "date":document.getElementById("date").value,
            "studentFirstName":document.getElementById("prefix").value
            + " " + document.getElementById("studentFirstName").value,
            "studentLastName":document.getElementById("studentLastName").value,
            "studentId":document.getElementById("studentId").value,
            "studentYear":document.getElementById("studentYear").value,
            "studyField":document.getElementById("studyField").value,
            "advisor":document.getElementById("advisor").value,
            "addressNumber":document.getElementById("addressNumber").value,
            "moo":document.getElementById("moo").value,
            "tumbol":document.getElementById("tumbol").value,
            "amphur":document.getElementById("amphur").value,
            "province":document.getElementById("province").value,
            "postalCode":document.getElementById("postalcode").value,
            "mobilePhone":document.getElementById("mobilePhone").value,
            "phone":document.getElementById("Phone").value,
            "cause":document.getElementById("cause").value,
            "ID": sessionStorage.getItem('id')
        };

    return jsonData
}

//collect data normalForm to JSON
function normalFormToJSON() {
    // สร้างออบเจ็กต์ JSON ที่จะใช้ในการเก็บข้อมูล
    const jsonData = {
        "date": document.getElementById("date").value,
        "topic": document.getElementById("topic").value,
        "studentInfo": {
            "prefix": document.getElementById("prefix").value,
            "studentFirstName": document.getElementById("studentFirstName").value,
            "studentLastName": document.getElementById("studentLastName").value,
            "studentId": document.getElementById("stdID").value,
            "studentYear": document.getElementById("studentYear").value,
            "studyField": document.getElementById("studyField").value,
        },
        "address": {
            "addressNumber": document.getElementById("addressNumber").value,
            "moo": document.getElementById("moo").value,
            "tumbol": document.getElementById("tumbol").value,
            "amphur": document.getElementById("amphur").value,
            "province": document.getElementById("province").value,
            "postalCode": document.getElementById("postalCode").value,
            "mobilePhone": document.getElementById("mobilePhone").value,
            "phone": document.getElementById("phone").value,
        },
        "advisor": document.getElementById("adivsor").value,
    };

    // ระบุประเภทที่ถูกเลือกตาม ID ของปุ่มรัฟิโอ
    const selectedCaseId = document.querySelector('input[name="requestType"]:checked').id;

    // จัดการกับกรณีที่แตกต่างกัน
    caseData = {}
    if (selectedCaseId === "wantTU") {
        // จัดการข้อมูลสำหรับกรณี 'wantTU' (ลาออก)
        caseData["requestType"] = "ขอลาออก";
        caseData["term"] = document.getElementById("term").value;
        caseData["year"] = document.getElementById("year").value;
        caseData["cause"] = document.querySelector('input[name="cause"]:checked').value;
        caseData["tamasatInfo"] = {
            "faculty": document.getElementById("TamasatFac").value,
            "field": document.getElementById("TamasatField").value,
        };
        caseData["otherInfo"] = {
            "faculty": document.getElementById("OtherFac").value,
            "field": document.getElementById("OtherField").value,
        };
    } else if (selectedCaseId === "Deferment") {
        // จัดการข้อมูลสำหรับกรณี 'Deferment' (ผ่อนผันค่าเทอม)
        caseData["requestType"] = "ขอผ่อนผันค่าเทอม";
        caseData["debtInfo"] = {
            "numDebt": document.getElementById("numDebt").value,
            "gradeChoice": document.querySelector('input[name="choice"]:checked').value,
        };
        caseData["defermentInfo"] = {
            "term": document.getElementById("DefermentTerm").value,
            "year": document.getElementById("DefermentYear").value,
            "defermentMonth": document.getElementById("Defermentmonth").value,
        };
    } else if (selectedCaseId === "OtherOption") {
        // จัดการข้อมูลสำหรับกรณี 'OtherOption' (อื่นๆ)
        caseData["requestType"] = document.querySelector('input[name="OtherOption"]:checked').value;
        caseData["otherOptionTopic"] = document.getElementById("OtherOptionTopic").value;
        caseData["because"] = document.getElementById("Because").value;
    }
    jsonData['caseData'] = JSON.stringify(caseData)
    // คืนข้อมูล JSON
    console.log(jsonData)
    return jsonData;
}

function sendNormalFormToAPI(){
    const formData = normalFormToJSON();
    url = 'http://localhost:8080/api/form/saveNormalForm';
    fetch(url, {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(studentString)
    })
    .then(response => response.text())
    .then(text => {
        console.log(text)
    })
    .catch(error => {
        console.error(error)
    });
}

