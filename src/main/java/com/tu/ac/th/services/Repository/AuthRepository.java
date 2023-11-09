package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.Auth;

import java.util.List;

public interface AuthRepository {

    int save(Auth authObj);
    List<Auth> getAll();
    
}
