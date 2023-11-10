//login function, call when user click login button
function login(apiForm) {
    // รับข้อมูลจากฟอร์ม
    const formData = new FormData(apiForm);

    // สร้าง JSON จากข้อมูลฟอร์ม
    const jsonData = {};
    formData.forEach((value, key) => {
        jsonData[key] = value;
    });

    // เก็บ studentID และเวลาที่ login ลงใน session storage
    const studentID = jsonData.studentID;

    // แปลงเวลาเป็น milliseconds
    const timeNow = new Date().getTime();
    loginData = {
        "time" : timeNow,
        "id" : studentID
    }

    // แปลง Object เป็น JSON
    const loginDataJSON = JSON.stringify(loginData);

    // เก็บข้อมูลใน session storage
    sessionStorage.setItem('id', studentID);

    // ส่งข้อมูล studentID และ timeNow ไปยัง checkAuth
    sendLoginDataToAuth(loginData);
    // ส่งข้อมูลไปยัง API
    sendDataToAPI(jsonData);
}

//call function saveAuth in backend
function sendLoginDataToAuth(data) {
    // URL ของ API saveAuth
    const apiUrl = '/saveAuth';

    // ส่งข้อมูล studentID และ timeNow ไปยัง API saveAuth
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
}

//send login data to tuAPI
function sendDataToAPI(data) {
    // URL ของ API
    const apiUrl = 'https://restapi.tu.ac.th/api/v1/auth/Ad/verify';

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
    .then(responseData => {
        if (responseData.status && responseData.type == "student") {
        // ทำการนำทางไปยังหน้าอื่น ๆ หากมีข้อมูลถูกต้อง
        window.location.href = 'form.html';
        } else {
        // ไม่พบข้อมูลหรือข้อมูลไม่ถูกต้อง
        apiResponse.innerHTML = 'ไม่พบข้อมูลหรือข้อมูลไม่ถูกต้อง';
        }
    })
    .catch(error => {
        console.error('เกิดข้อผิดพลาดในการเรียกใช้ API:', error);
        apiResponse.innerHTML = 'เกิดข้อผิดพลาดในการเรียกใช้ API';
    });
}

// logout function
function logout() {
    // ลบข้อมูลที่ถูกเก็บใน session storage
    sessionStorage.removeItem('id');

    //ทำการนำทางหน้าไปยังหน้า ' ' หลังจาก logout
    //window.location.href = ' ';
}
