
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