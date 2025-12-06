package com.org.hospitalmanagementapp.repo;

import com.org.hospitalmanagementapp.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepo extends JpaRepository<Diagnosis,Integer> {
}
