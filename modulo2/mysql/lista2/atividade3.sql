-- Atividade 3

create database if not exists db_farmacia_do_bem;
use db_farmacia_do_bem;

create table if not exists tb_categoria(
	id bigint auto_increment not null,
    tipo varchar(255) not null,
    subtipo varchar(255),
    primary key(id)
);

create table if not exists tb_produtos(
	id bigint auto_increment not null,
    nome varchar(255),
    preco decimal,
    qtdEstoque int,
    categoria_id bigint,
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(tipo, subtipo) values
('medicamento', 'generico'),
('medicamento', 'controlado'),
('medicamento', 'padrao'),
('cosmetico', 'higiene pessoal'),
('cosmetico', 'outros');

insert into tb_produtos(nome, preco, qtdEstoque, categoria_id) values
('controle de pressao', 150.75, 50, 2),
('analgesico', 10.15, 150, 3),
('anti-inflamtorio', 8.55, 80, 1),
('shampoo', 12.00, 35, 4),
('antibiotico', 250.89, 20, 3),
('escova de cabelo', 20.00, 10, 5),
('antialergico', 89.99, 60, 3),
('sabonete', 1.20, 100, 4);

select nome, preco from tb_produtos where preco > 50;

select nome, preco from tb_produtos where preco between 3 and 60;

select nome from tb_produtos where nome like('%b%');

select tb_produtos.nome, tb_produtos.preco, tb_categoria.tipo, tb_categoria.subtipo from tb_produtos join tb_categoria on tb_produtos.categoria_id = tb_categoria.id;

select tb_produtos.nome, tb_produtos.preco, tb_categoria.tipo, tb_categoria.subtipo from tb_produtos
join tb_categoria on tb_produtos.categoria_id = tb_categoria.id
where tb_categoria.tipo = 'cosmetico';