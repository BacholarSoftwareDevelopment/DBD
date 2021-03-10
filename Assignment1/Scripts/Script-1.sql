-- Stored procedures:
--drop procedure update_cat;


-- Update Cat
CREATE OR REPLACE PROCEDURE update_cat(cat_id integer, new_name varchar, lifes integer) 
	AS $$
	BEGIN 
		UPDATE Pets 
			SET name = new_name where id = cat_id;
		UPDATE Cats 
			SET life_count = lifes where id = cat_id;
	END$$
language plpgsql;


-- Update dog
CREATE OR REPLACE PROCEDURE update_dog(dog_id integer, new_name varchar, new_bark_pitch varchar) 
	AS $$
	BEGIN 
		UPDATE Pets 
			SET name = new_name where id = dog_id;
		UPDATE Dogs 
			SET bark_pitch = new_bark_pitch where id = dog_id;
	END$$
language plpgsql;




--call update_dog(9, 'Couscous', 'b2');
--select * from dogs_view;

--call update_cat(13, 'Kisser', 42);
--select * from cats_view;