package com.org.hospitalmanagementapp.repo;

import com.org.hospitalmanagementapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
}
