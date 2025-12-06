package com.org.hospitalmanagementapp.service.impl;

import com.org.hospitalmanagementapp.dto.TestLaboratoriesDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesSaveDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesUpdateDTO;
import com.org.hospitalmanagementapp.entity.TestLaboratories;
import com.org.hospitalmanagementapp.repo.TestLaboratoriesRepo;
import com.org.hospitalmanagementapp.service.TestLaboratoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestLaboratoriesServiceimpl implements TestLaboratoriesService {

    @Autowired
    private TestLaboratoriesRepo testLaboratoriesRepo;

    @Override
    public int addTestLaboratories(TestLaboratoriesSaveDTO testLaboratoriesSaveDTO){
        TestLaboratories testLaboratories = new TestLaboratories();

        testLaboratories.setPatient_id(testLaboratoriesSaveDTO.getPatient_id());
        testLaboratories.setDoctor_id(testLaboratoriesSaveDTO.getDoctor_id());
        testLaboratories.setTest_name(testLaboratoriesSaveDTO.getTest_name());
        testLaboratories.setTest_date(testLaboratoriesSaveDTO.getTest_date());
        testLaboratories.setReportDelivery_date(testLaboratoriesSaveDTO.getReportDelivery_date());
        testLaboratories.setReport_description(testLaboratoriesSaveDTO.getReport_description());
        testLaboratories.setReport_riskStatus(testLaboratoriesSaveDTO.getReport_riskStatus());
        testLaboratoriesRepo.save(testLaboratories);
        return testLaboratories.getPatient_id();
    }

    @Override
    public List<TestLaboratoriesDTO> getAllTestLaboratories(){
        List<TestLaboratories> testLaboratories = testLaboratoriesRepo.findAll();
        List<TestLaboratoriesDTO> testLaboratoriesDTOS = new ArrayList<>();
        for(TestLaboratories t: testLaboratories){
            TestLaboratoriesDTO testLaboratoriesDTO = new TestLaboratoriesDTO();
            testLaboratoriesDTO.setLaboratoryTest_id(t.getLaboratoryTest_id());
            testLaboratoriesDTO.setPatient_id(t.getPatient_id());
            testLaboratoriesDTO.setDoctor_id(t.getDoctor_id());
            testLaboratoriesDTO.setTest_name(t.getTest_name());
            testLaboratoriesDTO.setTest_date(t.getTest_date());
            testLaboratoriesDTO.setReportDelivery_date(t.getReportDelivery_date());
            testLaboratoriesDTO.setReport_description(t.getReport_description());
            testLaboratoriesDTO.setReport_riskStatus(t.getReport_riskStatus());
            testLaboratoriesDTOS.add(testLaboratoriesDTO);
        }
        return testLaboratoriesDTOS;
    }

    @Override
    public String updateTestLaboratories(TestLaboratoriesUpdateDTO testLaboratoriesUpdateDTO) {
        TestLaboratories testLaboratories = null;
        if (testLaboratoriesRepo.existsById(testLaboratoriesUpdateDTO.getLaboratoryTest_id())) {
            testLaboratories = testLaboratoriesRepo.getById(testLaboratoriesUpdateDTO.getLaboratoryTest_id());
            testLaboratories.setPatient_id(testLaboratoriesUpdateDTO.getPatient_id());
            testLaboratories.setDoctor_id(testLaboratoriesUpdateDTO.getDoctor_id());
            testLaboratories.setTest_name(testLaboratoriesUpdateDTO.getTest_name());
            testLaboratories.setTest_date(testLaboratoriesUpdateDTO.getTest_date());
            testLaboratories.setReportDelivery_date(testLaboratoriesUpdateDTO.getReportDelivery_date());
            testLaboratories.setReport_description(testLaboratoriesUpdateDTO.getReport_description());
            testLaboratories.setReport_riskStatus(testLaboratoriesUpdateDTO.getReport_riskStatus());
            testLaboratoriesRepo.save(testLaboratories);
        }
        else {
            System.out.println("TestLaboratories data doesn't exist");
        }
        return testLaboratoriesUpdateDTO.getLaboratoryTest_id() + " : TestLaboratories data updated";
    }

    @Override
    public boolean deleteTestLaboratories(int laboratoryTest_id) {
        if (testLaboratoriesRepo.existsById(laboratoryTest_id)){
            testLaboratoriesRepo.deleteById(laboratoryTest_id);
            return true;
        }
        else {
            System.out.println("TestLaboratories data doesn't exist");
            return false;
        }
    }

}
