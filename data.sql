
INSERT INTO cliente (idCliente, nome, cpf, sexo, dataDoCadastro)
VALUES ('60a62816-6e9e-4f2f-8b13-95d6a563b6c7', 'João Silva', '123.456.789-10', 'MASCULINO', '2022-03-04 10:00:00');

INSERT INTO cliente (id_cliente, nome, cpf, sexo, data_do_cadastro)
VALUES ('1f5da5e5-b8a5-4a7f-a499-99d81b25f40a', 'João', '11111111111', 'MASCULINO', '2022-03-03T10:00:00');

INSERT INTO cartao (idCartao, numero, cliente_idCliente)
VALUES ('9815c61e-3e33-4aa7-b67a-f06eb76d4b9c', '1111222233334444', '60a62816-6e9e-4f2f-8b13-95d6a563b6c7');

INSERT INTO transacao (id_transacao, valor, data_hora, cartao_id_cartao) 
VALUES ('3fa85f64-5717-4562-b3fc-2c963f66afa6', 100.00, '2022-03-03T14:30:00', '9815c61e-3e33-4aa7-b67a-f06eb76d4b9c');

INSERT INTO transacao (id_transacao, valor, data_hora, cartao_id_cartao) 
VALUES ('3fa85f64-5717-4562-b3fc-2c963f66afa7', 200.00, '2022-03-04T10:45:00', '9815c61e-3e33-4aa7-b67a-f06eb76d4b9c');

INSERT INTO transacao (id_transacao, valor, data_hora, cartao_id_cartao) 
VALUES ('3fa85f64-5717-4562-b3fc-2c963f66afa8', 50.00, '2022-03-05T08:15:00', '9815c61e-3e33-4aa7-b67a-f06eb76d4b9c');