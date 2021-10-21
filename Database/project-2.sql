create database project_2;
use project_2;

create table users (
id int primary key auto_increment,
discord_id long,
username varchar(50) not null,
password varchar(50) null
);

create table subjectcategory(
id int primary key auto_increment,
subject_category varchar(50)
);

create table subject(
id int auto_increment primary key,
subject_name varchar(50),
subject_category_id int,

CONSTRAINT subject_ibfk_01 foreign key (subject_category_id) references subjectcategory(id)
);

create table subjectoptions(
id int primary key auto_increment,
id_subject int,
subject_option varchar(30),
subject_options_vote int check(subject_options_vote >= 0),

CONSTRAINT subject_options_ibfk_01 foreign key (id_subject) references subject(id)
);
	
create table usersvote (
id int primary key auto_increment,
users_id int,
subject_options_id int,
added_at datetime,

CONSTRAINT users_vote_ibfk_01 foreign key (users_id) references users(id),
CONSTRAINT users_vote_ibfk_02 foreign key (subject_options_id) references subjectoptions(id)
);

create table sweepstake (
id int primary key auto_increment,
sweepstake_subject varchar(50) not null,
number_of_persons int check(number_of_persons >= 0)
);

create table sweepstakewinners(
id int primary key auto_increment,
users_id int,
comments varchar(500),

CONSTRAINT sweepstakewinners_ibfk_01 foreign key (users_id) references users(id)
);
