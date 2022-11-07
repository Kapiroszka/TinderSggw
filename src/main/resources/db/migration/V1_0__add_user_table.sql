CREATE TABLE tinder_user
( id bigint GENERATED ALWAYS AS IDENTITY primary key,
  user_name varchar(64) NOT NULL,
  password   varchar(100) NOT NULL,
  user_email varchar(126) NOT NULL,
  creation_timestamp timestamp NOT NULL,
  modification_timestamp timestamp NOT NULL
);