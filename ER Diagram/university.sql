create database university
use university

create table courses(
title char(25),
course_code varchar(9) primary key,
credits int,
syllabus char(100),
prerequisties char(100)
);

create table course_offerings(
course_offer_id varchar(5) primary key,
semester int,
academic_year varchar(12),
timing varchar(14),
section_number int,
classroom varchar(5),
course_code varchar(9),
foreign key (course_code) references courses(course_code)
);

create table students (
program char(5),
student_name char(25),
student_id varchar(10) primary key,
course_offer_id varchar(5),
foreign key(course_offer_id) references 
course_offerings(course_offer_id)
);

create table exam (
exam_hall varchar(5),
timing varchar(14),
exam_id varchar(5),
exam_date date,
invigilator varchar(10),
marks int
)

alter table exam add
primary key(exam_id)

create table instructor(
instructor_id varchar(10),
department char(5),
course_handling varchar(9),
foreign key (course_handling) references
courses(course_code),
instructor_name char(25),
exam_id varchar(5),
foreign key (exam_id) references 
exam(exam_id)
);