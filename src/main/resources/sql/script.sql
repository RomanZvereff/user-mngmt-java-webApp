create database USER_MANAGEMENT character set 'utf8mb4';

create table USERS (
    ID int auto_increment primary key,
    USER_NAME varchar(50) not null,
    USER_EMAIL varchar(50) not null,
    USER_COUNTRY varchar(50) not null
);