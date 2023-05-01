package com.upeu.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upeu.catalogo.entity.Producto;

public interface ProductRepository extends JpaRepository<Producto,Integer>{
    
}
