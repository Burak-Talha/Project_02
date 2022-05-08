package com.example.project_2.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sweepstake")
public class Sweepstake {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name="sweepstake_subject")
    private String sweepstake_subject;

    @Column(name="number_of_persons")
    private int numberOfPersons;
}
