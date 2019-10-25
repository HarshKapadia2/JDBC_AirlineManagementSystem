CREATE TABLE flight
(
 flight_no varchar(6) PRIMARY KEY,
 depart_airport varchar(50) NOT NULL,
 arrival_airport varchar(50) NOT NULL,
 depart_date date NOT NULL,
 arrival_date date NOT NULL
);

CREATE TABLE employee
(
 emp_id varchar(6) PRIMARY KEY,
 emp_name varchar(20) NOT NULL,
 emp_job varchar(15) NOT NULL,
 emp_username varchar(20) UNIQUE NOT NULL,
 emp_password varchar(10) UNIQUE NOT NULL
);