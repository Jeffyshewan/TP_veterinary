package com.veterinary.veterinary.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/animals")
public class AnimalController {
    List<Integer> parentsId = new LinkedList<Integer>();

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
    @GetMapping("/parents/{animalId}")
    public List<Boolean> getParents(@PathVariable("animalId") int animalId) {
        List<Boolean> parents = List.of(
                animalRepository.findById(animalId).get().isParent1Null(),
                animalRepository.findById(animalId).get().isParent2Null()
        );
        return parents;
    }
    @GetMapping("/name/{animalName}")
    public Iterable<Animal> getAnimalsByName(@PathVariable("animalName") String name) {
        return animalRepository.findAnimalByNameIsContaining(name);
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalRepository.deleteById(id);
    }

    public void checkParents(int currentId) {
        if (animalRepository.findById(currentId) != null) {
            parentsId.add(currentId);
            if(!animalRepository.findById(currentId).get().isParent1Null()){ //Si le parent 1 n'est pas null
                checkParents(animalRepository.findById(currentId).get().getParent_1().getId()); // faire le check sur le parent1.
            }
            if(!animalRepository.findById(currentId).get().isParent2Null()){
                checkParents(animalRepository.findById(currentId).get().getParent_2().getId());
            }
        }
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable("id") int id, @RequestBody Animal newAnimal) {
        parentsId.clear();
        newAnimal.setId(id);
        checkParents(id);// Stock les Id des parents dans parentsId
        parentsId.remove(0);//Supprime le 1e ID qui est celui qu'on midifie
        if(parentsId.contains(id)){
            parentsId.clear();
            return null;
        }
        parentsId.clear();
        return animalRepository.save(newAnimal);
    }

}
