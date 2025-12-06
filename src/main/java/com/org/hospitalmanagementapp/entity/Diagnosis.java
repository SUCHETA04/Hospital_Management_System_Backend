package com.org.hospitalmanagementapp.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "diagnosis")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "diagnosis_id")
    private int diagnosis_id;
    @Column(name = "patient_id")
    private int patient_id;
    @Column(name = "doctor_id")
    private int doctor_id;
    @Column(name = "diagnosis_date")
    private LocalDateTime diagnosis_date;
    @Column(name = "diagnosis_description")
    private String diagnosis_description;
    @Column(name = "suggested_medicines")
    private String suggested_medicines;
    @Column(name = "suggested_tests")
    private String suggested_tests;
    @Column(name = "next_appointmentDate")
    private LocalDateTime next_appointmentDate;

    public Diagnosis() {
    }

    public Diagnosis(int diagnosis_id, int patient_id, int doctor_id, LocalDateTime diagnosis_date, String diagnosis_description, String suggested_medicines, String suggested_tests, LocalDateTime next_appointmentDate) {
        this.diagnosis_id = diagnosis_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.diagnosis_date = diagnosis_date;
        this.diagnosis_description = diagnosis_description;
        this.suggested_medicines = suggested_medicines;
        this.suggested_tests = suggested_tests;
        this.next_appointmentDate = next_appointmentDate;
    }

    public int getDiagnosis_id() {
        return diagnosis_id;
    }

    public void setDiagnosis_id(int diagnosis_id) {
        this.diagnosis_id = diagnosis_id;
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

    public LocalDateTime getDiagnosis_date() {
        return diagnosis_date;
    }

    public void setDiagnosis_date(LocalDateTime diagnosis_date) {
        this.diagnosis_date = diagnosis_date;
    }

    public String getDiagnosis_description() {
        return diagnosis_description;
    }

    public void setDiagnosis_description(String diagnosis_description) {
        this.diagnosis_description = diagnosis_description;
    }

    public String getSuggested_medicines() {
        return suggested_medicines;
    }

    public void setSuggested_medicines(String suggested_medicines) {
        this.suggested_medicines = suggested_medicines;
    }

    public String getSuggested_tests() {
        return suggested_tests;
    }

    public void setSuggested_tests(String suggested_tests) {
        this.suggested_tests = suggested_tests;
    }

    public LocalDateTime getNext_appointmentDate() {
        return next_appointmentDate;
    }

    public void setNext_appointmentDate(LocalDateTime next_appointmentDate) {
        this.next_appointmentDate = next_appointmentDate;
    }


    @Override
    public String toString() {
        return "Diagnosis{" +
                "diagnosis_id=" + diagnosis_id +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                ", diagnosis_date=" + diagnosis_date +
                ", diagnosis_description='" + diagnosis_description + '\'' +
                ", suggested_medicines='" + suggested_medicines + '\'' +
                ", suggested_tests='" + suggested_tests + '\'' +
                ", next_appointmentDate=" + next_appointmentDate +
                '}';
    }
}
