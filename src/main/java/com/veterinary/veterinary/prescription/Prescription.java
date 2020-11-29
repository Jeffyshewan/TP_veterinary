package com.veterinary.veterinary.prescription;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @OneToMany
    @JoinColumn(name = "prescription_id")
    @OrderBy("name")
    @JsonIgnoreProperties
    private Set<Medicine> medicines;
}
