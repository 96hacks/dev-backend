select * from article;
select * from author;
select * from comment;
select * from image;
select * from user;
select * from description;
alter table image auto_increment=1000;
update image set image_id=1000 where image_id=189;
alter table image ADD CONSTRAINT image_id foreign key(image_id) references description(image_id);