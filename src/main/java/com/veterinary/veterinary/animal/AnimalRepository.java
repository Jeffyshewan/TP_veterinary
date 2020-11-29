package com.veterinary.veterinary.animal;

import com.veterinary.veterinary.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path = "animals")
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    public Set<Animal> findAnimalByNameIsStartingWith(String name);

}