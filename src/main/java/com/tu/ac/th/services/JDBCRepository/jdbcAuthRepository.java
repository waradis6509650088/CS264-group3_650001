package com.tu.ac.th.services.JDBCRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcAuthRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
