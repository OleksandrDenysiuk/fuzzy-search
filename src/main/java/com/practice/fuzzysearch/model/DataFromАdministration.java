package com.practice.fuzzysearch.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "data_from_administration")
@Getter
@Setter
@NoArgsConstructor
public class DataFromАdministration{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJECTID")
    private Long id;

    @Column(name = "FID")
    private Long fid;

    @Column(name = "SIMC_nazwa")
    private String city;

    @Column(name = "ULIC_nazwa")
    private String street;

    @Column(name = "JPT_NAZWA")
    private String jpt;
}
