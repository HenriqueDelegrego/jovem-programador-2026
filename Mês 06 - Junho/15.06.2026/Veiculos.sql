
-- Criação tabela Marca
CREATE TABLE marca (
id INT,
nome_marca VARCHAR(50),
PRIMARY KEY(id)
);

-- Criação tabela Proprietario
CREATE TABLE proprietario (
id INT,
nome VARCHAR(50),
telefone VARCHAR(11),
email VARCHAR(50),
PRIMARY KEY(id)
);

-- Criação tabela Cor
CREATE TABLE cor (
id INT,
nome_cor VARCHAR(50),
PRIMARY KEY(id)
);

-- Criação tabela Combustivel
CREATE TABLE combustivel (
id INT, 
nome_combustivel VARCHAR(50),
PRIMARY KEY(id)
);

-- Criação tabela Modelo
CREATE TABLE modelo (
id INT,
nome_modelo VARCHAR(50),
marca_id INT,
PRIMARY KEY(id),
FOREIGN KEY(marca_id)
REFERENCES marca(id)
);


-- Criação tabela Veiculo
CREATE TABLE veiculo (
id INT,
ano_fabricacao INT,
ano_modelo INT,
quilometragem INT,
portas INT,
proprietario_id INT,
cor_id INT,
modelo_id INT,
PRIMARY KEY(id),
FOREIGN KEY(proprietario_id)
REFERENCES proprietario(id),
FOREIGN KEY(cor_id)
REFERENCES cor(id),
FOREIGN KEY(modelo_id)
REFERENCES modelo(id)
);


-- Criação tabela Veiculo_Combustivel
CREATE TABLE veiculo_combustivel (
veiculo_id INT,
combustivel_id INT,
PRIMARY KEY(veiculo_id, combustivel_id),
FOREIGN KEY(veiculo_id)
REFERENCES veiculo(id),
FOREIGN KEY (combustivel_id)
REFERENCES combustivel(id)
);