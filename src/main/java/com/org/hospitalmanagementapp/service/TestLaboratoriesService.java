package com.org.hospitalmanagementapp.service;

import com.org.hospitalmanagementapp.dto.TestLaboratoriesDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesSaveDTO;
import com.org.hospitalmanagementapp.dto.TestLaboratoriesUpdateDTO;

import java.util.List;

public interface TestLaboratoriesService {

    int addTestLaboratories(TestLaboratoriesSaveDTO testLaboratoriesSaveDTO);

    List<TestLaboratoriesDTO> getAllTestLaboratories();

    String updateTestLaboratories(TestLaboratoriesUpdateDTO testLaboratoriesUpdateDTO);

    boolean deleteTestLaboratories(int laboratoryTest_id);

}
