package com.cristiano.javaavancado.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

public abstract class BaseController<Repository extends JpaRepository, Entity> {

    @Autowired
    private Repository repository;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOne(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(repository.getOne(id));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Entity entity) {
        return ResponseEntity.ok(repository.save(entity));
    }

    @PutMapping("/{id}")
    @SneakyThrows
    public ResponseEntity<?> update(@RequestBody Entity entity, @PathVariable("id") Integer id) {
        Method method = entity.getClass().getDeclaredMethod("setId", Integer.class);
        method.invoke(entity, id);
        return ResponseEntity.ok(repository.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
