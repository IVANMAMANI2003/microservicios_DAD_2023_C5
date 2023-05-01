package com.upeu.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.catalogo.entity.Producto;
import com.upeu.catalogo.repository.ProductRepository;
import com.upeu.catalogo.service.ProductoService;

@Service
public class ProductoServicelmpl implements ProductoService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Producto>listar(){
        return productRepository.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        
        return productRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        
        return productRepository.save(producto);
    }

    @Override
    public Optional<Producto> listarPorId(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        
        productRepository.deleteById(id);
    }
}
