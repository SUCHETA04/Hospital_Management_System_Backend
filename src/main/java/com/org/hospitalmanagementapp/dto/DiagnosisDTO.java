package com.org.hospitalmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiagnosisDTO {

    private int diagnosis_id;
    private int patient_id;
    private int doctor_id;
    private LocalDateTime diagnosis_date;
    private String diagnosis_description;
    private String suggested_medicines;
    private String suggested_tests;
    private LocalDateTime next_appointmentDate;

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
}
