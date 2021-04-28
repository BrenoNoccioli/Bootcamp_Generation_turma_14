-- Atividade 1

create database if not exists db_generation_game_online;
use db_generation_game_online;

create table if not exists tb_classe(
	id bigint auto_increment not null,
    tipo varchar(255) not null,
    fraqueza varchar (255),
    primary key(id)
);


create table if not exists tb_personagens (
	id bigint auto_increment not null,
    nome varchar(255) not null,
    ataque decimal,
    defesa decimal,
	tipo_id bigint not null,
    primary key(id),
    foreign key(tipo_id) references tb_classe(id)
);

insert into tb_classe(tipo, fraqueza) values
('eletrico', 'terrestre'),
('aquatico', 'eletrico'),
('fogo', 'aquatico'),
('planta', 'fogo'),
('terrestre', 'gelo');

insert into tb_personagens (nome, ataque, defesa, tipo_id) values
('pikachu', 10000, 5000, 1),
('bulbassaur', 5000, 3500, 4),
('charmander', 5550, 3000, 3),
('squirtle', 4500, 7000, 2),
('golem', 12000, 20000, 5),
('onix', 9000, 15000, 5),
('Magicarp', 1, 1, 2),
('electrode', 11000, 8000, 1);
select * from tb_personagens;
select nome, ataque from tb_personagens where ataque > 2000;

select nome, ataque from tb_personagens where defesa between 10000 and 20000;

select nome from tb_personagens where nome like('%c%');

select tb_personagens.nome, tb_personagens.ataque, tb_personagens.defesa, tb_classe.tipo, tb_classe.fraqueza from tb_personagens join tb_classe on tb_personagens.tipo_id = tb_classe.id;

select tb_personagens.nome, tb_classe.tipo from tb_personagens join tb_classe on tb_personagens.tipo_id = tb_classe.id where tb_classe.tipo = 'eletrico'; 