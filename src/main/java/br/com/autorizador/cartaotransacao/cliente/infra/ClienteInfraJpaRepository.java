package br.com.autorizador.cartaotransacao.cliente.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autorizador.cartaotransacao.cliente.domain.Cliente;

public interface ClienteInfraJpaRepository extends JpaRepository<Cliente, Integer> {

}
