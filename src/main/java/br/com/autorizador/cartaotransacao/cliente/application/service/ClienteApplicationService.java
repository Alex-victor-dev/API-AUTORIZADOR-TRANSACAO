package br.com.autorizador.cartaotransacao.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.autorizador.cartaotransacao.cliente.application.api.request.ClienteRequest;
import br.com.autorizador.cartaotransacao.cliente.application.api.response.ClienteResponse;
import br.com.autorizador.cartaotransacao.cliente.application.repository.ClienteRepository;
import br.com.autorizador.cartaotransacao.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse cadastraCliente(ClienteRequest clienteRequest) {
		log.info("[Start] ClienteApplicationService - cadastraCliente");
		Cliente cliente = clienteRepository.salvaCliente(new Cliente(clienteRequest));
		log.info("[finish] ClienteApplicationService - cadastraCliente");
		return ClienteResponse.builder().id(cliente.getId()).build();
	}

}
