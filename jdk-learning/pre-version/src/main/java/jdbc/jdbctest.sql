create database stu if not exists test;
create table stu if not exists (
  id int not null auto_increment,
  sno int not null,
  sname varchar(5) ,
  primary key(id)
);
insert into stu (sno,sname) values
(1,'小明'),
(2,'小红');