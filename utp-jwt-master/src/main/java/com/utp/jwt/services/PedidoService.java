package com.utp.jwt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.utp.jwt.http.dto.pedido.ListDetallePedidoDto;
import com.utp.jwt.http.dto.pedido.ListPedidoAdmin;
import com.utp.jwt.http.dto.pedido.ListPedidoCliente;
import com.utp.jwt.http.dto.pedido.StorePedidoDto;
import com.utp.jwt.model.Pedido;
import com.utp.jwt.security.JwtUsuario;

public interface PedidoService {

  public Optional<Pedido> findById(Integer id);

  public Page<ListPedidoAdmin> listProductoAdmin(PageRequest pageReq);

  public Page<ListPedidoCliente> listProductoCustomer(Integer usuarioId, PageRequest pageReq);

  public void guardarPedido(StorePedidoDto pedidoData, JwtUsuario jwtUsuario);

  public List<ListDetallePedidoDto> listPedidoDetalles(Integer pedidoId);

  public void actualizar(Pedido pedido);

}
