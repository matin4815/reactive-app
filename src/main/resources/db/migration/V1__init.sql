CREATE TABLE people(
    id SERIAL NOT NULL PRIMARY KEY ,
    firstname VARCHAR(250),
    lastname VARCHAR(250),
    student_number integer
);
CREATE TABLE courses (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);
CREATE TABLE people_courses (
    id SERIAL PRIMARY KEY,
    person_id BIGINT NOT NULL ,
    course_id BIGINT NOT NULL ,
    FOREIGN KEY (person_id) REFERENCES people(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);