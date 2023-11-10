package com.tu.ac.th.services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;

@RestController
public class AuthController {
    
    @Autowired
    AuthRepository auth;
    
    //will be called every time the page sends or recieve data
    @PostMapping("/saveAuth")
    public int saveAuth(String authJsonString){
        try{
            Auth AuthObj = new Auth(authJsonString);
            auth.save(AuthObj);
            return 0;
        }catch(Exception e){
            return 1;
        }
    }
}
