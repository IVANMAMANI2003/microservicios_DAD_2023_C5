package com.upeu.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.catalogo.entity.Categoria;
import com.upeu.catalogo.repository.CategoriaRepository;
import com.upeu.catalogo.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository; //inyectamos
        
    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }
    
    @Override
    public Categoria guardar(Categoria categoria) {
       return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
       return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        categoriaRepository.deleteById(id);
    }
    
}
