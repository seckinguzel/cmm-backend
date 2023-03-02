package com.marubeni.cmmbackend.entity.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name="informations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "actual")
    private double actual;

    @Column(name = "nominal")
    private double nominal;

    @Column(name = "uppertol")
    private double uppertol;

    @Column(name = "lowertol")
    private double lowertol;

    @Column(name = "deviation")
    private double deviation;

    @Column(name = "group_name")
    private String groupName;
}
