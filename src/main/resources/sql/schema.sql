CREATE TABLE students (
     student_id serial PRIMARY KEY ,
     student_name varchar(50),
     email varchar(50),
     phone_number integer
);

CREATE TABLE instructors (
    instructor_id serial PRIMARY KEY ,
    instructor_name varchar(30),
    email varchar (30)
);