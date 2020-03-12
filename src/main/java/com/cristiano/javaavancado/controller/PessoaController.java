package com.cristiano.javaavancado.controller;

import com.cristiano.javaavancado.model.Pessoa;
import com.cristiano.javaavancado.service.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(pessoaRepository.findAll());
    }

    @GetMapping("/pessoas/{id}")
    public ResponseEntity<?> findOne(@PathVariable("id") Integer id){
        return ResponseEntity.ok(pessoaRepository.getOne(id));
    }

    @PostMapping("/pessoas")
    public ResponseEntity<?> create(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok(pessoaRepository.save(pessoa));
    }

    @PutMapping("/pessoas/{id}")
    public ResponseEntity<?> update(@RequestBody Pessoa pessoa, @PathVariable("id") Integer id){
        pessoa.setId(id);
        return ResponseEntity.ok(pessoaRepository.save(pessoa));
    }

    @DeleteMapping("/pessoas/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        pessoaRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
