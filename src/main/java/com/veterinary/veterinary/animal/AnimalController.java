package com.veterinary.veterinary.animal;

import com.veterinary.veterinary.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;
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
    public Iterable<Animal> getAnimalsByName(@PathVariable("animalName") String name){
        return animalRepository.findAnimalByNameIsContaining(name);
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal newAnimal){
      /*  boolean p1 = !existInTree(animalRepository.findById(newAnimal.getParent_1().getId()).get(), newAnimal);
        boolean p2 = !existInTree(animalRepository.findById(newAnimal.getParent_2().getId()).get(), newAnimal);

    if ( p1 && p2 ) {
            animalRepository.save(newAnimal);
            return newAnimal;
        }else return new Animal(151515);*/
        return animalRepository.save(newAnimal);
    }
/*    private boolean existInTree(Animal current, Animal newAnimal) {
        if(current.getName()==newAnimal.getName()) return true;
        if(current.getParent_1()!=null) existInTree(current.getParent_1(), newAnimal);
        if(current.getParent_2()!=null) existInTree(current.getParent_2(), newAnimal);
        return false;
    }*/
}
