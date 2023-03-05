package br.com.autorizador.cartaotransacao.transacao.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autorizador.cartaotransacao.transacao.domain.entities.Transacao;

public interface TransacaoInfraJpaRepository extends JpaRepository<Transacao, Integer> {

}
