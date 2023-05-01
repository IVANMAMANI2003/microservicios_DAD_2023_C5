package com.upeu.catalogo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    
   
    
   /* */ @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoria_id")
    @JsonIgnoreProperties({"hibernateLazyInitializar", "handler"})
    private Categoria categoria;
}
