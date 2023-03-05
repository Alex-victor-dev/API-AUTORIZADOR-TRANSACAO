package br.com.autorizador.cartaotransacao.cliente.application.api.request;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class ClienteRequest {

	@Column(nullable = false)
	@NotNull(message = "nome nao pode ser nulo")
	private String nome;

	@Email
	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	@Size(max = 4, min = 4, message = "A senha deve conter somente 4 digitos")
	private String senha;

}
