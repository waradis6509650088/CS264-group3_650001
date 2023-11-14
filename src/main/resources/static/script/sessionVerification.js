function authVerification(){
    const username = sessionStorage.getItem("username");
    if (!username) {
        console.error("Username not found in sessionStorage");
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
        if(text > 1){
            
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });
}