package com.cristiano.javaavancado.controller;

import com.cristiano.javaavancado.model.Produto;
import com.cristiano.javaavancado.service.ProdutoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController extends BaseController<ProdutoRepository, Produto> {

}
