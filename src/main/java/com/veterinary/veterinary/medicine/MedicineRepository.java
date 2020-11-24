package com.veterinary.veterinary.medicine;

import com.veterinary.veterinary.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "medicines")
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}