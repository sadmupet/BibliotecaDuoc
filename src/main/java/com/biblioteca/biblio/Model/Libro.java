package com.biblioteca.biblio.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "libro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private String fechaIngreso;

    @JsonProperty("isbn")
    @Column(unique=true, length = 13, nullable=false)
    private String ISBN;

    @Column(nullable=false)
    private String autor;

    @Column(nullable=false)
    private String editorial;

    @Column(nullable=false)
    private String anioPublicacion;
    

}
