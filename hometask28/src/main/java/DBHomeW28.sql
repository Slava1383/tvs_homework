insert into persons (id, name, gender, birthday)
values (1, 'user1','male','2001-01-01'),
       (2, 'user2','female','2002-02-02'),
       (3, 'user3','male','2003-03-03'),
       (4, 'user4','female','2004-04-04'),
       (5, 'user5','male','2005-05-05'),
       (6, 'user6','female','2006-06-06'),
       (7, 'user7','male','2007-07-07'),
       (8, 'user8','female','2008-08-08'),
       (9, 'user9','male','2009-09-09'),
       (10, 'user10','female','2010-10-10');
insert into hobbies (id, hobby, type_hobby)
values (1,'football','active'),
       (2,'chess','calm'),
       (3,'game','active'),
       (4,'reading books','calm');
insert into person_hobby (id, person_id, hobby_id)
values (1,1,1),
       (2,1,2),
       (3,1,3),
       (4,1,3),
       (7,3,4),
       (5,2,1),
       (6,2,4),
       (8,4,2),
       (9,5,3),
       (10,6,1);
insert into persons (id, name, gender, birthday)
values (11, 'user11', null, null);


create type sex as enum ('male','female');
create type activity_hobby as enum ('calm','active');

create table persons (
     id int primary key,
     name varchar,
     gender sex,
     birthday date
);

create table hobbies (
     id int primary key,
     hobby varchar,
     type_hobby activity_hobby
);

create table person_hobby (
      id int primary key,
      person_id int,
      hobby_id int,
      constraint person_fk foreign key (person_id) references persons (id),
      constraint hobby_fk foreign key (hobby_id) references hobbies (id)
);

select * from persons;

select * from hobbies;

select * from person_hobby;

select * from persons where birthday > '2004-05-01';

select gender, count(*) from persons group by gender;

select p.name, h.hobby from persons p left join person_hobby ph on p.id = ph.person_id
                                      left join hobbies h on h.id = ph.hobby_id;

select persons.name, count(hobby_id) from persons join person_hobby on persons.id = person_hobby.person_id
                                                  join hobbies on hobbies.id = person_hobby.hobby_id
                                                  group by persons.name having count(hobby_id) > 1;

select type_hobby, count(*) from hobbies group by type_hobby;

select hobby, type_hobby from hobbies;

drop table person_hobby, hobbies, persons;