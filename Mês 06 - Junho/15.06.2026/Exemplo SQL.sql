
-- Criação da tabela de produtos
CREATE TABLE produto (
id INT,
nome VARCHAR(50),
categoria VARCHAR(50),
preco DECIMAL(10,2),
qt_estoque INT
);
 
-- Criação da tabela de funcionários
-- Curiosidade, a tabela será criada apenas se ainda não existir
CREATE TABLE IF NOT EXISTS funcionario (
id INT,
nome VARCHAR(50),
cpf CHAR(11),
salario DECIMAL(10,2)
);