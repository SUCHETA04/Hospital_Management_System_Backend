package com.org.hospitalmanagementapp.controller;

import com.org.hospitalmanagementapp.dto.TestLaboratoriesDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesSaveDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesUpdateDTO;
import com.org.hospitalmanagementapp.service.TestLaboratoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/testLaboratories")
public class TestLaboratoriesController {

    //TestLaboratoriesService obj = new TestLaboratoriesService()
    @Autowired
    private TestLaboratoriesService testLaboratoriesService;

    @PostMapping(path = "/save")
    public int saveTestLaboratories(@RequestBody TestLaboratoriesSaveDTO testLaboratoriesSaveDTO){
        int patientId = testLaboratoriesService.addTestLaboratories(testLaboratoriesSaveDTO);
        return patientId;
    }

    @GetMapping(path = "/getAllTestLaboratoriesDetails")
    public List<TestLaboratoriesDTO> getAllTestLaboratories(){ return testLaboratoriesService.getAllTestLaboratories();}

    @PutMapping(path = "/update")
    public String updateTestLaboratories(@RequestBody TestLaboratoriesUpdateDTO testLaboratoriesUpdateDTO){
        String laboratoryTest_id = testLaboratoriesService.updateTestLaboratories(testLaboratoriesUpdateDTO);
        return laboratoryTest_id;
    }

    @DeleteMapping(path = "/delete/{laboratoryTest_id}")
    public String deleteTestLaboratories(@PathVariable(value = "laboratoryTest_id") int laboratoryTest_id){
        boolean deleteTestLaboratoriesStatus = testLaboratoriesService.deleteTestLaboratories(laboratoryTest_id);
        if(deleteTestLaboratoriesStatus == true){
            return "TestLaboratories data deleted";
        }
        else {
            return "TestLaboratories data doesn't exist";
        }
    }

}
