package com.example.venta.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.venta.entity.Venta;
import com.example.venta.repository.VentaRepository;
import com.example.venta.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService{
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta>listar(){
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardar(Venta producto) {
        
        return ventaRepository.save(producto);
    }

    @Override
    public Venta actualizar(Venta producto) {
        
        return ventaRepository.save(producto);
    }

    @Override
    public Optional<Venta> listarPorId(Integer id) {
        return ventaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        
        ventaRepository.deleteById(id);
    }
}
