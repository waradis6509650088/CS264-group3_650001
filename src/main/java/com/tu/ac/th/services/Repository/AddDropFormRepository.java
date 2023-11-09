package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.AddDropForm;

import java.util.List;

public interface AddDropFormRepository {

    int save(AddDropForm addDropForm);
    List<AddDropForm> getAll();
}
