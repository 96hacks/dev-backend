create table article(
article_id int not null auto_increment,
name varchar(255) not null,
category varchar(100),
added_date date,
stars int,
background_image blob,
primary key(article_id));
alter table article auto_increment=100000;

create table user(
user_id varchar(30) not null,
name varchar(30),
dob date,
mobile varchar(12),
email varchar(30),
liked int,
comments int,
read_count int,
primary key(user_id));

create table author(
user_id varchar(30),
article_id int,
foreign key(user_id) references user(user_id));

create table comment(
comment_id int auto_increment,
article_id int,
user_id varchar(30),
commented_date date,
description varchar(1000),
likes int,
dislikes int,
primary key(comment_id),
foreign key(article_id) references article(article_id));
alter table comment auto_increment=1000;

create table description(
description_id int auto_increment,
article_id int,
data blob,
image_id int,
primary key(description_id),
foreign key(article_id) references article(article_id));
alter table description auto_increment=1000;

create table image(
image_id int,
image blob,
primary key(image_id));

alter table image auto_increment=1000;
update image set image_id=1000 where image_id=189;
alter table image ADD CONSTRAINT image_id foreign key(image_id) references description(image_id);