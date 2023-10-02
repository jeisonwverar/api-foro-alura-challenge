package com.foro.alura.api.repository;

import com.foro.alura.api.model.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface TopicoRepository  extends JpaRepository<Topico,Long> {
    //get
    //post


    //put
    //delete
}
