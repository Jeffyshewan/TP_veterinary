package com.veterinary.veterinary.animal;

import com.veterinary.veterinary.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "animals")
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}