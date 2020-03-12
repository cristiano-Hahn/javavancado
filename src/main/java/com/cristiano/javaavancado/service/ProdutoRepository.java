package com.cristiano.javaavancado.service;

import com.cristiano.javaavancado.model.Pessoa;
import com.cristiano.javaavancado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
