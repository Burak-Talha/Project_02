create database project_2;
use project_2;

create table users (
id int primary key auto_increment,
username varchar(50) not null,
password varchar(50) not null
);

create table ranks(
id int primary key auto_increment,
rank_name varchar(70) not null,
rank_explanation text not null
);

create table users_rank(
id int primary key auto_increment,
users_id int not null,
rank_id int not null,

CONSTRAINT users_rank_fk_01 FOREIGN KEY (users_id) references users(id),
CONSTRAINT users_rank_fk_02 FOREIGN KEY (rank_id) references ranks(id)
);

create table subject_category(
id int primary key auto_increment,
subject_category varchar(50)
);

create table subject(
id int auto_increment primary key,
subject_name varchar(50),
subject_category_id int,

CONSTRAINT subject_ibfk_01 foreign key (subject_category_id) references subject_category(id)
);

create table subject_options(
id int primary key auto_increment,
id_subject int,
subject_option varchar(30),
subject_options_vote int check(subject_options_vote >= 0),

CONSTRAINT subject_options_ibfk_01 foreign key (id_subject) references subject(id)
);

create table users_vote (
id int primary key auto_increment,
users_id int,
subject_options_id int,
added_at datetime,

CONSTRAINT users_vote_ibfk_01 foreign key (users_id) references users(id),
CONSTRAINT users_vote_ibfk_02 foreign key (subject_options_id) references subject_options(id)
);
