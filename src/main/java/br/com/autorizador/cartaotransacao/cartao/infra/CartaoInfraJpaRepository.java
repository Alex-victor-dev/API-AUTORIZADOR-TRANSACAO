package br.com.autorizador.cartaotransacao.cartao.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autorizador.cartaotransacao.cartao.domain.Cartao;

public interface CartaoInfraJpaRepository extends JpaRepository<Cartao, Integer> {

}
