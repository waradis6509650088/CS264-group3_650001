package com.tu.ac.th.services.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.tu.ac.th.services.Models.Form;

public class JdbcRepository implements FormRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int saveForm(Form form) {

        return jdbcTemplate.update("INSERT INTO Table_1_TeamProjectTest1 " +
                "(username, date, topic, prefix, studentFirstName, studentLastName, studentId, studentYear, studyField, " +
                "addressNumber, moo, tumbol, amphur, province, postalCode, mobilePhone, phone, advisor, wantTu, term, year, " +
                "cause, OtherFac, OtherField, wantOther, FacOther, FieldOther, numDebt, grade, Nograde, Defement, DefementTerm, " +
                "OtherOption, OtherOptionTopic, Because, CheckStatus) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[]{form.getUsername(), form.getDate(), form.getTopic(), form.getPrefix(), form.getStudentFirstName(), form.getStudentLastName(),
                        form.getStudentId(), form.getStudentYear(), form.getStudyField(), form.getAddressNumber(), form.getMoo(),
                        form.getTumbol(), form.getAmphur(), form.getProvince(), form.getPostalCode(), form.getMobilePhone(),
                        form.getPhone(), form.getAdvisor(), form.getWantTu(), form.getTerm(), form.getYear(), form.getCause(), form.getOtherFac(),
                        form.getOtherField(), form.getWantOther(), form.getFacOther(), form.getFieldOther(), form.getNumDebt(),
                        form.getGrade(), form.getNograde(), form.getDefement(), form.getDefementTerm(), form.getOtherOption(),
                        form.getOtherOptionTopic(), form.getBecause(), form.getCheckStatus()});
    }
    @Override
    public int updateForm(Form form) {

        return jdbcTemplate.update("UPDATE form Table_1_TeamProjectTest1" +
                        "SET username = ?, date = ?, topic = ?, prefix = ?, studentFirstName = ?, studentLastName = ?, " +
                        "studentYear = ?, studyField = ?, addressNumber = ?, moo = ?, tumbol = ?, amphur = ?, province = ?, postalCode = ?, " +
                        "mobilePhone = ?, phone = ?, advisor = ?, wantTu = ?, term = ?, year = ?, cause = ?, OtherFac = ?, " +
                        "OtherField = ?, wantOther = ?, FacOther = ?, FieldOther = ?, numDebt = ?, grade = ?, Nograde = ?, Defement = ?, " +
                        "DefementTerm = ?, OtherOption = ?, OtherOptionTopic = ?, Because = ?, CheckStatus = ? " +
                        "WHERE studentId = ?",
                new Object[]{form.getUsername(), form.getDate(), form.getTopic(), form.getPrefix(), form.getStudentFirstName(),
                        form.getStudentLastName(), form.getStudentYear(), form.getStudyField(), form.getAddressNumber(),
                        form.getMoo(), form.getTumbol(), form.getAmphur(), form.getProvince(), form.getPostalCode(), form.getMobilePhone(),
                        form.getPhone(), form.getAdvisor(), form.getWantTu(), form.getTerm(), form.getYear(), form.getCause(), form.getOtherFac(),
                        form.getOtherField(), form.getWantOther(), form.getFacOther(), form.getFieldOther(), form.getNumDebt(),
                        form.getGrade(), form.getNograde(), form.getDefement(), form.getDefementTerm(), form.getOtherOption(),
                        form.getOtherOptionTopic(), form.getBecause(), form.getCheckStatus(), form.getStudentId()});
    }
    public Form findById(String id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM Table_1_TeamProjectTest1 WHERE id=?",
                    BeanPropertyRowMapper.newInstance(Form.class), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }
    @Override
    public int deleteById(String id) {
        return jdbcTemplate.update("DELETE FROM Table_1_TeamProjectTest1 WHERE id=?", id);
    }


}
