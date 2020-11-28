package com.veterinary.veterinary.rdv;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor

public class Rdv {
    @Id
    private int id;
    private Date date;

    @OneToOne
    @JoinColumn(name = "rdv_id")
    private Rdv rdv;
}
