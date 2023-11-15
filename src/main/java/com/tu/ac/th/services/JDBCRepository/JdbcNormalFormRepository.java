package com.tu.ac.th.services.JDBCRepository;

import com.tu.ac.th.services.Models.NormalForm;
import com.tu.ac.th.services.Repository.NormalFormRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcNormalFormRepository implements NormalFormRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(NormalForm normalForm) {
        // Implement the SQL INSERT statement to save the entity
        return jdbcTemplate.update(
                "INSERT INTO normalForm " +
                        "(id, date, studentFirstName, studentLastName, studentId, studentYear, studyField, advisor, " +
                        "addressNumber, moo, tumbol, amphur, province, postalCode, mobilePhone, phone, cause, " +
                        "tamasatFac, tamasatField, otherFac, otherField, otherOptionTopic, otherCause) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[]{
                        normalForm.getId(), normalForm.getDate(), normalForm.getStudentFirstName(), normalForm.getStudentLastName(),
                        normalForm.getStudentId(), normalForm.getStudentYear(), normalForm.getStudyField(), normalForm.getAdvisor(),
                        normalForm.getAddressNumber(), normalForm.getMoo(), normalForm.getTumbol(), normalForm.getAmphur(),
                        normalForm.getProvince(), normalForm.getPostalCode(), normalForm.getMobilePhone(), normalForm.getPhone(),
                        normalForm.getCause(), normalForm.getTamasatFac(), normalForm.getTamasatField(),
                        normalForm.getOtherFac(), normalForm.getOtherField(), normalForm.getOtherOptionTopic(), normalForm.getOtherCause()
                }
        );
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
