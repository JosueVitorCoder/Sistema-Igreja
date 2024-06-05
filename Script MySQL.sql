create database IADSN 
default character set utf8mb4
default collate utf8mb4_general_ci; 

use iadsn;

create table membros(
id int not null auto_increment primary key,
nome varchar(255) not null,
data_nascimento date,
cpf varchar(14),
endereco varchar(255),
numero varchar (20),
sexo varchar(100),
cargo varchar(100),
status_civil varchar(155),
foto longblob,
arquivado boolean
);

create table dizimos(
id int not null auto_increment primary key,
data_entrada date,
ano_data int,
mes_data int,
valor double,
membro_id int,
constraint fk_membro foreign key (membro_id) references membros(id)
);

create table ofertas(
id int not null auto_increment primary key,
valor double,
data_oferta date,
ano_data int,
mes_data int
);

select * from membros;
select * from dizimos;
select * from ofertas;