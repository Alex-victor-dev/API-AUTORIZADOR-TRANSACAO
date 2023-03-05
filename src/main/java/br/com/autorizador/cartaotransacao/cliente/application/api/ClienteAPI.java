package br.com.autorizador.cartaotransacao.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.autorizador.cartaotransacao.cliente.application.api.request.ClienteRequest;
import br.com.autorizador.cartaotransacao.cliente.application.api.response.ClienteResponse;

@RestController
@RequestMapping("v1/cliente")
public interface ClienteAPI {

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	ClienteResponse cadastraCliente(@RequestBody ClienteRequest clienteRequest);

}
