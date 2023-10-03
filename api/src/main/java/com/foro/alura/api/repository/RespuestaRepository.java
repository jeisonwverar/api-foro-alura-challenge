package com.foro.alura.api.repository;

import com.foro.alura.api.model.respuesta.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta,Long> {

}
