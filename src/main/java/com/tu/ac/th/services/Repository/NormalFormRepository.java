package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.AddDropForm;
import com.tu.ac.th.services.Models.NormalForm;

import java.util.List;

public interface NormalFormRepository {
    int save(NormalForm normalForm);
    List<NormalForm> getAll();
}
