create table public.students
(
    id bigserial constraint students_pk primary key,
    first_name varchar,
    last_name varchar,
    age int,
    student_group varchar
);

insert into public.students(first_name, last_name, age, student_group)
    values ('student 1 first name',
            'student 1 last name', 18,
            'A');

insert into public.students(first_name, last_name, age, student_group)
    values('student 2 first name',
           'student 2 last name', 19,
           'D');
insert into public.students(first_name, last_name, age, student_group)
    values ('student 3 first name',
            'student 3 last name',
            19,
            'D');

insert into public.students(first_name, last_name, age, student_group)
    values ('student 4 first name',
            'student 4 last name',
            18,
            'F');