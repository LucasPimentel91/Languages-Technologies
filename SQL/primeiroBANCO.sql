-- Comentário no SQL
-- Exemplo 1. Selecionando todas as linhas e colunas da:
-- a) tabela pedidos
SELECT * FROM pedidos;

-- b) tabela clientes
SELECT * FROM clientes;


-- Exemplo 2. Selecionar apenas algumas colunas da tabela de clientes:
SELECT 
	ID_Cliente AS "ID Cliente", 
    Nome AS "Nome do Cliente", 
    Data_Nascimento AS "Data de Nascimento", 
    Email AS "Email do Cliente"
FROM clientes;


-- Exemplo 3. Selecionar apenas as 5 primeiras linhas da tabela produtos:
SELECT * FROM produtos
LIMIT 8;

-- Exemplo 4. Selecionar todas as linhas da tabela produtos, mas ordenando.
SELECT * FROM  produtos
ORDER BY Preco_Unit;

SELECT * FROM produtos
ORDER BY Preco_Unit DESC;

-- Exemplo 5. Criando filtros:
SELECT *
FROM produtos
WHERE Preco_UNIT >= 1800;

SELECT *
FROM produtos
WHERE Marca_Produto = 'DELL';

SELECT *
FROM pedidos
WHERE Data_Venda = '2019-01-03';

SELECT *
FROM clientes
WHERE Estado_Civil = 'S' AND Sexo = 'M';

-- FUNÇÕES DO SQL
SELECT 
	COUNT(Nome) 
FROM clientes;

SELECT 
	COUNT(DISTINCT Escolaridade) 
FROM clientes;

SELECT 
	COUNT(Nome) 
FROM clientes;

SELECT 
	SUM(Receita_Venda) AS 'Soma de Receitas', 
    AVG(Receita_Venda) AS 'Média de Receita',
    MIN(Receita_Venda) AS 'Menor Receita',
    MAX(Receita_Venda) AS 'Maior Receita'
    FROM pedidos;