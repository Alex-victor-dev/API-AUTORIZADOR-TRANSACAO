package br.com.autorizador.cartaotransacao.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.autorizador.cartaotransacao.cliente.application.repository.ClienteRepository;
import br.com.autorizador.cartaotransacao.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteInfraJpaRepository clienteInfraJpaRepository;

	@Override
	public Cliente salvaCliente(Cliente cliente) {
		log.info("[Start] ClienteInfraRepository - salvaCliente");
		clienteInfraJpaRepository.save(cliente);
		log.info("[Finish] ClienteInfraRepository - salvaCliente");
		return cliente;
	}

}
