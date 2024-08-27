create schema ecommerce ;

create table  employees(
`id` int not null ,
`name` varchar (45) null ,
`salary` varchar (45) null,
primary key(`id`) ,
unique index `id_UNIQUE`(`id` asc));

select * from employees ;

drop table if exists employees  ;
SELECT * FROM employees WHERE name != 'Ali';

