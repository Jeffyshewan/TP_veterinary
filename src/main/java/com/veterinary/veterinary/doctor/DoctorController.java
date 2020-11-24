package com.veterinary.veterinary.doctor;

import com.veterinary.veterinary.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping
    public Iterable<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    @GetMapping("/{doctorId")
    public Optional<Doctor> getDoctor(@PathVariable("doctorId") int doctorId) {
        return doctorRepository.findById(doctorId);
    }
}