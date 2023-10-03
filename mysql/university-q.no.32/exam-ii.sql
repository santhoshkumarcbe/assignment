create database exam
use exam

create table section(
enrollment_id varchar(5),
s_number int primary key
);

create table room (
r_number int primary key,
capacity int,
building varchar(10)
);

create table course(
c_number int primary key,
couse_name char(20),
department char(5)
);

create table exam (
exam_time varchar(8),
exam_id varchar(5),
c_number int,
foreign key(c_number) references
course(c_number),
r_number int,
foreign key(r_number) references
room(r_number)
);

alter table section add(
c_number int,
foreign key(c_number) references
course(c_number)
);

