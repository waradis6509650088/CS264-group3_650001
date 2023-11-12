function pullInfoFromSession() {
    document.getElementById("username1").innerHTML = sessionStorage.getItem("username").replace(/"/g, '')
    document.getElementById("username2").innerHTML = sessionStorage.getItem("username").replace(/"/g, '')
    document.getElementById("type").innerHTML = sessionStorage.getItem("type").replace(/"/g, '')
    document.getElementById("displayname_th").innerHTML = sessionStorage.getItem("displayname_th").replace(/"/g, '')
    document.getElementById("displayname_en1").innerHTML = sessionStorage.getItem("displayname_en").replace(/"/g, '')
    document.getElementById("displayname_en2").innerHTML = sessionStorage.getItem("displayname_en").replace(/"/g, '')
    document.getElementById("tu_status").innerHTML = sessionStorage.getItem("tu_status").replace(/"/g, '')
    document.getElementById("email").innerHTML = sessionStorage.getItem("email").replace(/"/g, '')
    document.getElementById("faculty").innerHTML = sessionStorage.getItem("faculty").replace(/"/g, '')
    document.getElementById("department").innerHTML = sessionStorage.getItem("department").replace(/"/g, '')
}