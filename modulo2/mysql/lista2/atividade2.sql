-- Atividade 2
create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    categoria varchar(50),
    tipo varchar(50),
    primary key(id)
);

create table tb_pizza(
	id bigint auto_increment,
    sabor varchar (50) not null,
    preco decimal not null,
    ativo boolean,
    categoria_id bigint,
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria (categoria, tipo) values
('normal', 'salgada'),
('normal', 'doce'),
('especial', 'salgada'),
('especial', 'doce'),
('vegetaria', 'salgada');
select*from tb_categoria;

insert into tb_pizza (sabor, preco, ativo, categoria_id) values
('calabresa', 35.00, 1, 1),
('portuguesa', 45.00, 1, 1),
('brocolis', 40.00, 1, 5),
('prestigio', 55.00, 1, 4),
('camarao', 80.00, 1, 3),
('rucula co mtomate seco', 60.00, 1, 5),
('frango com catupiry', 38.00, 1, 1),
('banana', 42.00, 1, 2);

select sabor, preco from tb_pizza where preco > 45.00;

select sabor, preco from tb_pizza where preco between 29 and 60;

select sabor from tb_pizza where sabor like ('%c%');

select tb_pizza.sabor, tb_pizza.preco, tb_categoria.tipo from tb_pizza inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id;

select tb_pizza.sabor, tb_pizza.preco, tb_categoria.tipo from tb_pizza
inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id
where tb_categoria.tipo = 'doce';