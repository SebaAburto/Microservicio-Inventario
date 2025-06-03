package com.inventario.inventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Tipo_talla")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tipo_talla {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer tipo_talla_id;

    @Column(nullable = false, length=20)
    private String descripcion;

}

//XS (Extra Small)
//S (Small)
//M (Medium)
//L (Large)
//XL (Extra Large)