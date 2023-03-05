INSERT INTO cliente (nome, email, senha, data_criacao) VALUES ('João da Silva', 'joao.silva@gmail.com', '123456', '2022-03-07 10:00:00');

INSERT INTO cliente (nome, email, senha, data_criacao) VALUES ('Maria Souza', 'maria.souza@gmail.com', '654321', '2022-03-08 14:30:00');

INSERT INTO cartao (numero, cvv, validade, titular, data_criacao, cliente_id) VALUES ('1234567890123456', '123', '12/24', 'João da Silva', '2022-03-07 10:05:00', 1);

INSERT INTO cartao (numero, cvv, validade, titular, data_criacao, cliente_id) VALUES ('9876543210987654', '321', '06/23', 'Maria Souza', '2022-03-08 14:35:00', 2);

INSERT INTO transacao (valor, data_hora, cartao_id, cliente_id, status) VALUES (50.00, '2022-03-07 10:10:00', 1, 1, 'APROVADA');

INSERT INTO transacao (valor, data_hora, cartao_id, cliente_id, status) VALUES (100.00, '2022-03-08 14:40:00', 2, 2, 'PENDENTE');