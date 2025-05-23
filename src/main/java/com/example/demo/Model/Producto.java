package com.example.demo.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Producto {
    @Id
 private String id;
 private String nombre;
 private double precio;
}
