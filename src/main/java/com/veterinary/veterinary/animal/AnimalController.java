package com.veterinary.veterinary.animal;

import com.veterinary.veterinary.animal.Animal;
import com.veterinary.veterinary.animal.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/animals")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public Iterable<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    @GetMapping("/{animalId}")
    public Optional<Animal> getAnimal(@PathVariable("animalId") int animalId) {
        return animalRepository.findById(animalId);
    }
}