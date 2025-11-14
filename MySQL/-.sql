
-- 1 
select * from antiquario;
-- 2
select id from antiquario
-- 3
order by id desc;
-- 4
select categoria from antiquario;
-- 5
SELECT * FROM ANTIQUARIO
WHERE ANO <= 2016;
-- 6
SELECT * FROM ANTIQUARIO 
WHERE QUANTIDADE > 20 AND ANO > 1960;
-- 7
select * from antiquario
where ano between 1980 and 1990;
-- 8
select * from antiquario
where quantidade > 10 and ano < 1990 or quantidade > 20;
-- 9 
select * from antiquario
where ano 
in (1960, 1980);
-- 11
select * from antiquario
where categoria like 'Maria';
-- 12
select * from antiquario;
update antiquario 
set tipo = 'email'
where id '1'; clientesservicos;
-- 13
select distinct quantidade from antiquario;
-- 14
select count(*) from antiquario;
-- 15
SELECT MAX(QUANTIDADE) FROM antiquario;

SELECT MIN(QUANTIDADE) FROM antiquario;

select avg(ano) from antiquario;

