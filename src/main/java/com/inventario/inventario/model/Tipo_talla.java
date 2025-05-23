package com.inventario.inventario.model;

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
@Table(name="Talla")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Talla {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer talla_id;

    @Column(nullable = false, length=10)
    private String descripcion;

}