INSERT INTO tb_estado (tb_estado_id, tb_estado_sigla,tb_estado_nome)  VALUES (1,'SP','São Paulo');
INSERT INTO tb_estado (tb_estado_id, tb_estado_sigla,tb_estado_nome)  VALUES (2,'RJ','Rio de Janeiro');
INSERT INTO tb_estado (tb_estado_id, tb_estado_sigla,tb_estado_nome)  VALUES (3,'MG','Minas Gerais');
INSERT INTO tb_estado (tb_estado_id, tb_estado_sigla,tb_estado_nome)  VALUES (4,'AC','Acre');

INSERT INTO tb_cliente (tb_cliente_nome,tb_cliente_cidade,tb_cliente_cep,estado_id) VALUES ('Caetano Veloso','São Paulo','04437-100',1);
INSERT INTO tb_cliente (tb_cliente_nome,tb_cliente_cidade,tb_cliente_cep,estado_id) VALUES ('Neymar Jr','Rio de Janeiro','04337-100',2);
INSERT INTO tb_cliente (tb_cliente_nome,tb_cliente_cidade,tb_cliente_cep,estado_id) VALUES ('Ivete Sangalo','São Paulo','04436-110',1);
INSERT INTO tb_cliente (tb_cliente_nome,tb_cliente_cidade,tb_cliente_cep,estado_id) VALUES ('Gisele Bündchen','Rio de Janeiro','04436-110',2);
