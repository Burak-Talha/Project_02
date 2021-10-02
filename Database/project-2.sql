create database project_2;
use project_2;
create table users (
id int primary key auto_increment,
username varchar(50) not null
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


insert into users (username) values ('user1');
insert into users (username) values ('user2');
insert into users (username) values ('user3');
insert into users (username) values ('user4');
insert into users (username) values ('user5');
insert into users (username) values ('user6');

/*get all users in table*/
select * from users;