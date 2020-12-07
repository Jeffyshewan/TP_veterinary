package com.veterinary.veterinary.medicine;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Medicine {
    @Id
    private int id;
    private String name;
    private java.sql.Date date;


}
