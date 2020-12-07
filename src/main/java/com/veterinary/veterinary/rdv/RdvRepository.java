package com.veterinary.veterinary.rdv;

import com.veterinary.veterinary.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.Optional;

@RepositoryRestResource(path = "rdvs")
public interface RdvRepository extends JpaRepository<Rdv, Integer> {
    Iterable<Rdv> findRdvByDate(Date date);
    Iterable<Rdv> findRdvByAnimal(Optional<Animal> animal);
}
