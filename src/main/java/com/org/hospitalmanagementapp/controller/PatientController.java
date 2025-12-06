package com.org.hospitalmanagementapp.controller;

import com.org.hospitalmanagementapp.dto.PatientDTO;
import com.org.hospitalmanagementapp.dto.PatientSaveDTO;
import com.org.hospitalmanagementapp.dto.PatientUpdateDTO;
import com.org.hospitalmanagementapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/patient")
public class PatientController {

    //PatientService obj = new PatientService()
    @Autowired
    private PatientService patientService;

    @PostMapping(path = "/save")
    public String savePatient(@RequestBody PatientSaveDTO patientSaveDTO){
        String patientName = patientService.addPatient(patientSaveDTO);
        return patientName;
    }

    @GetMapping(path = "/getAllPatientDetails")
    public List<PatientDTO> getAllPatients(){ return patientService.getAllPatients(); }

    @PutMapping(path = "/update")
    public String updatePatient(@RequestBody PatientUpdateDTO patientUpdateDTO){
        String patientName = patientService.updatePatient(patientUpdateDTO);
        return patientName;
    }

    @DeleteMapping(path = "/delete/{patient_id}")
    public String deletePatient(@PathVariable(value = "patient_id") int patient_id){
        boolean deletePatientStatus = patientService.deletePatient(patient_id);
        if(deletePatientStatus == true){
            return "Patient deleted";
        }
        else{
            return "Patient doesn't exist";
        }
    }
}
