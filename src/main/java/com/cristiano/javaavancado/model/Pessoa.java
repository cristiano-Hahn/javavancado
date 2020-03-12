package com.cristiano.javaavancado.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;
}
