package com.foro.alura.api.repository;

import com.foro.alura.api.model.Topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository  extends JpaRepository<Topico,Long> {
    //get
    //post


    //put
    //delete
}
