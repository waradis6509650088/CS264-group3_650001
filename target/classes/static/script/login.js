
//login function, call when user click login button
function login() {
    // สร้าง JSON จากข้อมูลฟอร์ม
    const jsonData = {
        "UserName" : document.getElementById("username").value,
        "PassWord" : document.getElementById("password").value
    };
    console.log(jsonData)

    //send login data
    // ส่งข้อมูลไปยัง API
    sendDataToTUAPI(jsonData);
    // ส่งข้อมูล studentID และ timeNow ไปยัง checkAuth
    sendLoginDataToAuth();

}

//call function saveAuth in backend and save auth data
function sendLoginDataToAuth() {
    // แปลงเวลาเป็น milliseconds
    const timeNow = new Date().getTime();
    
    loginData = {
        "time" : timeNow,
        "id" : document.getElementById("username").value
    }
    console.log(loginData)

    // URL ของ API saveAuth
    apiUrl = 'http://localhost:8080/api/saveAuth';

    // ส่งข้อมูล studentID และ timeNow ไปยัง API saveAuth
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(loginData),
    })
    .then(response => response.text())
    .then(data => {
        console.log("data recieve is: " + data)
    })
}

//send login data to tuAPI
function sendDataToTUAPI(data) {
    // URL ของ API
    const apiUrl = 'https://restapi.tu.ac.th/api/v1/auth/Ad/verify';
    apiResponse = document.getElementById("apiRes")
    // สร้างคำขอ POST โดยใช้ Fetch API
    fetch(apiUrl, {
        method: 'POST',
        headers: {
        'Content-Type': 'application/json',
        'Application-Key': 'TUe2e59e8f883232ef8d55e1df294429a53ebe2b674e71f1b3a2dfd91d4f978aa699bb71061f3ce8da1d35f4010396f273', // คีย์แอปพลิเคชัน
        },
        body: JSON.stringify(data)
    }) 
    .then(response => response.json())
    .then(responseData  => {
        if (responseData.status && responseData.type == "student") {
            // ทำการนำทางไปยังหน้าอื่น ๆ หากมีข้อมูลถูกต้อง
            addToSessionStorage(responseData);
            console.log("username: " + sessionStorage.getItem("username"));
            // window.location.href = 'MainPage.html';
        } else {
            document.getElementById("apiRes").innerHTML = 'ไม่พบข้อมูลหรือข้อมูลไม่ถูกต้อง';
        }
        
    })
    .catch(error => {
        console.error('เกิดข้อผิดพลาดในการเรียกใช้ API:', error);
        document.getElementById("apiRes").innerHTML = 'เกิดข้อผิดพลาดในการเรียกใช้ API';
    });
    }
    //sent json to session storage
    function addToSessionStorage(jsonObject) {
    if (jsonObject && typeof jsonObject === 'object') {
        // Loop through each key-value pair in the JSON object
        for (const key in jsonObject) {
        if (jsonObject.hasOwnProperty(key)) {
            // Convert the value to a string before storing in session storage
            const valueString = JSON.stringify(jsonObject[key]).replace(/"/g, '');
            
            // Add the key-value pair to session storage
            sessionStorage.setItem(key, valueString);
        }
        }
    } else {
        console.error('Invalid JSON object provided');
    }
}


