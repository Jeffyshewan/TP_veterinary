package com.veterinary.veterinary.medicine;

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

public class Medicine {
    @Id
    private int id;
    private String name;
    private java.sql.Date date;

    @OneToMany
    @JoinColumn(name = "medicine_id")
    private Set<Medicine> medicines;
}
