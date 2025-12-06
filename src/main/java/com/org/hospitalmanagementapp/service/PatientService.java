package com.org.hospitalmanagementapp.service;

import com.org.hospitalmanagementapp.dto.PatientDTO;
import com.org.hospitalmanagementapp.dto.PatientSaveDTO;
import com.org.hospitalmanagementapp.dto.PatientUpdateDTO;

import java.util.List;

public interface PatientService {
    String addPatient(PatientSaveDTO patientSaveDTO);

    List<PatientDTO> getAllPatients();

    String updatePatient(PatientUpdateDTO patientUpdateDTO);

    boolean deletePatient(int patientId);

}
