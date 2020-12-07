package com.veterinary.veterinary.doctor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

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
}
