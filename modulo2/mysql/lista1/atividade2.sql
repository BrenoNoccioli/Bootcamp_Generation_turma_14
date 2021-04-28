-- Atividade 2

/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.*/
create database db_lojaWeb;
use db_lojaWeb;

/*Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.*/
create table tb_produtos(
	id bigint(150) auto_increment,
    nome varchar(150) not null,
    preco decimal (6,2),
    estoque int (6),
    descricao text(250),
    primary key(id)
)default charset = utf8;
desc tb_produtos;

/*Popule esta tabela com até 8 dados;*/
insert into tb_produtos values
(default, 'notebook', 5000.00, 10, 'Intel® Core™ i5-10300H (2.5 GHz até 4.5 GHz, cache de 8MB, quad-core, 10ª geração)'),
(default, 'fone sem fio', 200.00, 50, 'fone wireless handsfree'),
(default, 'mouse sem fio', 150.00, 100, 'mouse sem fio - conectividade bluetooth'),
(default, 'mousepad', 70.00, 100.00, 'mousepad 34 cm x 28 cm, customizável'),
(default, 'desktop gamer', 4650.00, 12, 'Intel® Core™ i7-10700 (2.9 GHz até 4.8 GHz, cache de 16MB, octa-core, 10ª geração)'),
(default, 'cooler para notebook', 100.00, 50, 'base cooler para notebook com apoio'),
(default, 'monitor lmd', 800.00, 120, 'Monitor LCD com retroiluminação LED - 24"'),
(default, 'teclado gamer', 150.00, 82, 'conexão USB, 1.5m (comprimento do cabo) e 445x140x35mm (dimensão)');

/*Faça um select que retorne os produtos com o valor maior do que 500.*/
select nome, preco from tb_produtos where preco > 500;

/*Faça um select que retorne os produtos com o valor menor do que 500.*/
select nome, preco from tb_produtos where preco < 500;

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/
update tb_produtos set nome='monitor LCD' where id=7;
select * from tb_produtos;

