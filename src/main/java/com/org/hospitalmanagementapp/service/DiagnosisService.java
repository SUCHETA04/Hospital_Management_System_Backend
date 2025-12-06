package com.org.hospitalmanagementapp.service;

import com.org.hospitalmanagementapp.dto.DiagnosisDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisSaveDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisUpdateDTO;

import java.util.List;

public interface DiagnosisService {
    int addDiagnosis(DiagnosisSaveDTO diagnosisSaveDTO);

    List<DiagnosisDTO> getAllDiagnoses();

    String updateDiagnosis(DiagnosisUpdateDTO diagnosisUpdateDTO);

    boolean deleteDiagnosis(int diagnosisId);

}
