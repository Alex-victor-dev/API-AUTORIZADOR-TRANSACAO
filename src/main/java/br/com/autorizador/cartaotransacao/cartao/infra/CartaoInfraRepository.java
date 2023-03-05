package br.com.autorizador.cartaotransacao.cartao.infra;

import org.springframework.stereotype.Repository;

import br.com.autorizador.cartaotransacao.cartao.application.repository.CartaoRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CartaoInfraRepository implements CartaoRepository {
	
	private final CartaoInfraJpaRepository cartaoInfraJpaRepository;

}
