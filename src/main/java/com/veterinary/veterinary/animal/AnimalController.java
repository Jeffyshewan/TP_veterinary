package com.veterinary.veterinary.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id/{animalId}")
    public Optional<Animal> getAnimal(@PathVariable("animalId") int animalId) {
        return animalRepository.findById(animalId);
    }

    @GetMapping("/name/{animalName}")
    public Iterable<Animal> getAnimalsByName(@PathVariable("Name") String name) {
        return animalRepository.findAnimalByNameIsContaining(name);
    }

    @DeleteMapping("/animals/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalRepository.deleteById(id);
    }

    @PutMapping("/animals/{id}")
    public Animal updateAnimal(@PathVariable("id") int id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalRepository.save(animal);
    }
}
