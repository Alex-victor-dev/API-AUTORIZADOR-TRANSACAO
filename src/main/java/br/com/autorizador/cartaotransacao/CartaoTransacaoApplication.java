package br.com.autorizador.cartaotransacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
public class CartaoTransacaoApplication {

	@GetMapping
	public String homeCartao() {
		return "Bem vindo ao Autorizador De Transacao";
	}

	public static void main(String[] args) {
		SpringApplication.run(CartaoTransacaoApplication.class, args);
	}

}
