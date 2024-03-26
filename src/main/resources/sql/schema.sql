CREATE TABLE students (
     student_id serial PRIMARY KEY ,
     student_name varchar(50),
     email varchar(50),
     phone_number integer
);
CREATE TABLE student_course (
    id serial PRIMARY KEY ,
    student_id serial,
    course_id serial
);