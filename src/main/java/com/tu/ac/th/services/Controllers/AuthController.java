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
    
    @PostMapping("/checkAuth")
    public int checkAuth(String authJsonString){
        try{
            Auth AuthObj = new Auth(authJsonString);
            auth.save(AuthObj);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
}
