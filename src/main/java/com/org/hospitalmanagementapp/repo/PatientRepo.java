package com.org.hospitalmanagementapp.repo;

import com.org.hospitalmanagementapp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
