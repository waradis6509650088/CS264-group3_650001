package com.tu.ac.th.services.JDBCRepository;

import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcAuthRepository implements AuthRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int save(Auth auth) {
        return jdbcTemplate.update(
                "INSERT INTO auth" +
                        "(id, login_time) " +
                        "VALUES (?, ?)",
                auth.getId(), auth.getLoginTime()
        );
    }

    @Override
    public List<Auth> getAll() {
        String sql = "SELECT * FROM auth";
        List<Auth> authList = jdbcTemplate.query(sql, (rs, rowNum) -> {
            Auth auth = new Auth(null); // replace null with your JSON
            auth.setId(rs.getString("id"));
            auth.setLoginTime(rs.getString("login_time"));
            return auth;
        });

        return authList;
    }
}
