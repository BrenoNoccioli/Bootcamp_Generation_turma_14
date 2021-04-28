-- Atividade1

/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionários desta empresa.*/
create database db_servico_rh;
use db_servico_rh;

/*Crie uma tabela de funcionários e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço deste RH.*/
create table tb_funcionarios(
	id int(10) auto_increment,
    nome_completo varchar(150),
    data_nascimento date,
    salario double(8,2),
    funcao varchar (150),
    primary key(id)
)default charset = utf8;

desc table tb_funcionarios;

/*Popule esta tabela com até 5 dados;*/
insert into tb_funcionarios (nome_completo, data_nascimento, salario, funcao) values
('breno nocicoli', '1990-09-05', '4500.00', 'programador'),
('carolina lima', '1989-12-09', '5200.00', 'analista de qualidade'),
('joao dos santos', '1982-05-20', '4000.00', 'ux/ui'),
('giovana romano', '1988-10-05', '5000.00', 'gerente de projetos'),
('carlos da silva', '2002-04-23', '1800.00', 'estagiario');

/*Faça um select que retorne os funcionários com o salário maior do que 2000.*/
select nome_completo, salario from tb_funcionarios where salario > 2000;

/*Faça um select que retorne os funcionários com o salário menor do que 2000.*/
select nome_completo, salario from tb_funcionarios where salario < 2000;

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/
update tb_funcionarios set salario=4500.00 where id=3;
select * from tb_funcionarios;

