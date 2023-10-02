package com.foro.alura.api.repository;

import com.foro.alura.api.model.Respuesta;
import com.foro.alura.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta,Long> {

}
