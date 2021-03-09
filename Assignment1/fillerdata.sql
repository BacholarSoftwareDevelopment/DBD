delete from Dogs; 
delete from Pets;
delete from Vets;
delete from caretakers;
delete from Cities; 


INSERT INTO Cities(zip_code, name) VALUES (8900, 'Randers');
INSERT INTO Cities(zip_code, name) VALUES (2800, 'Lyngby');

INSERT INTO Vets(cvr, name, street, zip_code) VALUES ('51245812', 'Dr. Kock', 'vejvej 1', 8900);
INSERT INTO Vets(cvr, name, street, zip_code) VALUES ('15478536', 'Dr. Hansen', 'gadegade 1', 2800);


insert into Pets (name, age, vet_cvr) values('Bo', 120, 15478536);
insert into Pets (name, age, vet_cvr) values('Hans', 5, 51245812);
insert into Pets (name, age, vet_cvr) values('Jytte', 7, 51245812);
insert into Pets (name, age, vet_cvr) values('Gert', 4, 15478536);


--Dogs
with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bella', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Palle', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Susi', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bruno', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bente', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Lulu', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;
with new_dog as (
insert into Pets (name, age, vet_cvr) values('Lucky', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Sofus', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;


--Cats
with new_cat as (
insert into Pets (name, age, vet_cvr) values('Duchez', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Pjuske', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Tiger', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Mis', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Misser', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Pusser', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;


with new_cat as (
insert into Pets (name, age, vet_cvr) values('Malthe', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Kat', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;


--Caretakers
insert into caretakers (name, street, zip_code) values('Sebastian', 'grønvej 1' , 8900);
insert into caretakers (name, street, zip_code) values('Morten', 'rødvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Jörg', 'gulvej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Malene', 'blåvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Mads', 'lillavej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Benjamin', 'jordbærvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('fransi', 'blåbærvej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Anders', 'hindbærvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Martin', 'nøddevej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Dora', 'birkevej 1' , 2800); 



/*
insert into Pets (name, age, vet_cvr) values('Tonny', 4, 51245812);
insert into Dogs (id, barkpitch) values(6,'b6');
insert into Pets (name, age, vet_cvr) values('Morten', 4, 15478536);
insert into Dogs (id, barkpitch) values(7,'c6');
insert into Pets (name, age, vet_cvr) values('Jörg', 4, 51245812);
insert into Dogs (id, barkpitch) values(8,'a3');
insert into Pets (name, age, vet_cvr) values('Malene', 4, 15478536);
insert into Dogs (id, barkpitch) values(9,'d5');
insert into Pets (name, age, vet_cvr) values('Sebastian', 4, 51245812);
insert into Dogs (id, barkpitch) values(10,'a4');
insert into Pets (name, age, vet_cvr) values('Mads', 4, 15478536);
insert into Dogs (id, barkpitch) values(11,'a6');
insert into Pets (name, age, vet_cvr) values('Benjamin', 4, 51245812);
insert into Dogs (id, barkpitch) values(12,'a7');
*/

select * from pets;

select * from cats join pets on cats.id = pets.id;

