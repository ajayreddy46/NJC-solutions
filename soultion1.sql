#Creating database
CREATE DATABASE patrons;
use patrons;

#creating a table
create table accountspayable(
   id INT NOT NULL AUTO_INCREMENT,
   firstname VARCHAR(40) NOT NULL,
   lastname VARCHAR(40) NOT NULL,
   company VARCHAR(100) NOT NULL,
   phonenumber INT(10) NOT NULL,
   PRIMARY KEY ( id )
);

#inserting records
	
INSERT INTO accountspayable (firstname,lastname,company,phonenumber )
VALUES ("steve","smith","caaust",0322754);
INSERT INTO accountspayable (firstname,lastname,company,phonenumber )
VALUES ("ajay","reddy","bfca",03218879);
INSERT INTO accountspayable (firstname,lastname,company,phonenumber )
VALUES ("aleks","parik","kingdecil",04225778);
INSERT INTO accountspayable (firstname,lastname,company,phonenumber )
VALUES ("grant","archi","cardmanaging",0844757)