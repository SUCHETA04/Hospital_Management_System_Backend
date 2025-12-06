package com.org.hospitalmanagementapp.service;

import com.org.hospitalmanagementapp.dto.DoctorDTO;
import com.org.hospitalmanagementapp.dto.DoctorSaveDTO;
import com.org.hospitalmanagementapp.dto.DoctorUpdateDTO;

import java.util.List;

public interface DoctorService {
    String addDoctor(DoctorSaveDTO doctorSaveDTO);
    List<DoctorDTO> getAllDoctors();

    String updateDoctor(DoctorUpdateDTO doctorUpdateDTO);

    boolean deleteDoctor(int doctorId);
}
