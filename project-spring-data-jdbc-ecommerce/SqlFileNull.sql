CREATE TABLE user (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `email` VARCHAR(50) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
);


insert into user value  (10,'mhmdfathey','mhmd@gmail.com');

create table  product(
`id` int not null AUTO_INCREMENT,
`name` varchar (45) null ,
`urlimage` varchar (100) null,
`description` varchar (100) null,
primary key(`id`) ,
unique index `id_UNIQUE`(`id` asc));
insert into product value  (10,'pizza',',njsbnlnjddvbnzkn.jpg','on fire pizza ');


select * from product ;

select * from user ;

drop table  product ;
