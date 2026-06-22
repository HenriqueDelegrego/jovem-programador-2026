
-- Listar a marca e o modelo de todos os carros
SELECT marca.nome_marca, modelo.nome_modelo
FROM marca
JOIN modelo
ON marca.id = modelo.marca_id;

-- Listar as informações do(s) veículo(s)
-- que apresenta(m) ano de fabricação diferente do ano modelo
SELECT veiculo.id, marca.nome_marca, modelo.nome_modelo
FROM veiculo
JOIN modelo
ON veiculo.modelo_id = modelo.id
JOIN marca
ON marca.id = modelo.marca_id
WHERE veiculo.ano_fabricacao <> ano_modelo;