package com.tu.ac.th.services.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @PostMapping("/checkAuth")
    public int checkAuth(String authJsonString){
        return 0;
    }
}
