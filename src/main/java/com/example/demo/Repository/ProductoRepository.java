package com.example.demo.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.Model.Producto;

public interface ProductoRepository extends ReactiveCrudRepository<Producto, String>
{
}
