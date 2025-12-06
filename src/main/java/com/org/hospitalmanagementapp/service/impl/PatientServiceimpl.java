package com.org.hospitalmanagementapp.service.impl;

import com.org.hospitalmanagementapp.dto.PatientDTO;
import com.org.hospitalmanagementapp.dto.PatientSaveDTO;
import com.org.hospitalmanagementapp.dto.PatientUpdateDTO;
import com.org.hospitalmanagementapp.entity.Patient;
import com.org.hospitalmanagementapp.repo.PatientRepo;
import com.org.hospitalmanagementapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceimpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public String addPatient(PatientSaveDTO patientSaveDTO) {
        Patient patient = new Patient();

        patient.setPatient_name(patientSaveDTO.getPatient_name());
        patient.setPatient_admissionDate(patientSaveDTO.getPatient_admissionDate());
        patient.setPatient_admissionWard(patientSaveDTO.getPatient_admissionWard());
        patient.setPatient_undertakenDoctor(patientSaveDTO.getPatient_undertakenDoctor());
        patient.setMobile_no(patientSaveDTO.getMobile_no());
        patientRepo.save(patient);
        return patient.getPatient_name();
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepo.findAll();
        List<PatientDTO> patientDTOS = new ArrayList<>();
        for(Patient p: patients){
            PatientDTO patientDTO = new PatientDTO();
            patientDTO.setPatient_id(p.getPatient_id());
            patientDTO.setPatient_name(p.getPatient_name());
            patientDTO.setPatient_admissionDate(p.getPatient_admissionDate());
            patientDTO.setPatient_admissionWard(p.getPatient_admissionWard());
            patientDTO.setPatient_undertakenDoctor(p.getPatient_undertakenDoctor());
            patientDTO.setMobile_no(p.getMobile_no());
            patientDTOS.add(patientDTO);
        }
        return patientDTOS;
    }

    @Override
    public String updatePatient(PatientUpdateDTO patientUpdateDTO){
        if (patientRepo.existsById(patientUpdateDTO.getPatient_id())){
            Patient patient = patientRepo.getById(patientUpdateDTO.getPatient_id());
            patient.setPatient_name(patientUpdateDTO.getPatient_name());
            patient.setPatient_admissionDate(patientUpdateDTO.getPatient_admissionDate());
            patient.setPatient_admissionWard(patientUpdateDTO.getPatient_admissionWard());
            patient.setPatient_undertakenDoctor(patientUpdateDTO.getPatient_undertakenDoctor());
            patient.setMobile_no(patientUpdateDTO.getMobile_no());
            patientRepo.save(patient);
        }
        else {
            System.out.println("Patient Doesn't exist");
        }
        return patientUpdateDTO.getPatient_name()+" : patient data updated";
    }

    @Override
    public boolean deletePatient(int patientId) {
        if (patientRepo.existsById(patientId)){
            patientRepo.deleteById(patientId);
            return true;
        }
        else {
            System.out.println("Patient doesn't exist");
            return false;
        }
    }
}
