package com.shona.api;

import jakarta.persistence.*;

@Entity
@Table(name = "test_table")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
