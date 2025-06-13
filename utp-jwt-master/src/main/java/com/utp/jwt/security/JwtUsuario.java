package com.utp.jwt.security;

import lombok.Data;

@Data
public class JwtUsuario {

  private Integer id;

  private Integer rolId;

  private String correo;

}
