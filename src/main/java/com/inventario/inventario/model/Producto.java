package com.inventario.inventario.model;

import java.util.Date;
import jakarta.persistence.*;
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

    @Column(nullable = false, length= 100)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false, length= 50)
    private String categoria;

    @Column(nullable = false, length= 50)
    private String color;

    @Column(nullable = false)
    private Date fecha_creacion;

    @ManyToOne
    private Inventario inventario;
    
    @ManyToOne
    private Tipo_talla tipo_talla;

}


