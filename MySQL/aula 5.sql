SELECT * FROM antiquario
ORDER BY categoria desc;

-- WHERE
SELECT * FROM antiquario
WHERE condição;

SELECT * FROM ANTIQUARIO
WHERE ANO > 1985;

select * from antiquario;
SELECT categoria,quantidade FROM antiquario;


-- and & or
select * from antiquario
where quantidade > 10 and ano < 1990;

-- between
select * from antiquario
where ano between 1980 and 1990;

-- in
select * from antiquario
where ano 
in (1960, 1980);

-- like 
select * from antiquario 
where categoria like '%a';

-- like com wildcard
select * from antiquario
where categoria like '%ica';

-- distinct (distinguir)
select distinct quantidade from antiquario;

-- funções de agregação 
-- count - Contagem registros na tabela
select count(*) from antiquario;

-- MAX: Valor máximo em uma determinada coluna 
SELECT MAX(QUANTIDADE) FROM antiquario;

-- min: valor minimo
SELECT MIN(QUANTIDADE) FROM antiquario;

-- AVG: média dos valores de um campo numérico
select avg(ano) from antiquario;

-- AGRUPAMENTO
select categoria, quantidade from antiquario
group by categoria,quantidade;

select categoria, sum(quantidade) from antiquario 
group by categoria,quantidade; 

-- GROUP BY COM HAVING
SELECT categoria. AVF(quantidade)
FROM antiquario GROUP BY categoria
HAVING AVG(quantidade) <= 40;


