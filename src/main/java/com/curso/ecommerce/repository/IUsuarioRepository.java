package com.curso.ecommerce.repository;

import com.curso.ecommerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
