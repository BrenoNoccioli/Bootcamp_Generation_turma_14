-- Atividade 3

/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos alunos deste registro dessa escola.*/
create database if not exists db_escola;
use db_escola;

/*Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos alunos/a para se trabalhar com o serviço dessa escola.*/
create table if not exists tb_alunos(
	matricula bigint(150) auto_increment,
    nome varchar(150) not null,
    data_nascimento date, 
    curso varchar(50),
    nota decimal(3,1),
    primary key(matricula)
)default charset = utf8;



/*Popule esta tabela com até 8 dados;*/
insert into tb_alunos (nome, data_nascimento, curso, nota) values
('breno noccioli', '1990-09-05', 'desenvolvedor/a full-stack', 9.0),
('carolina lima', '1989-12-09', 'qualidade de softwares', 9.5),
('jose dos santos', '1995-05-20', 'desenvolvedor/a full-stack', 8.5),
('luis salvador', '1992-02-20', 'ux/ui designer', 5.0),
('carlos almeida', '2000-05-13', 'ux/ui designer', 7.5),
('lucas souza', '1998-06-02', 'qualidade de softwares', 6.5),
('luisa da silva', '1997-12-21', 'desenvolvedor/a full-stack', 9.0),
('giovana rangel', '1988-10-07', 'marketing', 8.5);


/*Faça um select que retorne o/as alunos/a com a nota maior do que 7.*/
select nome, curso, nota from tb_alunos where nota > 7;

/*Faça um select que retorne o/as alunos/a com a nota menor do que 7.*/
select nome, curso, nota from tb_alunos where nota < 7;

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/
update tb_alunos set nota=7.5 where matricula=6;

select * from tb_alunos;


