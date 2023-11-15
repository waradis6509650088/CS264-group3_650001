package com.tu.ac.th.services.Controllers;

import java.util.List;

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
    public String saveAuth(@RequestBody String authJsonString){
        try{
            Auth AuthObj = new Auth(authJsonString);
            AuthObj.setLoginTime(Long.toString(Long.parseLong(AuthObj.getLoginTime()) + 1800000));
            List<Auth> db = authRepository.findById(AuthObj.getId());
            if(db.isEmpty()){
                authRepository.save(AuthObj);
                return "saved " + AuthObj.toString();
            }
            else{   
                authRepository.update(AuthObj);
                return "updated " +  AuthObj.toString();
            }
        }catch(Exception e){
            return e.getMessage();
        }
    }

    //will be called every time the page sends or recieve data for session checking
    @PostMapping("/api/checkAuth")
    public String checkAuth(@RequestBody String id){
        JSONParser parser = new JSONParser();
        try{
            JSONObject json = (JSONObject) parser.parse(id);
            List<Auth> db = authRepository.findById((String) json.get("id"));
            if(db.isEmpty()){
                return "auth failed, unknown info: " + Long.parseLong((String) json.get("id"));
            }
            else{
                if(Long.parseLong(db.get(0).getLoginTime()) < System.currentTimeMillis()){
                    authRepository.removeById(id);
                    return "Timed out, please login again.";
                }
                else{
                    Auth newAuth = new Auth(id,Long.toString(System.currentTimeMillis() + 1800000));//add 30 min to current time and save that as new timeout time
                    authRepository.update(newAuth);
                    return "success";
                }
            }
            
        }
        catch(Exception e){
            return "auth failed, internal error: " + e.getMessage();
        }
    }

    @PostMapping("/api/deleteAuth")
    public void deleteAuth(String id){
        
    }
}
