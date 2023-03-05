package br.com.autorizador.cartaotransacao.cartao.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.autorizador.cartaotransacao.cliente.domain.Cliente;
import br.com.autorizador.cartaotransacao.transacao.domain.entities.Transacao;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String numero;

	@Column(nullable = false)
	private String cvv;

	@Column(nullable = false)
	private String validade;

	@Column(nullable = false)
	private String titular;

	@Column(nullable = false)
	private LocalDateTime dataCriacao;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	@OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Transacao> transacoes;
}