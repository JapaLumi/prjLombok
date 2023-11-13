package com.lumi.Lombok.prjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lumi.Lombok.prjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
