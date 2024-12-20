package com.coworking.sistema_reservas.repository;

import com.coworking.sistema_reservas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
