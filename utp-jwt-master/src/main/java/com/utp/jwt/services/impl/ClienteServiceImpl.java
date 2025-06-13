package com.utp.jwt.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.utp.jwt.http.dto.cliente.ListClienteDto;
import com.utp.jwt.repository.ClienteRepository;
import com.utp.jwt.services.ClienteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

  private final ClienteRepository clienteRepository;

  public Page<ListClienteDto> listCliente(String busqueda, Pageable page) {
    return this.clienteRepository.listCliente(busqueda, page);
  }

}
