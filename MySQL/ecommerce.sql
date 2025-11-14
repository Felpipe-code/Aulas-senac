	-- 1. Crie um banco de dados chamado "ecommerce" com suporte a caracteres
-- acentuados.
    
    create database ecommerce 
    default character set utf8mb4
    default collate utf8mb4_general_ci;
    
    -- 2. Crie uma tabela "produtos" com as colunas: id (chave primária com auto
-- incremento), nome e preco.

    use ecommerce;
    create table produtos(
    id int auto_increment,
    nome varchar (100),
    preco decimal (10,2),
    primary key (id)
    )default charset = utf8mb4;
    
    -- 3. Adicione uma coluna "descricao" à tabela "produtos" após a coluna "nome
    
    alter table produtos add descricao text after nome;
    insert into produtos (nome, descricao, preco) values 
    ('camiseta' , 'camiseta de algodao tamanho m',29.90);
    
    -- 4. Insira um produto na tabela "produtos" com os seguintes dados: nome =
-- "Camiseta", descricao = "Camiseta de algodão, tamanho M", preco = 29.90.

    desc produtos;
    select*from produtos;
    
    -- 5. Remova a coluna "descricao" da tabela "produtos".
    
    alter table produtos
    drop column descricao;
    
    -- 6  Crie uma tabela "clientes" com as colunas: id (chave primária com auto
--  incremento) e nome. 
    create table clientes (
    id int auto_increment,
    nome varchar (100),
    primary key (id)
    )default charset = utf8mb4;
    
    -- 7. Adicione as colunas "email" e "telefone" à tabela "clientes", sendo "email" a
--      primeira coluna e "telefone" após o "nome".--

	alter table clientes add email varchar(100) first;
    alter table clientes add telefone bigint after nome;

   
    
    
    
    
    
    
    