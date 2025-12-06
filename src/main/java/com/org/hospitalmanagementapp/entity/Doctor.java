package com.org.hospitalmanagementapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="doctor_id")
    private int doctor_id;
    @Column(name="doctor_name")
    private String doctor_name;
    @Column(name="dept")
    private String dept;
    @Column(name="mobile_no")
    private String mobile_no;

    public Doctor() {
    }

    public Doctor(int doctor_id, String doctor_name, String dept, String mobile_no) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.dept = dept;
        this.mobile_no = mobile_no;
    }

    public Doctor(String doctorName, String dept, String mobileNo) {
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getDept() {
        return dept;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctor_id=" + doctor_id +
                ", doctor_name='" + doctor_name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                '}';
    }
}
