package com.tu.ac.th.services.Controllers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;

@RestController
public class AuthController {
    
    @Autowired
    AuthRepository authRepository;
    
    @PostMapping("/api/saveAuth")
    public void saveAuth(@RequestBody String authJsonString){
        try{
            Auth AuthObj = new Auth(authJsonString);
            authRepository.save(AuthObj);
        }catch(Exception e){
            return;
        }
    }

    //will be called every time the page sends or recieve data for session checking
    @PostMapping("/api/checkAuth")
    public int checkAuth(@RequestBody String id){
        JSONParser parser = new JSONParser();
        try{
            JSONObject json = (JSONObject) parser.parse(id);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 0;
    }
}
