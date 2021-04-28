-- Atividade 5

create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint(5) auto_increment,
    categoria varchar(255) not null,
    ativo boolean,
    primary key(id)
);

create table tb_produtos(
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    preco decimal(5,2),
    qtdEstoque bigint(5),
    categoria_id bigint(5),
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria (categoria, ativo) values
('material de construcao', true),
('acabamento', true),
('materias de protecao', true),
('hidraulica', true),
('eletrica', true);

insert into tb_produtos (nome, preco, qtdEstoque, categoria_id) values
('azulejo', 30.00, 1500, 2),
('capacete de protecao', 45.50, 50, 3),
('cimento', 30.00, 150, 1),
('cano PVC', 5.00, 50, 4),
('pia', 300.00, 30, 2),
('luva de protecao', 20.00, 30, 3),
('fiacao eletrica', 35.00, 30, 5),
('tijolo', 15.00, 200, 1);

select nome, preco from tb_produtos where preco > 50;

select nome, preco from tb_produtos where preco between 3 and 60;

select nome from tb_produtos where nome like('%c%');

select tb_produtos.nome, tb_produtos.preco, tb_produtos.qtdEstoque, tb_categoria.categoria, tb_categoria.ativo from tb_produtos
join tb_categoria on tb_produtos.categoria_id = tb_categoria.id;

select tb_produtos.nome, tb_categoria.categoria from tb_produtos
join tb_categoria on tb_produtos.categoria_id = tb_categoria.id
where tb_produtos.id = 4;