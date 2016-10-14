Abaixo esta os passos para criação do banco. O banco utilizado por mim foi o MySql.

#create database <dbname>;

#use <dbname>;

#create table clientes(id integer not null auto_increment,nome varchar(50) not null,primary key (id));

#insert into clientes (nome) values ('Pelé');

#insert into clientes (nome) values ('Maradona');

#commit;

#select * from clientes;