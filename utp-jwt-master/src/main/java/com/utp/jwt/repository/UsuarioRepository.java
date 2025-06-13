package com.utp.jwt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.utp.jwt.http.dto.user.UserListDto;
import com.utp.jwt.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

  @Query(value = """
    SELECT
      u.id,
      u.id_rol,
      u.correo,
      u.nombre
    FROM usuarios AS u
  """, nativeQuery = true)
  public List<UserListDto> listAll();

  public Optional<Usuario> findByCorreo(String correo);

}
