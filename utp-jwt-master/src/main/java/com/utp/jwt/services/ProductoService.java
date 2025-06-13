package com.utp.jwt.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.utp.jwt.http.dto.product.ListProductoDto;
import com.utp.jwt.http.dto.product.StoreProductDTO;
import com.utp.jwt.model.Producto;

public interface ProductoService {

  public Page<ListProductoDto> listAll(String nombre, PageRequest pageReq);

  public Optional<Producto> findById(Integer id);

  public Producto guardar(StoreProductDTO productoData);

  public Producto editar(Producto producto);

  public void eliminar(Producto producto);

}
