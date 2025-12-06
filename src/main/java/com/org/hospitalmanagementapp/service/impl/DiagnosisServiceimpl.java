package com.org.hospitalmanagementapp.service.impl;

import com.org.hospitalmanagementapp.dto.DiagnosisDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisSaveDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisUpdateDTO;
import com.org.hospitalmanagementapp.entity.Diagnosis;
import com.org.hospitalmanagementapp.repo.DiagnosisRepo;
import com.org.hospitalmanagementapp.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiagnosisServiceimpl implements DiagnosisService {

    @Autowired
    private DiagnosisRepo diagnosisRepo;

    @Override
    public int addDiagnosis(DiagnosisSaveDTO diagnosisSaveDTO) {
        Diagnosis diagnosis = new Diagnosis();

        diagnosis.setPatient_id(diagnosisSaveDTO.getPatient_id());
        diagnosis.setDoctor_id(diagnosisSaveDTO.getDoctor_id());
        diagnosis.setDiagnosis_date(diagnosisSaveDTO.getDiagnosis_date());
        diagnosis.setDiagnosis_description(diagnosisSaveDTO.getDiagnosis_description());
        diagnosis.setSuggested_medicines(diagnosisSaveDTO.getSuggested_medicines());
        diagnosis.setSuggested_tests(diagnosisSaveDTO.getSuggested_tests());
        diagnosis.setNext_appointmentDate(diagnosisSaveDTO.getNext_appointmentDate());
        diagnosisRepo.save(diagnosis);
        return diagnosis.getPatient_id();
    }

    @Override
    public List<DiagnosisDTO> getAllDiagnoses() {
        List<Diagnosis> diagnoses = diagnosisRepo.findAll();
        List<DiagnosisDTO> diagnosisDTOS = new ArrayList<>();
        for (Diagnosis d: diagnoses){
            DiagnosisDTO diagnosisDTO = new DiagnosisDTO();
            diagnosisDTO.setDiagnosis_id(d.getDiagnosis_id());
            diagnosisDTO.setPatient_id(d.getPatient_id());
            diagnosisDTO.setDoctor_id(d.getDoctor_id());
            diagnosisDTO.setDiagnosis_date(d.getDiagnosis_date());
            diagnosisDTO.setDiagnosis_description(d.getDiagnosis_description());
            diagnosisDTO.setSuggested_medicines(d.getSuggested_medicines());
            diagnosisDTO.setSuggested_tests(d.getSuggested_tests());
            diagnosisDTO.setNext_appointmentDate(d.getNext_appointmentDate());
            diagnosisDTOS.add(diagnosisDTO);
        }
        return diagnosisDTOS;
    }

    @Override
    public String updateDiagnosis(DiagnosisUpdateDTO diagnosisUpdateDTO){
        if (diagnosisRepo.existsById(diagnosisUpdateDTO.getDiagnosis_id())){
            Diagnosis diagnosis = diagnosisRepo.getById(diagnosisUpdateDTO.getDiagnosis_id());
            diagnosis.setPatient_id(diagnosisUpdateDTO.getPatient_id());
            diagnosis.setDoctor_id(diagnosisUpdateDTO.getDoctor_id());
            diagnosis.setDiagnosis_date(diagnosisUpdateDTO.getDiagnosis_date());
            diagnosis.setDiagnosis_description(diagnosisUpdateDTO.getDiagnosis_description());
            diagnosis.setSuggested_medicines(diagnosisUpdateDTO.getSuggested_medicines());
            diagnosis.setSuggested_tests(diagnosisUpdateDTO.getSuggested_tests());
            diagnosis.setNext_appointmentDate(diagnosisUpdateDTO.getNext_appointmentDate());
            diagnosisRepo.save(diagnosis);
        }
        else {
            System.out.println("Diagnosis detail doesn't exist");
        }
        return diagnosisUpdateDTO.getDiagnosis_id()+" : Diagnosis data updated";
    }

    @Override
    public boolean deleteDiagnosis(int diagnosisId) {
        if (diagnosisRepo.existsById(diagnosisId)){
            diagnosisRepo.deleteById(diagnosisId);
            return true;
        }
        else {
            System.out.println("Diagnosis data doesn't exist");
            return false;
        }
    }

}
