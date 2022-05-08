package com.example.project_2.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sweepstake_participants")
public class SweepstakeParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="sweepstake_id")
    private int sweepstakeId;

    @Column(name="users_id")
    private int usersId;
}
