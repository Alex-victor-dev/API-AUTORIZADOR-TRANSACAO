package br.com.autorizador.cartaotransacao.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.autorizador.cartaotransacao.cliente.application.api.request.ClienteRequest;
import br.com.autorizador.cartaotransacao.cliente.application.api.response.ClienteResponse;
import br.com.autorizador.cartaotransacao.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;
	
	@Override
	public ClienteResponse cadastraCliente(ClienteRequest clienteRequest) {
		log.info("[Inicia] ClienteController - cadastraCliente");
		ClienteResponse cliente = clienteService.cadastraCliente(clienteRequest);
		log.info("[Finaliza] ClienteController - cadastraCliente");
		return cliente;
	}

}
