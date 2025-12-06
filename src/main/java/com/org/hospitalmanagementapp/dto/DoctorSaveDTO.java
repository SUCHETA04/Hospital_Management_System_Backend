package com.org.hospitalmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorSaveDTO {
    private String doctor_name;
    private String dept;
    private String mobile_no;

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getDept() {
        return dept;
    }

    public String getMobile_no() {
        return mobile_no;
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
        return "DoctorSaveDTO{" +
                "doctor_name='" + doctor_name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                '}';
    }
}
