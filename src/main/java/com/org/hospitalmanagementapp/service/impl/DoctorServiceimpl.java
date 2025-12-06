package com.org.hospitalmanagementapp.service.impl;

import com.org.hospitalmanagementapp.dto.DoctorDTO;
import com.org.hospitalmanagementapp.dto.DoctorSaveDTO;
import com.org.hospitalmanagementapp.dto.DoctorUpdateDTO;
import com.org.hospitalmanagementapp.entity.Doctor;
import com.org.hospitalmanagementapp.repo.DoctorRepo;
import com.org.hospitalmanagementapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceimpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public String addDoctor(DoctorSaveDTO doctorSaveDTO) {
        Doctor doctor = new Doctor(

        );

        doctor.setDoctor_name(doctorSaveDTO.getDoctor_name());
        doctor.setDept(doctorSaveDTO.getDept());
        doctor.setMobile_no(doctorSaveDTO.getMobile_no());
        doctorRepo.save(doctor);
        return doctor.getDoctor_name();
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepo.findAll();
        List<DoctorDTO> doctorDTOS= new ArrayList<>();
        for(Doctor d: doctors){
            DoctorDTO doctorDTO = new DoctorDTO();
            doctorDTO.setDoctor_id(d.getDoctor_id());
            doctorDTO.setDoctor_name(d.getDoctor_name());
            doctorDTO.setDept(d.getDept());
            doctorDTO.setMobile_no(d.getMobile_no());
            doctorDTOS.add(doctorDTO);
        }
         return doctorDTOS;

    }

    @Override
    public String updateDoctor(DoctorUpdateDTO doctorUpdateDTO) {
        if (doctorRepo.existsById(doctorUpdateDTO.getDoctor_id())){
            Doctor doctor = doctorRepo.getById(doctorUpdateDTO.getDoctor_id());
            doctor.setDoctor_name(doctorUpdateDTO.getDoctor_name());
            doctor.setDept(doctorUpdateDTO.getDept());
            doctor.setMobile_no(doctorUpdateDTO.getMobile_no());
            doctorRepo.save(doctor);
        }
        else {
            System.out.println("Doctor Doesn't exist");
        }
        return doctorUpdateDTO.getDoctor_name()+" : doctor data updated";
    }

    @Override
    public boolean deleteDoctor(int doctorId) {
        if (doctorRepo.existsById(doctorId)){
            doctorRepo.deleteById(doctorId);
            return true;
        }
        else {
            System.out.println("Doctor doesn't Exist");
            return false;
        }
    }
}
