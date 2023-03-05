CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    data_criacao DATETIME NOT NULL
);

CREATE TABLE cartao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(16) NOT NULL,
    cvv VARCHAR(4) NOT NULL,
    validade VARCHAR(5) NOT NULL,
    titular VARCHAR(100) NOT NULL,
    data_criacao DATETIME NOT NULL,
    cliente_id INT NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id) ON DELETE CASCADE
);

CREATE TABLE transacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    valor DECIMAL(10,2) NOT NULL,
    data_hora DATETIME NOT NULL,
    cartao_id INT NOT NULL,
    cliente_id INT NOT NULL,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (cartao_id) REFERENCES cartao(id) ON DELETE CASCADE,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id) ON DELETE CASCADE
);