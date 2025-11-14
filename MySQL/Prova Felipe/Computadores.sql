create database computador;

create table usuarios(
id int auto_increment primary key,
nome varchar(100)
);

create table computadores (
id int auto_increment primary key,
marca varchar (50),
modelo varchar (50),
processador varchar (50),
memoria_ram INT,
id_usuario INT,
foreign key (id_usuario)
references usuarios(id)
);

select modelo, processador 
from computadores;

select usuarios.nome,
computadores.modelo
FROM usuarios 
join computadores on usuarios.id = computadores.id_usuario;

select marca, modelo, memoria_ram
from computadores
where memoria_ram > 8;

select usuarios.nome
from usuarios 
join computadores on usuarios.id = computadores.id_usuario where computadores.marca = 'Dell';

select marca, count(*) as quantidade
from computadores group by marca;

select marca, count(*) as quantidade from computadores group by marca having count(*) < 3;

update computadores 
set processador = 'Intel Core i7'
where id = 2;

delete from computadores
where id = 6;



