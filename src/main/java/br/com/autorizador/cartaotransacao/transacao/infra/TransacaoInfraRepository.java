package br.com.autorizador.cartaotransacao.transacao.infra;

import org.springframework.stereotype.Repository;

import br.com.autorizador.cartaotransacao.transacao.application.repository.TransacaoRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TransacaoInfraRepository implements TransacaoRepository {

	private final TransacaoInfraJpaRepository transacaoInfraJpaRepository;

}
