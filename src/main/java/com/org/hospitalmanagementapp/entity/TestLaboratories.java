package com.org.hospitalmanagementapp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Test Laboratories")
public class TestLaboratories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "laboratoryTest_id")
    private int laboratoryTest_id;
    @Column(name = "patient_id")
    private int patient_id;
    @Column(name = "doctor_id")
    private int doctor_id;
    @Column(name = "test_name")
    private String test_name;
    @Column(name = "test_date")
    private LocalDateTime test_date;
    @Column(name = "reportDelivery_date")
    private LocalDateTime reportDelivery_date;
    @Column(name = "report_description")
    private String report_description;
    @Column(name = "report_riskStatus")
    private String report_riskStatus;

    public TestLaboratories() {
    }

    public TestLaboratories(int laboratoryTest_id, int patient_id, int doctor_id, String test_name, LocalDateTime test_date, LocalDateTime reportDelivery_date, String report_description, String report_riskStatus) {
        this.laboratoryTest_id = laboratoryTest_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.test_name = test_name;
        this.test_date = test_date;
        this.reportDelivery_date = reportDelivery_date;
        this.report_description = report_description;
        this.report_riskStatus = report_riskStatus;
    }

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
        return "TestLaboratories{" +
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
