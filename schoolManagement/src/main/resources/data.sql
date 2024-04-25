
CREATE TABLE IF NOT EXISTS  Staff (
    StaffID INT PRIMARY KEY,
    Name VARCHAR(50),
    Roll VARCHAR(50),
    Department VARCHAR(50),
    Designation VARCHAR(50),
    Mobile VARCHAR(15),
    Status VARCHAR(20),
    Class VARCHAR(20),
    Section CHAR(1),
    `Year` INT
);

INSERT INTO Staff (StaffID, Name, Roll, Department, Designation, Mobile, Status, Class, Section, `Year`)
VALUES 
(1, 'Aravind k','Teacher', 'PT', 'Principal', '123-456-7890', 'Active', '10', 'A', 2020),
(2, 'Kiran k', 'Teacher', 'Maths', 'V-Principal', '987-654-3210', 'Active', '10', 'B', 2020),
(3, 'Sowmya m', 'Teacher', 'Science', 'Staff', '555-555-5555', 'Active', '10', 'C', 2020),
(4, 'Arul m', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '10', 'A', 2021),
(5, 'Akash r', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '10', 'B', 2021),
(6, 'Jhon', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '10', 'C', 2021),
(7, 'Mohan m', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '10', 'A', 2022),
(8, 'Prakash r', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '10', 'B', 2022),
(9, 'Parama', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '10', 'C', 2022),
(10,'Dinesh m', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '11', 'A', 2020),
(11,'Pooja r', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '11', 'B', 2020),
(12, 'Isha', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '11', 'C', 2020),
(13, 'Moorthy m', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '11', 'A', 2021),
(14, 'Muthu r', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '11', 'B', 2021),
(15, 'Akilan', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '11', 'C', 2021),
(16, 'Raja m', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '11', 'A', 2022),
(17, 'Ravi r', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '11', 'B', 2022),
(18, 'Rahul', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '11', 'C', 2022),
(19, 'Arun', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '12', 'A', 2020),
(20, 'Ajay', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '12', 'B', 2020),
(21, 'Jeni', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '12', 'C', 2020),
(22, 'Kumar', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '12', 'A', 2021),
(23, 'Achaya', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '12', 'B', 2021),
(24, 'Jhonny', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '12', 'C', 2021),
(25, 'Srini', 'Teacher', 'Social', 'Staff', '123-456-7890', 'Active', '12', 'A', 2022),
(26, 'Karthi', 'Teacher', 'English', 'Staff', '987-654-3210', 'Active', '12', 'B', 2022),
(27, 'Kala', 'Staff', 'Finance', 'Accountant', '555-555-5555', 'Active', '12', 'C', 2022);