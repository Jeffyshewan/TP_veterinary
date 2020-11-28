package com.veterinary.veterinary.doctor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

public class Doctor {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private int zipcode;
    private java.sql.Date arrival;

    @OneToMany
    @JoinColumn(name = "doctor_id")
    private Set<Doctor> doctors;
}
