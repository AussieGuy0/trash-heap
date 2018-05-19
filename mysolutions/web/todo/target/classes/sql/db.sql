CREATE TABLE user (
  userId LONG PRIMARY KEY,
  userName VARCHAR(25),
  pass VARCHAR(255)
);


CREATE TABLE todo (
  todoId LONG PRIMARY KEY,
  userId  LONG ,
  todoText TEXT,
  date DATETIME
)