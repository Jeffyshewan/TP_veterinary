package com.veterinary.veterinary.rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/rdvs")
public class RdvController {

    @Autowired
    private RdvRepository rdvRepository;

    @GetMapping
    public Iterable<Rdv> getRdv() {
        return rdvRepository.findAll();
    }

    @GetMapping("/{rdvId}")
    public Optional<Rdv> getRdv(@PathVariable("rdvId") int rdvId) {
        return rdvRepository.findById(rdvId);
    }
}
