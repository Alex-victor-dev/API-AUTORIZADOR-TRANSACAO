package br.com.autorizador.cartaotransacao.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.autorizador.cartaotransacao.cliente.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteInfraJpaRepository clienteInfraJpaRepository;

}
