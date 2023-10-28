package com.tu.ac.th.services.Controllers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.tu.ac.th.services.Models.Form;

@RestController
public class FormController {
    
    @GetMapping("/saveToDatabase")
    public String saveToDatabase(@RequestParam String formString){

        try{
            JSONParser parser = new JSONParser();
            JSONObject studentJson = (JSONObject) parser.parse(formString);
            //Form studentForm = new Form(studentJson);
            return studentJson.toString();
        }
        catch(ParseException pe){
            return "Error: " + pe.getMessage();
        }
    }

}
