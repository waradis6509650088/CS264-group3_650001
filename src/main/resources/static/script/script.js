<script>
  const apiForm = document.getElementById('apiForm');
  const apiResponse = document.getElementById('apiResponse');

  apiForm.addEventListener('submit', function (e) {
    e.preventDefault();

    // รับข้อมูลจากฟอร์ม
    const formData = new FormData(apiForm);

    // สร้าง JSON จากข้อมูลฟอร์ม
    const jsonData = {};
    formData.forEach((value, key) => {
      jsonData[key] = value;
    });

    // ส่งข้อมูลไปยัง API
    sendDataToAPI(jsonData);
  });

  function sendDataToAPI(data) {
    // URL ของ API
    const apiUrl = 'https://restapi.tu.ac.th/api/v1/auth/Ad/verify';

    // สร้างคำขอ POST โดยใช้ Fetch API
    fetch(apiUrl, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Application-Key': 'TUe2e59e8f883232ef8d55e1df294429a53ebe2b674e71f1b3a2dfd91d4f978aa699bb71061f3ce8da1d35f4010396f273', // แทนด้วยคีย์แอปพลิเคชันของคุณ
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
</script>