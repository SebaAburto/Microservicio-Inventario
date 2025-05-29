package com.inventario.inventario.controller;

import com.inventario.inventario.model.Tipo_talla;
import com.inventario.inventario.Service.Tipo_tallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tipo-talla")
public class Tipo_tallaController {

    @Autowired
    private Tipo_tallaService Tipo_tallaService;

    @GetMapping
    public ResponseEntity<List<Tipo_talla>> listar() {
        List<Tipo_talla> lista = Tipo_tallaService.findAll();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<Tipo_talla> guardar(@RequestBody Tipo_talla tipoTalla) {
        Tipo_talla nuevo = Tipo_tallaService.save(tipoTalla);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipo_talla> buscar(@PathVariable Long id) {
        try {
            Tipo_talla tipoTalla = Tipo_tallaService.findById(id);
            return ResponseEntity.ok(tipoTalla);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tipo_talla> actualizar(@PathVariable Long id, @RequestBody Tipo_talla tipoTalla) {
        try {
            Tipo_talla existente = Tipo_tallaService.findById(id);
            existente.setTipo_talla_id(tipoTalla.getTipo_talla_id());
            existente.setProducto(tipoTalla.getProducto());

            return ResponseEntity.ok(Tipo_tallaService.save(existente));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        try {
            Tipo_tallaService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}