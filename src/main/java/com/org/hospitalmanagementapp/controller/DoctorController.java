package com.org.hospitalmanagementapp.controller;

import com.org.hospitalmanagementapp.dto.DoctorDTO;
import com.org.hospitalmanagementapp.dto.DoctorSaveDTO;
import com.org.hospitalmanagementapp.dto.DoctorUpdateDTO;
import com.org.hospitalmanagementapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/doctor")
public class DoctorController {

    //DoctorService obj = new DoctorService();
    @Autowired
    private DoctorService doctorService;
    

    @PostMapping(path="/save")
    public String saveDoctor(@RequestBody DoctorSaveDTO doctorSaveDTO){
        String doctorName = doctorService.addDoctor(doctorSaveDTO);
        return doctorName;
    }

    @GetMapping(path="/getAllDoctorDetails")
    public List<DoctorDTO> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PutMapping(path="/update")
    public String updateDoctor(@RequestBody DoctorUpdateDTO doctorUpdateDTO){
        String doctorName = doctorService.updateDoctor(doctorUpdateDTO);
        return doctorName;
    }

    @DeleteMapping(path="/delete/{doctor_id}")
    public String deleteDoctor(@PathVariable(value = "doctor_id") int doctor_id){
       boolean deleteDoctorStatus = doctorService.deleteDoctor(doctor_id);
       if (deleteDoctorStatus == true){
           return "Doctor deleted";
       }
       else{
           return "Doctor doesn't exist";
       }
    }

}
