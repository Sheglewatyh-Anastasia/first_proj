create schema if not exists cms;

drop table if exists cms.users;

create table if not exists cms.users (
   user_id number(100000000),
   user_name varchar2(100),
   user_birthday date (10000),
   user_active  ()
);


CREATE SEQUENCE	IF NOT EXISTS userIdSequence START WITH 10;

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (43, 'Иванов И. И.', 23.12., true);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (46, 'Петров П. П.', 11.11, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (49, 'Франция', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (55, 'Ирландия', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (32, 'Шотландия', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (45, 'Египет', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (11, 'Греция', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (22, 'Россия', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (35, 'Тайланд', 1, 1);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (221, 'Москва', 2, 2);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (335, 'Пекин', 2, 2);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (327, 'Сан-Франциско', 2, 2);

insert into cms.users (user_id, user_name, user_birthday, user_active)
values (4567, 'Эрмитаж', 3, 3);