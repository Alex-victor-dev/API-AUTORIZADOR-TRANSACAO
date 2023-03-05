package br.com.autorizador.cartaotransacao.cliente.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import br.com.autorizador.cartaotransacao.cartao.domain.Cartao;
import br.com.autorizador.cartaotransacao.cliente.application.api.request.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "cliente")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Email
	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	@Size(max = 4, min = 4, message = "A senha deve conter somente 4 digitos")
	private String senha;

	@Column(nullable = false)
	private LocalDateTime dataCriacao;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cartao> cartoes;

	public Cliente(@Valid ClienteRequest clienteRequest) {
		this.nome = clienteRequest.getNome();
		this.email = clienteRequest.getEmail();
		this.senha = clienteRequest.getSenha();
		this.dataCriacao = LocalDateTime.now();

	}
}
