package com.org.hospitalmanagementapp.controller;

import com.org.hospitalmanagementapp.dto.DiagnosisDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisSaveDTO;
import com.org.hospitalmanagementapp.dto.DiagnosisUpdateDTO;
import com.org.hospitalmanagementapp.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/diagnosis")
public class DiagnosisController {

    //DiagnosisService obj  = new DiagnosisService()
    @Autowired
    private DiagnosisService diagnosisService;

    @PostMapping(path = "/save")
    public int saveDiagnosis(@RequestBody DiagnosisSaveDTO diagnosisSaveDTO){
        int patientId = diagnosisService.addDiagnosis(diagnosisSaveDTO);
        return patientId;
    }

    @GetMapping(path = "/getAlldiagnosesDetails")
    public List<DiagnosisDTO> getAllDiagnoses(){ return diagnosisService.getAllDiagnoses(); }

    @PutMapping(path = "/update")
    public String updateDiagnosis (@RequestBody DiagnosisUpdateDTO diagnosisUpdateDTO){
        String diagnosis_id = diagnosisService.updateDiagnosis(diagnosisUpdateDTO);
        return diagnosis_id;
    }

    @DeleteMapping(path = "/delete/{diagnosis_id}")
    public String deleteDiagnosis(@PathVariable(value = "diagnosis_id") int diagnosis_id){
        boolean deleteDiagnosisStatus = diagnosisService.deleteDiagnosis(diagnosis_id);
        if(deleteDiagnosisStatus == true){
            return "Diagnosis data deleted";
        }
        else {
            return "Diagnosis data doesn't exist";
        }
    }
}
