package com.tu.ac.th.services.JDBCRepository;

import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcAuthRepository implements AuthRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public int save(Auth authObj) {
        try{
            jdbcTemplate.update(
            "INSERT INTO loginTime" +
                    "(studentId, loginTime) " +
                    "VALUES (?, ?)",
            authObj.getId(), authObj.getLoginTime());
            return 0;
        }
        catch(Exception e){return 1;}
    }

    @Override
    public Auth findById(long id) {
        Auth retAuth = null;
        try{
            retAuth = jdbcTemplate.queryForObject("SELECT * FROM requests WHERE studentId=?", BeanPropertyRowMapper.newInstance(Auth.class), id);
            return retAuth;
        }catch(Exception e){
            e.printStackTrace();
        }
        return retAuth;
    }

    @Override
    public int update(Auth upAuth) {
        try{
            jdbcTemplate.update("UPDATE authTable SET loginTime = ? WHERE id = ?",
            upAuth.getLoginTime(), upAuth.getId());
            return 0;
        }
        catch(Exception e){return 1;}
    }

}

    
