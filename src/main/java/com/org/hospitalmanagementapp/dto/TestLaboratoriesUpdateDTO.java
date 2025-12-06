package com.org.hospitalmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestLaboratoriesUpdateDTO {

    private int laboratoryTest_id;
    private int patient_id;
    private int doctor_id;
    private String test_name;
    private LocalDateTime test_date;
    private LocalDateTime reportDelivery_date;
    private String report_description;
    private String report_riskStatus;

    public int getLaboratoryTest_id() {
        return laboratoryTest_id;
    }

    public void setLaboratoryTest_id(int laboratoryTest_id) {
        this.laboratoryTest_id = laboratoryTest_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public LocalDateTime getTest_date() {
        return test_date;
    }

    public void setTest_date(LocalDateTime test_date) {
        this.test_date = test_date;
    }

    public LocalDateTime getReportDelivery_date() {
        return reportDelivery_date;
    }

    public void setReportDelivery_date(LocalDateTime reportDelivery_date) {
        this.reportDelivery_date = reportDelivery_date;
    }

    public String getReport_description() {
        return report_description;
    }

    public void setReport_description(String report_description) {
        this.report_description = report_description;
    }

    public String getReport_riskStatus() {
        return report_riskStatus;
    }

    public void setReport_riskStatus(String report_riskStatus) {
        this.report_riskStatus = report_riskStatus;
    }

    @Override
    public String toString() {
        return "TestLaboratoriesUpdateDTO{" +
                "laboratoryTest_id=" + laboratoryTest_id +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                ", test_name='" + test_name + '\'' +
                ", test_date=" + test_date +
                ", reportDelivery_date=" + reportDelivery_date +
                ", report_description='" + report_description + '\'' +
                ", report_riskStatus='" + report_riskStatus + '\'' +
                '}';
    }
}
