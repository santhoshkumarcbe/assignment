MYSQL DATABASE COMMENTS

CREATE DATABASE DB

USE DB

CREATE TABLE STUDENTS (
STUDENTID VARCHAR(10),
FIRSTNAME VARCHAR(20),
SECONDNAME VARCHAR(20)
);

ALTER TABLE STUDENTS ADD DEPARTMENT CHAR(6);
SELECT * FROM STUDENTS;

create table instructor( instructor_id varchar(3) , instructor_name varchar(20), department varchar(6), title varchar(30));
select * from instructor;

create table courses (course_code varchar(10), course_name char(30), credits int, syllabus char(100) ,prerequisties char(100) );
CREATE TABLE COURSE_OFFERINGS (
COURSE_NUMBER INT,
 YEAR_OF_STUDY VARCHAR(3),
 SEMESTER VARCHAR(2),
 SECTION_NUMBER int,
 INSTRUCTOR CHAR(30),
 TIMING time,
 CLASSROOM VARCHAR(7)
 );




CREATE DATABASE MARKS 

USE MARKS

CREATE TABLE EXAMS (
EXAM_HALL VARCHAR(10),
STUDENTS_COUNT INT,
START_TIME time,
END_TIME time,
DURATION VARCHAR(10),
INVIGILATOR CHAR(30)
);
ALTER TABLE EXAMS  ADD (MARKS INT ) ;

--

CREATE DATABASE CSK;
USE CSK;

create table matches(
match_no int,
players char(30),
place char(20),
match_date date,
score int,
opponent_team char(25)
);

create table player(
player_id varchar(10),
player_name char(25),
score int,
wickets int,
overbowled int
);

create table teams(
team_id varchar(5),
team_name char(20)
);

alter table player add score_conceded int ;

alter table player add BOWLING_AVERAGE decimal;

SHOW triggers

create TRIGGER FIND_AVERAGE
BEFORE INSERT ON PLAYER
FOR EACH ROW
SET NEW.BOWLING_AVERAGE = NEW.SCORE_CONCEDED/NEW.WICKETS;

SHOW triggers

ALTER TABLE TEAMS ADD
PRIMARY KEY (TEAM_ID)

ALTER TABLE PLAYER ADD primary key (PLAYER_ID);

ALTER TABLE MATCHES ADD PRIMARY KEY (MATCH_NO)

ALTER TABLE TEAMS ADD(
PLAYER_ID varchar(5),
foreign key(PLAYER_ID) 
references PLAYER(PLAYER_ID));

ALTER TABLE TEAMS ADD(
MATCH_NO INT,
foreign key(MATCH_NO) 
references MATCHES(MATCH_NO));

ALTER TABLE PLAYER ADD(
TEAM_ID VARCHAR(5),
FOREIGN KEY (TEAM_ID) REFERENCES TEAMS(TEAM_ID),
MATCH_NO INT,
foreign key (MATCH_NO) references MATCHES(MATCH_NO)
); 



