package com.upeu.catalogo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.upeu.catalogo.entity.Categoria;
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
