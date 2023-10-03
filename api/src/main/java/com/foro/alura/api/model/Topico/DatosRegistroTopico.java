package com.foro.alura.api.model.Topico;

import com.foro.alura.api.model.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosRegistroTopico(

                                    String titulo,
                                  String mensaje,
                                  LocalDateTime fecha,
                                  StatusTopico tipoTopico,
                                  Usuario actor,
                                  String curso) {
}
