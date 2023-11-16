package com.tu.ac.th.services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.AddDropForm;
import com.tu.ac.th.services.Repository.AddDropFormRepository;

@RestController
public class addDropFormController {
    @Autowired
    AddDropFormRepository ad;

    @PostMapping("/api/form/saveAddDropForm")
    public String saveAddDropForm(@RequestBody String jsonAddDropString){
        try{
            AddDropForm af = new AddDropForm(jsonAddDropString);
           
            return "add drop form saved: "  + af.toString();
        }catch(Exception e){
            return "error add drop form not saved: " + e.getMessage();
        }
    }

}
