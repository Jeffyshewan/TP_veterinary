package com.veterinary.veterinary.doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "doctors")
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Iterable<Doctor> findDoctorsByLastnameIsContaining(String lastname);
}
