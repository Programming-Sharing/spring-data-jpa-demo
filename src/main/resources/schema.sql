drop table UserAuditable if exists;
create table User (
	id INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	createdBy VARCHAR(50),
	createdDate date,
	lastModifiedBy VARCHAR(50),
	lastModifiedDate date
);