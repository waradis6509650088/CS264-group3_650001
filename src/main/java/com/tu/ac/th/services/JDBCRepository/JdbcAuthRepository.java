package com.tu.ac.th.services.JDBCRepository;

import com.tu.ac.th.services.JdbcRowMapper.AuthMapper;
import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAuthRepository implements AuthRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public String save(Auth authObj) {
        try{
            jdbcTemplate.update("INSERT INTO authTable (studentId, loginTime) VALUES (?, ?)", new Object[]{
            authObj.getId(), authObj.getLoginTime()});
            return "success";
        }
        catch(Exception e){return e.getMessage();}
    }

    @Override
    public List<Auth> findById(String id) {
        try{
            String sql = "select * from authTable WHERE studentId = ?";
            List<Auth> auth =  jdbcTemplate.query(sql, new AuthMapper(), id);
            return auth;
        }catch(Exception e){
            return null;
        }
        
    }
    @Override
    public int update(Auth upAuth) {
        try{
            jdbcTemplate.update("UPDATE authTable SET loginTime = ? WHERE studentId = ?",
            upAuth.getLoginTime(), upAuth.getId());
            return 0;
        }
        catch(Exception e){return 1;}
    }

    @Override
    public int removeById(long id) {
        return jdbcTemplate.update("DELETE FROM authTable WHERE studentId=?", id);
    }

}

    
