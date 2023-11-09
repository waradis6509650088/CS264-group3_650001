package com.tu.ac.th.services.Repository;

import com.tu.ac.th.services.Models.AddDropForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcAddDropFormRepository implements AddDropFormRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int save(AddDropForm addDropForm) {
        // Implement the SQL INSERT statement to save the entity
        return jdbcTemplate.update(
                "INSERT INTO addDropForm " +
                        "(id, date, studentFirstName, studentLastName, studentId, studentYear, studyField, advisor, " +
                        "addressNumber, moo, tumbol, amphur, province, postalCode, mobilePhone, phone, cause, addSubjectList, dropSubjectList) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[] {
                        addDropForm.getId(), addDropForm.getDate(), addDropForm.getStudentFirstName(), addDropForm.getStudentLastName(),
                        addDropForm.getStudentId(), addDropForm.getStudentYear(), addDropForm.getStudyField(), addDropForm.getAdvisor(),
                        addDropForm.getAddressNumber(), addDropForm.getMoo(), addDropForm.getTumbol(), addDropForm.getAmphur(),
                        addDropForm.getProvince(), addDropForm.getPostalCode(), addDropForm.getMobilePhone(), addDropForm.getPhone(),
                        addDropForm.getCause(), addDropForm.getAddSubjectList(), addDropForm.getDropSubjectList()
                }
        );
    }
    public List<AddDropForm> getAll() {
        String sql = "SELECT * FROM addDropForm";
        List<AddDropForm> addDropForms = jdbcTemplate.query(sql, (rs, rowNum) -> {
            AddDropForm form = new AddDropForm(null);//replace null with your json
            form.setId(rs.getLong("id"));
            form.setDate(rs.getDate("date"));
            form.setStudentFirstName(rs.getString("studentFirstName"));
            form.setStudentLastName(rs.getString("studentLastName"));
            form.setStudentId(rs.getString("studentId"));
            form.setStudentYear(rs.getString("studentYear"));
            form.setStudyField(rs.getString("studyField"));
            form.setAdvisor(rs.getString("advisor"));
            form.setAddressNumber(rs.getString("addressNumber"));
            form.setMoo(rs.getString("moo"));
            form.setTumbol(rs.getString("tumbol"));
            form.setAmphur(rs.getString("amphur"));
            form.setProvince(rs.getString("province"));
            form.setPostalCode(rs.getString("postalCode"));
            form.setMobilePhone(rs.getString("mobilePhone"));
            form.setPhone(rs.getString("phone"));
            form.setCause(rs.getString("cause"));
            form.setAddSubjectList(rs.getString("addSubjectList"));
            form.setDropSubjectList(rs.getString("dropSubjectList"));
            return form;
        });

        return addDropForms;
    }
}
