package com.veterinary.veterinary.rdv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rdvs")
public interface RdvRepository extends JpaRepository<Rdv, Integer> {
}
