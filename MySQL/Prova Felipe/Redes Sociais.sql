create database RedesSociais;

create table usuarios (
id int auto_increment primary key,
nome varchar(100),
email varchar(100)
);

create table posts (
id int auto_increment primary key,
conteudo text,
data_publicado date, 
id_usuario int, 
foreign key (id_usuario)
references usuarios (id)
);

create table comentarios (
id int auto_increment primary key,
conteudo text,
data_comentario date, 
id_post int,
id_usuario int, 
foreign key (id_post) references posts (id),
foreign key (id_usuario)
references usuarios (id)
);

select nome, email from usuarios;

select conteudo, data_publicado
from posts;

select usuarios.nome, posts.conteudo
from usuarios
join posts on usuarios.id =
posts.id_usuario;

select posts.conteudo,
comentarios.conteudo
from posts 
left join comentarios on posts.id = comentarios.id_post;

select conteudo from posts
where data_publicado > '2023-01-01';

select conteudo from comentarios
where id_usuario = 3;

select id_usuario, count(*) as total_posts
from posts
group by id_usuario;

select id_usuario, count(*) as total_comentarios
from comentarios 
group by id_usuario 
having count(*) >5;

update posts 
set conteudo = 'novo conteúdo'
where id= 10;

delete from comentarios
where id_post = 5;

delete from comentarios where id_usuario = 4;

delete from comentarios 
where id_post in (select id from posts where id_usuario = 4);

delete from posts where id_usuario = 4;

delete from usuarios where id = 4;



