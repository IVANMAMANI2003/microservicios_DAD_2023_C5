package com.example.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.venta.entity.VentaDetalle;

public interface VentaDetalleRepository extends JpaRepository<VentaDetalle,Integer>{
    
}
