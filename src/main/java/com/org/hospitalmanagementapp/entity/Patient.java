package com.org.hospitalmanagementapp.entity;


import jakarta.persistence.*;
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "patient_id")
    private int patient_id;
    @Column(name = "patient_name")
    private String patient_name;
    @Column(name = "patient_admissionDate")
    private String patient_admissionDate;
    @Column(name = "patient_admissionWard")
    private String patient_admissionWard;
    @Column(name = "patient_undertakenDoctor" )
    private String patient_undertakenDoctor;
    @Column(name = "mobile_no")
    private String mobile_no;

    public Patient() {
    }

    public Patient(int patient_id, String patient_name, String patient_guardianName, String patient_admissionDate, String patient_admissionWard, String patient_undertakenDoctor, String mobile_no) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_admissionDate = patient_admissionDate;
        this.patient_admissionWard = patient_admissionWard;
        this.patient_undertakenDoctor = patient_undertakenDoctor;
        this.mobile_no = mobile_no;
    }

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

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id=" + patient_id +
                ", patient_name='" + patient_name + '\'' +
                ", patient_admissionDate='" + patient_admissionDate + '\'' +
                ", patient_admissionWard='" + patient_admissionWard + '\'' +
                ", patient_undertakenDoctor='" + patient_undertakenDoctor + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                '}';
    }
}
