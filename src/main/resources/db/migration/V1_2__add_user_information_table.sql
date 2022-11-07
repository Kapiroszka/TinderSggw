CREATE TABLE user_information
( user_id bigint unique,
  description text NULL,
  phone_number varchar(9) NULL,
  photo bytea NULL, -- perhaps photos should be moved to other table to allow more then one photo per user
  creation_timestamp timestamp NOT NULL,
  modification_timestamp timestamp NOT NULL
);