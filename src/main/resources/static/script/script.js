
//login function
//ต้อง pass จาก หน้า login, เดี๋ยวให้ กญ ใส่ฟังชั่นในฟุ่มเข้าสู่ระบบ
//  vvส่งพร้อมตอนเรียก func
// const apiForm = document.getElementById('apiForm');
// const apiResponse = document.getElementById('apiResponse');
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
    const timeNow = new Date().toLocaleString();

    // สร้าง Object สำหรับเก็บข้อมูล
    const loginData = {
        studentID: studentID,
        loginTime: timeNow
    };

    // แปลง Object เป็น JSON
    const loginDataJSON = JSON.stringify(loginData);

    // เก็บข้อมูลใน session storage
    sessionStorage.setItem('loginData', loginDataJSON);

    // ส่งข้อมูล studentID และ timeNow ไปยัง checkAuth
    sendLoginDataToAPI(loginData);
    // ส่งข้อมูลไปยัง API
    sendDataToAPI(jsonData);
}

function sendLoginDataToAPI(data) {
    // URL ของ API checkAuth
    const apiUrl = '/checkAuth';

    // ส่งข้อมูล studentID และ timeNow ไปยัง API checkAuth
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
}

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
    sessionStorage.removeItem('loginData');

    // ทำการนำทางหน้าไปยังหน้า ' ' หลังจาก logout
    //window.location.href = ' ';
}
