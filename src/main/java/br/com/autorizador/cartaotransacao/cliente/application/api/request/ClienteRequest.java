package br.com.autorizador.cartaotransacao.cliente.application.api.request;

import lombok.Value;

@Value
public class ClienteRequest {

	private String nome;

	private String email;

	private String senha;

}
