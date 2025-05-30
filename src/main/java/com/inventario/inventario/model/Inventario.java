package com.inventario.inventario.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Inventario")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Inventario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer inventario_id;

    @Column(nullable = false)
    private Integer stock = 10000;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    private List<Producto> productos;
}