function authVerification(){
    const username = sessionStorage.getItem("username");
    if (!username) {
        sessionStorage.setItem("username","no user")
        return;
    }

    const AuthJSON = {
        'id': username,
    };

    console.log(JSON.stringify(AuthJSON));

    fetch('http://localhost:8080/api/checkAuth', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(AuthJSON),
    })
    .then(response => response.text()) //Use response.text() for plain text response
    .then(text => {
        try{
            if(text == "success"){
                console.log("Auth status: " + text)
            }
            else{
                alert(text)
                sessionStorage.clear()
                window.location.href = 'Index.html'
            }
        }catch(error){
            console.error(error)
            sessionStorage.clear()
            window.location.href = 'Index.html'
        }
        
    })
    .catch(error => {
        console.error('Error:', error);
    });
}