package com.tu.ac.th.services.JDBCRepository;

import com.tu.ac.th.services.Models.NormalForm;
import com.tu.ac.th.services.Repository.NormalFormRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class JdbcNormalFormRepository implements NormalFormRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public void save(NormalForm normalForm) {
        String sql = "INSERT INTO normalForm (topic, studentInfo, address, advisor, caseData) " +
                "VALUES (?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                normalForm.getTopic(),
                normalForm.getStudentInfo(),
                normalForm.getAddress(),
                normalForm.getAdvisor(),
                normalForm.getCaseData());
    }
    // @Override
    // public List<NormalForm> getAll() {
    //     String sql = "SELECT * FROM normalForm";
    //     List<NormalForm> addDropForms = jdbcTemplate.query(sql, (rs, rowNum) -> {
    //         NormalForm form = new NormalForm();
    //         form.setId(rs.getString("id"));
    //         form.setFname(rs.getString("fname"));
    //         form.setLname(rs.getString("lname"));
    //         form.setDate(rs.getDate("date"));
    //         form.setTime(rs.getTime("time"));
    //         form.setTopic(rs.getString("topic"));
    //         form.setTopicInfo(rs.getString("topicInfo"));
    //         form.setProfOp(rs.getString("profOp"));
    //         form.setHeadOp(rs.getString("headOp"));
    //         form.setDeanAssistOp(rs.getString("deanAssistOp"));
    //         form.setDeanOp(rs.getString("deanOp"));
    //         return form;
    //     });

    //     return addDropForms;
    // }

}
