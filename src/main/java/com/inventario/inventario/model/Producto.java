package com.inventario.inventario.model;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="Producto")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer producto_id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(unique=true,nullable = false)
    private double precio;

    @Column(nullable = true)
    private Date fecha;
   
    
}


