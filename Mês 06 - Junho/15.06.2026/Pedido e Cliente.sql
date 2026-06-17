
-- Criação da tabela Cliente
CREATE TABLE cliente (
id INT,
nome VARCHAR(50),
email VARCHAR(50),
senha VARCHAR(50),
data_nascimento DATE,
cpf CHAR(11),
PRIMARY KEY(id)
);

-- Criação da tabela Pedido
CREATE TABLE pedido (
id INT,
data_pedido DATE,
preco DECIMAL(10,2),
id_cliente INT,
PRIMARY KEY(id),
FOREIGN KEY(id_cliente)
REFERENCES cliente(id)
);


INSERT INTO cliente (id, nome, email, senha, data_nascimento, cpf)
VALUES (1, 'Henrique', 'henrique@email.com', 'senha', '2001-10-11', '11111111111');


INSERT INTO pedido (id, data_pedido, preco, id_cliente)
VALUES (1, '2026-06-16', 100.25, 1);