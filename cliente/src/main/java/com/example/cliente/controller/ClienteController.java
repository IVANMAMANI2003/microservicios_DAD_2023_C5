package com.example.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cliente.entity.Cliente;
import com.example.cliente.service.ClienteService;
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @PostMapping()
    public Cliente guardar(@RequestBody Cliente producto) {
        return clienteService.guardar(producto);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable(required = true) Integer id) {
        return clienteService.listarPorId(id).get();
    }

    @PutMapping()
    public Cliente actualizar(@RequestBody Cliente producto) {
        return clienteService.actualizar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id) {
        clienteService.eliminarPorId(id);
    }
}
