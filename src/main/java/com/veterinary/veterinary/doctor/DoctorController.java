package com.veterinary.veterinary.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id/{doctorId}")
    public Optional<Doctor> getDoctor(@PathVariable("doctorId") int doctorId) {
        return doctorRepository.findById(doctorId);
    }

    @GetMapping("/name/{doctorName}")
    public Iterable<Doctor> getDoctorsByName(@PathVariable("doctorName") String lastname) {
        return doctorRepository.findDoctorsByLastnameIsContaining(lastname);
    }

    @DeleteMapping("/doctors/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorRepository.deleteById(id);
    }

}
