package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.Form;


public interface FormRepository {
    int saveForm(Form form);
    int updateForm(Form form);
    Form findById(String id);
    int deleteById(String id);
}
