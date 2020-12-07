package com.veterinary.veterinary.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/medicines")
public class MedicineController {

    @Autowired
    private MedicineRepository medicineRepository;

    @GetMapping
    public Iterable<Medicine> getMedicines() {
        return medicineRepository.findAll();
    }

    @GetMapping("/{medicineId}")
    public Optional<Medicine> getMedicine(@PathVariable("medicineId") int medicineId) {
        return medicineRepository.findById(medicineId);
    }
}
