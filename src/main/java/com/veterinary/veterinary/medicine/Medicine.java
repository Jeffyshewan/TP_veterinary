package com.veterinary.veterinary.medicine;

import com.veterinary.veterinary.doctor.Doctor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

public class Medicine {
    @Id
    private int id;
    private String name;
    private java.sql.Date date;


}
