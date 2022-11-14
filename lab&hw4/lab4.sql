use gdsc4_1;
create table User2(
    ID int primary key ,
    Name varchar(30) not null ,
    ReserveDate date,
    recoNum int
);

show tables;

alter table user2 rename column recoNum to roomNum;

alter table user2 add Phone int not null;
desc user2;
alter table user2 drop Phone;
alter table user2 modify column ReserveDate varchar(20);
drop table user2;

# 테이블의 데이터를 전부 삭제하는 작업
truncate table user2;

insert into user2 values (1,'이순신','2016-02-16',1108), (2,'이현복','1998-09-05', 32);
select * from user2;

UPDATE user2 SET roomNum = 2002 WHERE Name = '이순신';

delete from user2 where name='이순신';

select * from user2;


use sakila;
show tables ;
select * from country join city on
        country.country_id = city.country_id;
select * from country left join city on
        country.country_id = city.country_id;
select * from country right join city on
        country.country_id = city.country_id;