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
    public int save(NormalForm normalForm) {
        // Implement the SQL INSERT statement to save the entity
        return jdbcTemplate.update(
                "INSERT INTO normal_form " +
                        "(date, topic, advisor, student_prefix, student_first_name, " +
                        "student_last_name, student_id, student_year, study_field, address_number, moo, tumbol, " +
                        "amphur, province, postal_code, mobile_phone, phone, request_type, term, year, cause, " +
                        "tamasat_faculty, tamasat_field, other_faculty, other_field, because, num_debt, grade_choice, " +
                        "deferment_term, deferment_year, deferment_month, other_option_topic) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                normalForm.getDate(), normalForm.getTopic(), normalForm.getAdvisor(),
                normalForm.getStudentInfo().getPrefix(), normalForm.getStudentInfo().getStudentFirstName(),
                normalForm.getStudentInfo().getStudentLastName(), normalForm.getStudentInfo().getStudentId(),
                normalForm.getStudentInfo().getStudentYear(), normalForm.getStudentInfo().getStudyField(),
                normalForm.getAddress().getAddressNumber(), normalForm.getAddress().getMoo(),
                normalForm.getAddress().getTumbol(), normalForm.getAddress().getAmphur(),
                normalForm.getAddress().getProvince(), normalForm.getAddress().getPostalCode(),
                normalForm.getAddress().getMobilePhone(), normalForm.getAddress().getPhone(),
                normalForm.getCaseData().getRequestType(), normalForm.getCaseData().getTerm(),
                normalForm.getCaseData().getYear(), normalForm.getCaseData().getCause(),
                normalForm.getCaseData().getTamasatInfo().getFaculty(), normalForm.getCaseData().getTamasatInfo().getField(),
                normalForm.getCaseData().getOtherInfo().getFaculty(), normalForm.getCaseData().getOtherInfo().getField(),
                normalForm.getCaseData().getBecause(), normalForm.getCaseData().getDebtInfo().getNumDebt(),
                normalForm.getCaseData().getDebtInfo().getGradeChoice(),
                normalForm.getCaseData().getDefermentInfo().getTerm(),
                normalForm.getCaseData().getDefermentInfo().getYear(),
                normalForm.getCaseData().getDefermentInfo().getDefermentMonth(),
                normalForm.getCaseData().getOtherOptionTopic()
        );
    }

    // Retrieve NormalForm object from the database based on a specific condition (e.g., student ID)
    // (You can implement a similar method as in the previous example)
}
