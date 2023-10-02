package com.foro.alura.api.controller;

import com.foro.alura.api.repository.RespuestaRepository;
import com.foro.alura.api.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    private RespuestaRepository repository;


}
