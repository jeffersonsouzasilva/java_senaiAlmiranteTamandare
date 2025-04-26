-- criação do banco de dados --
create database dbempresa;

-- acessar o banco --
USE dbempresa;

-- criar tabela de usuario --
create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null,
perfil varchar(20) not null
);

-- criar a tabela de clientes --
create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(15) not null,
emailcli varchar(50)
);

-- criar a tabela de ordem de serviço --
create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key (idcli) references tbclientes(idcli)
);

-- inserir dados na tabela tbusuarios --
insert into tbusuarios (iduser, usuario, fone, login, senha, perfil)
values(1,'Administrador','9999-8888','admin','admin','admin');

insert into tbusuarios (iduser, usuario, fone, login, senha, perfil)
values(2,'Paulo Silva','9999-9999','paulosilva','123456','admin');

insert into tbusuarios (iduser, usuario, fone, login, senha, perfil)
values
(3,'Maria Silva','9999-7777','mariasilva','123456','user'),
(4,'Marcia Silva','9999-7775','marciasilva','123456','user');

select * from tbusuarios;

