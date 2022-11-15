create database mybatis;                /*创建数据库*/
create table mybatis.Users
(
    UUID      varchar(36) primary key,
    role      varchar(15) not null,
    name      varchar(20) not null unique,
    password  varchar(20) not null,
    timestamp timestamp default current_timestamp
);                                      /*创建表*/
insert into mybatis.Users (UUID, name, role, password)
values (UUID(), 'root', 'root', 'root'),
       (UUID(), 'admin', 'administrators', 'admin'),
       (UUID(), 'user1', 'user', 123456),
       (UUID(), 'user2', 'user', 123456),
       (UUID(), 'user3', 'user', 123456);/*添加数据*/