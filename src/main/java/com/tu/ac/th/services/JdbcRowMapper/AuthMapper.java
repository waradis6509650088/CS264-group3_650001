package com.tu.ac.th.services.JdbcRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tu.ac.th.services.Models.Auth;

public class AuthMapper implements RowMapper<Auth>{

    @Override
    public Auth mapRow(ResultSet rs, int arg1) throws SQLException {
        Auth auth = new Auth(rs.getString("studentId"), rs.getString("loginTime"));
        return auth;
    }
    
}
