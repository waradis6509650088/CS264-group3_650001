package com.tu.ac.th.services.Repository;

import java.util.List;

import com.tu.ac.th.services.Models.Auth;

public interface AuthRepository {
    String save(Auth authObj);
    List<Auth> findById(String id);
    int update(Auth upAuth);
    int removeById(String id);
}
