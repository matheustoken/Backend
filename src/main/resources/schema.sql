-- Criação da tabela ESTADO
--DROP TABLE tb_estado;
CREATE TABLE IF NOT EXISTS tb_estado (
    tb_estado_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tb_estado_sigla VARCHAR(2) NOT NULL,
    tb_estado_nome VARCHAR(25) NOT NULL
);

-- Criação da tabela CLIENTE
--DROP TABLE tb_cliente;
CREATE TABLE IF NOT EXISTS tb_cliente (
    tb_cliente_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tb_cliente_nome VARCHAR(100) NOT NULL,
    tb_cliente_cidade VARCHAR(80) NOT NULL,
    tb_estado_id BIGINT NOT NULL,
    tb_cliente_cep VARCHAR(9) NOT NULL,
    FOREIGN KEY (tb_estado_id) REFERENCES tb_estado(tb_estado_id)
);
