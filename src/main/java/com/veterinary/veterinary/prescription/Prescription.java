package com.veterinary.veterinary.prescription;


import com.veterinary.veterinary.animal.Animal;
import com.veterinary.veterinary.doctor.Doctor;
import com.veterinary.veterinary.medicine.Medicine;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Animal animal;

    @ManyToMany
    private Set<Medicine> medicines;

}
