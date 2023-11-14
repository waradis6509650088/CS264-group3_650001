function authVerification(){
    const username = sessionStorage.getItem("username");
    if (!username) {
        sessionStorage.setItem("username","no user")
        return;
    }

    const AuthJSON = {
        'id': username.replace(/"/g, ''),
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
            if(parseInt(text) > 0){
                console.log(text)
            }
            else
                console.log(text)
        }catch(error){
            console.error(error)
        }
        
    })
    .catch(error => {
        console.error('Error:', error);
    });
}