package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.NormalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
//KUY

public class JdbcNormalFormREpository implements NormalFormRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int save(NormalForm normalForm){
        return jdbcTemplate.update(
                "INSERT INTO normalForm" +
                        "(id, fname, lname, date, time, topic, topicInfo, profOp, headOp, deanAssistOp, deanOp) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[] {
                        normalForm.getId(), normalForm.getFname(), normalForm.getLname(), normalForm.getDate(), normalForm.getTime(),
                        normalForm.getTopic(), normalForm.getTopicInfo(), normalForm.getProfOp(), normalForm.getHeadOp(),
                        normalForm.getDeanAssistOp(), normalForm.getDeanOp()
                }
        );
    }
    @Override
    public List<NormalForm> getAll() {
        String sql = "SELECT * FROM normalForm";
        List<NormalForm> addDropForms = jdbcTemplate.query(sql, (rs, rowNum) -> {
            NormalForm form = new NormalForm(null);//replace null with your json
            form.setId(rs.getString("id"));
            form.setFname(rs.getString("fname"));
            form.setLname(rs.getString("lname"));
            form.setDate(rs.getDate("date"));
            form.setTime(rs.getTime("time"));
            form.setTopic(rs.getString("topic"));
            form.setTopicInfo(rs.getString("topicInfo"));
            form.setProfOp(rs.getString("profOp"));
            form.setHeadOp(rs.getString("headOp"));
            form.setDeanAssistOp(rs.getString("deanAssistOp"));
            form.setDeanOp(rs.getString("deanOp"));
            return form;
        });

        return addDropForms;
    }

}
