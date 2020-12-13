package com.veterinary.veterinary.rdv;

import com.veterinary.veterinary.animal.Animal;
import com.veterinary.veterinary.animal.AnimalRepository;
import com.veterinary.veterinary.doctor.Doctor;
import com.veterinary.veterinary.doctor.DoctorRepository;
import com.veterinary.veterinary.prescription.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(path = "/rdvs")
public class RdvController {

    @Autowired
    private RdvRepository rdvRepository;
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping
    public Iterable<Rdv> getRdv() {
        return rdvRepository.findAll();
    }

    @GetMapping("/id/{rdvId}")
    public Optional<Rdv> getRdv(@PathVariable("rdvId") int rdvId) {
        return rdvRepository.findById(rdvId);
    }

    @GetMapping("/animalId/{animalId}")
    public Iterable<Rdv> getRdvsByAnimalId(@PathVariable("animalId") int animalId) {
        Optional<Animal> opt = animalRepository.findById(animalId);
        return rdvRepository.findRdvByAnimal(opt);
    }
    /*
    @GetMapping("/animalName/{animalName}")
    public Iterable<Rdv> getRdvsByAnimalName(@PathVariable("animalName") String animalName) {
        Iterable<Animal> it = animalRepository.findAnimalByNameIsContaining(animalName);
        return rdvRepository.findRdvByAnimal(it);
    }*/

    @GetMapping("/doctorId/{doctorId}")
    public Iterable<Rdv> getRdvsByDoctorId(@PathVariable("doctorId") int doctorId) {
        Optional<Doctor> opt = doctorRepository.findById(doctorId);
        return rdvRepository.findRdvByDoctor(opt);
    }
/*
    @GetMapping("/doctorName/{doctorName}")
    public Iterable<Rdv> getRdvsByDoctorName(@PathVariable("doctorName") String doctorName) {
        Iterable<D  octor> it = doctorRepository.findDoctorsByLastnameIsContaining(doctorName);
        return rdvRepository.findRdvByDoctor(it);
    }*/

    @PostMapping
    public Rdv addRdv(@RequestBody Rdv newRdv){
        return rdvRepository.save(newRdv);
    }

}
