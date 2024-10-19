insert into user_details(id,birth_date,name) values (10001,current_date(), 'Richard');
insert into user_details(id,birth_date,name) values (10002,current_date(), 'Candice');
insert into user_details(id,birth_date,name) values (10003,current_date(), 'Steve');

insert into post(id,description, user_id) values (20001,'learning spring', 10001);
insert into post(id,description, user_id) values (20002,'learning aws', 10001);
insert into post(id,description, user_id) values (20003,'not learning', 10002);
insert into post(id,description, user_id) values (20004,'cetified aws', 10002);
insert into post(id,description, user_id) values (20005,'chilling', 10003);