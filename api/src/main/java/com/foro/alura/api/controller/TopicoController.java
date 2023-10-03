package com.foro.alura.api.controller;

import com.foro.alura.api.model.Topico.Topico;
import com.foro.alura.api.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")

public class TopicoController {

    @Autowired
    TopicoRepository repository;

    @GetMapping
    public List<Topico> leer(){
        return  repository.findAll();
    }

    @PostMapping
    public void registrarMedico( @RequestBody String datos){
        System.out.println("Request llega correctamente");
        System.out.println(datos);
    }



}
