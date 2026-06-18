-- Exercício escola

-- Criação de tabelas

-- Criação da tabela Area
CREATE TABLE area (
id INT AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY(id)
);

-- Criação da tabela Professor
CREATE TABLE professor (
id INT AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
area_id INT,
PRIMARY KEY(id),
FOREIGN KEY (area_id)
REFERENCES area(id)
);

-- Criação da tabela Aluno
CREATE TABLE aluno (
id INT AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
data_nascimento DATE NOT NULL,
media DECIMAL(10,2),
professor_id INT,
PRIMARY KEY(id),
FOREIGN KEY(professor_id)
REFERENCES professor(id)
);


-- Inserção de linhas

-- Inserção de áreas
INSERT INTO area(nome)
VALUES
('Matemática'),
('Física'),
('Ciências'),
('Línguas'),
('Desenvolvimento de sistemas');

-- Inserção de professores
INSERT INTO professor(nome, area_id)
VALUES
('Carlos', 1),
('Maria', 2),
('João', 3),
('Henrique', 5);

-- Inserção de alunos
INSERT INTO aluno(nome, data_nascimento, media, professor_id)
VALUES
('Carlos', '2000-01-20', 8.7, 1),
('Joana', '1998-06-14', 9.2, 2);


-- Pesquisas

-- Listar todas as informações dos alunos
SELECT *
FROM aluno;

-- Liste o nome e a média dos alunos que possuem média maior ou igual a 7. Ordene da maior para menor média
SELECT nome, media
FROM aluno
WHERE media >= 7
ORDER BY media DESC;

-- Exiba os nomes dos professores que pertencem à área com código 2
SELECT nome
FROM professor
WHERE id = 2;

-- Mostre o nome dos alunos e suas datas de nascimento, apenas daqueles que nasceram depois de 1º de janeiro de 2002
SELECT nome, data_nascimento
FROM aluno
WHERE data_nascimento >= '2002-01-01';

-- Mostre os alunos cujo professor tem o código 1
SELECT *
FROM aluno
WHERE professor_id = 1;

-- Seleção entre múltiplas tabelas
SELECT professor.nome Nome, area.nome Área
FROM professor
JOIN area
ON professor.area_id = area.id;