package com.tu.ac.th.services.Controllers;

import com.tu.ac.th.services.Models.NormalForm;
import com.tu.ac.th.services.Repository.NormalFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/form/saveNormalForm")
public class NormalFormController {

    @Autowired
    NormalFormRepository normalFormRepo;

    @PostMapping
    public String saveNormalForm(@RequestBody NormalForm receivedNormalForm) {
        try {
            // You can directly use the receivedNormalForm parameter without creating a new instance
            normalFormRepo.save(receivedNormalForm);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}