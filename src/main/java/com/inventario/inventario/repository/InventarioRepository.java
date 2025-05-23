package com.inventario.inventario.repository;

import com.Microservicio-Inventario.cl.Microservicio-Inventario.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}
