window.onload = function(){
    AuthJSON = {
        'id' : sessionStorage.getItem("username"),
    }
    fetch('/api/checkAuth', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(AuthJSON),
    })
    .then(response => response.json())
    .then(responseData  => {
        if(responseData = "success"){
            console.log("verification success! the session can be continued.")
        }
        else{
            window.location.href = 'index.html';
        }
    })
    .catch(error => {
        window.location.href = 'index.html';
    });
}