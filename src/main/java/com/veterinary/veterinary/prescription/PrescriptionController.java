package com.veterinary.veterinary.prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @GetMapping
    public Iterable<Prescription> getPrescriptions() {
        return prescriptionRepository.findAll();
    }

    @GetMapping("/id/{prescriptionId}")
    public Optional<Prescription> getPrescription(@PathVariable("prescriptionId") int prescriptionId) {
        return prescriptionRepository.findById(prescriptionId);
    }

    @GetMapping("/name/{name}")
    public Iterable<Prescription> getPrescription(@PathVariable("name") String name) {
        return prescriptionRepository.findPrescriptionByNameIsContaining(name);
    }

    @DeleteMapping("/prescriptions/{id}")
    public void deletePrescription(@PathVariable int id) {
        prescriptionRepository.deleteById(id);
    }
}
