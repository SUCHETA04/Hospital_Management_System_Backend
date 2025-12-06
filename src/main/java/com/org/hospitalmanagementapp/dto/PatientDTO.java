package com.org.hospitalmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDTO {

    private int patient_id;
    private String patient_name;
    private String patient_admissionDate;
    private String patient_admissionWard;
    private String patient_undertakenDoctor;
    private String mobile_no;

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_admissionDate() {
        return patient_admissionDate;
    }

    public void setPatient_admissionDate(String patient_admissionDate) {
        this.patient_admissionDate = patient_admissionDate;
    }

    public String getPatient_admissionWard() {
        return patient_admissionWard;
    }

    public void setPatient_admissionWard(String patient_admissionWard) {
        this.patient_admissionWard = patient_admissionWard;
    }

    public String getPatient_undertakenDoctor() {
        return patient_undertakenDoctor;
    }

    public void setPatient_undertakenDoctor(String patient_undertakenDoctor) {
        this.patient_undertakenDoctor = patient_undertakenDoctor;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}



