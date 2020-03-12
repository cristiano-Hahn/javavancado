package com.cristiano.javaavancado.controller;

import com.cristiano.javaavancado.model.Pessoa;
import com.cristiano.javaavancado.service.PessoaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController extends BaseController<PessoaRepository, Pessoa> {

}
