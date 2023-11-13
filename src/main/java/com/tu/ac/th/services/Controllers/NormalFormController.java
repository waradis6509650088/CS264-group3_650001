package com.tu.ac.th.services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.AddDropForm;
import com.tu.ac.th.services.Models.NormalForm;
import com.tu.ac.th.services.Repository.NormalFormRepository;

@RestController
public class NormalFormController {
    @Autowired
    NormalFormRepository NormalFormRepo;

    @PostMapping("/api/form/saveNormalForm")
    public String saveNormalForm(@RequestBody String JSONstring){
         try{
            NormalForm af = new NormalForm(JSONstring);
            NormalFormRepo.save(af);
            return "success";
        }catch(Exception e){
            return "failed";
        }
    }
}
