create database empresa;

create table departamentos  (
id int auto_increment primary key, nome varchar(100)
);

create table funcionarios (
id int auto_increment primary key, nome varchar(100),

cargo varchar(100),
salario decimal(10,2),
data_admissao date,
id_departamento int,
foreign key (id_departamento)
references departamentos (id)
);

select nome from funcionarios;

select funcionarios.nome,
funcionarios.cargo
from funcionarios
join departamentos on 
funcionarios.id_departamento =
departamentos.id
where departamentos.nome = 
'vendas';

select departamentos.nome,
count(funcionarios.id) as total
from departamentos 
left join funcionarios
on departamentos.id =
funcionarios.id_departamento 
group by departamentos.id;

select funcionarios.nome, 
departamentos.nome
from funcionarios
join departamentos on 
funcionarios.id_departamento = 
departamentos.id;

select nome from funcionarios 
where salario > 5000;

select funcionarios.nome 
from funcionarios
join departamentos on 
funcionarios.id_departamento =
departamentos.id 
where departamentos.nome in ('TI', 'Marketing');

select nome from funcionarios where data_admissao between '2020-01-01' and '2022-12-31';

select nome from funcionarios
where nome like 'M%';

select distinct cargo 
from funcionarios;

select avg(salario) as media_salarial from funcionarios;

select nome, salario from funcionarios order by salario DESC LIMIT 1;

select id_departamento, count(*) as total from funcionarios group by id_departamento;

select id_departamento, count(*) as total from funcionarios group by id_departamento 
having count(*) >10;

update funcionarios 
set cargo = 'Analista de Sistemas'
where id = 5;

delete from funcionarios where id = 10;








