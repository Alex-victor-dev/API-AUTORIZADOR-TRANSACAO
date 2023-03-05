package br.com.autorizador.cartaotransacao.cliente.application.service;

import br.com.autorizador.cartaotransacao.cliente.application.api.request.ClienteRequest;
import br.com.autorizador.cartaotransacao.cliente.application.api.response.ClienteResponse;

public interface ClienteService {

	ClienteResponse cadastraCliente(ClienteRequest clienteRequest);

}
