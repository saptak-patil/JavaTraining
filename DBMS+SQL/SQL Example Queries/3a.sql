alter table actor
add column middle_name varchar(30) after first_name;

select *
from actor;