package com.veterinary.veterinary.rdv;

import com.veterinary.veterinary.animal.Animal;
import com.veterinary.veterinary.doctor.Doctor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor

public class Rdv {
    @Id
    private int id;
    private Date date;

    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Animal animal;
}
