package com.veterinary.veterinary.animal;


import com.veterinary.veterinary.doctor.Doctor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private java.sql.Date birth;
    private java.sql.Date death;

    @ManyToOne
    private Animal parent_1;
    @ManyToOne
    private Animal parent_2;

    public Animal(int id) {
        this.id = id;
    }

    public Animal(int id, String name, java.sql.Date birth, java.sql.Date death, Animal parent_1, Animal parent_2) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.parent_1 = parent_1;
        this.parent_2 = parent_2;
    }
}
