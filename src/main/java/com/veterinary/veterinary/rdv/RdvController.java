package com.veterinary.veterinary.rdv;

import com.veterinary.veterinary.animal.Animal;
import com.veterinary.veterinary.animal.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(path = "/rdvs")
public class RdvController {

    @Autowired
    private RdvRepository rdvRepository;
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public Iterable<Rdv> getRdv() {
        return rdvRepository.findAll();
    }

    @GetMapping("/id/{rdvId}")
    public Optional<Rdv> getRdv(@PathVariable("rdvId") int rdvId) {
        return rdvRepository.findById(rdvId);
    }

    @GetMapping("/date/{date}")
    public Iterable<Rdv> getPrescription(@PathVariable("date") Date date) {
        return rdvRepository.findRdvByDate(date);
    }

    @GetMapping("/animalId/{animalId}")
    public Iterable<Rdv> getRdvsByAnimalId(@PathVariable("animalId") int animalId) {
        Optional<Animal> opt = animalRepository.findById(animalId);
        return rdvRepository.findRdvByAnimal(opt);
    }
}
