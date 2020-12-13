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
        Animal parent1 = animalRepository.findById(newAnimal.getParent_1().getId()).get();
        Animal parent2 = animalRepository.findById(newAnimal.getParent_2().getId()).get();
        boolean p1 = !existInTree(parent1, newAnimal);
        boolean p2 = !existInTree(parent2, newAnimal);
        System.out.println("!existInTree(newAnimal.getParent_1(), newAnimal) : " + p1);
        System.out.println("\n!existInTree(newAnimal.getParent_2(), newAnimal) : " + p2);

    if ( p1 && p2 ) {
            animalRepository.save(newAnimal);
            return newAnimal;
        }else return new Animal(151515);
    }
    private boolean existInTree(Animal current, Animal newAnimal) {
        System.out.println("newAnimal.getName() : "+newAnimal.getName()+"\n");
        System.out.println("current.getName() :"+current.getName()+"\n"+"\n");
        if(current.getName()==newAnimal.getName()) return true;
        if(current.getParent_1()!=null) existInTree(current.getParent_1(), newAnimal);
        if(current.getParent_2()!=null) existInTree(current.getParent_2(), newAnimal);
        return false;
    }
}
