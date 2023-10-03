create database onlinestore  
use onlinestore

create table customer(
address varchar(50),
email varchar(30),
mobile_no int,
customer_name char(30)
);

create table shoppingbasket(
basketid varchar(10) primary key
);

alter table customer add (
basketid varchar(10),
foreign key (basketid) references
shoppingbasket(basketid));

alter table customer add customer_id varchar(10) 
primary key

alter table shoppingbasket add (
customer_id varchar(10),
foreign key (customer_id) references
customer(customer_id)
);

create table warehouse(
phone int,
address varchar(30),
warehouse_code varchar(10) primary key
);

create table book (
title char(20),
ISBN int unique,
book_id varchar(10),
price int,
published_year year,
warehouse_code varchar(10),
foreign key(warehouse_code) references
warehouse(warehouse_code)
);

alter table book add primary key (book_id) 

create table publisher(
publisher_name char(30),
publisher_id varchar(10) primary key,
url varchar(50),
phone_number int,
address varchar(50),
product_id varchar(10),
foreign key (product_id) references
book(book_id)
);

create table author(
author_name char(30),
author_id varchar(10),
url varchar(50),
product_id varchar(10),
foreign key (product_id) 
references book(book_id)
);

create table drive(
drive_id varchar (10) primary key,
drive_type char(12),
price int,
drive_name char(20),
warehouse_code varchar(10),
foreign key(warehouse_code) references
warehouse(warehouse_code)
);

alter table author add primary key(author_id)

create table song(
song_name varchar(20),
song_id varchar(10) primary key,
publisher_id varchar(10),
foreign key (publisher_id)
references publisher(publisher_id),
author_id varchar(10),
foreign key (author_id)
references author(author_id)
);

alter table song add(
drive_id varchar(10),
foreign key (drive_id) references
drive(drive_id)
);

create table singer(
singer_name char(30),
singer_id varchar(10),
no_of_songs_composed int,
song_id varchar(10),
foreign key(song_id) references
song(song_id)
);

alter table shoppingbasket add(
quantity int,
product_id varchar(10),
foreign key (product_id) references
book(book_id),
foreign key (product_id) references
drive(drive_id)
);

