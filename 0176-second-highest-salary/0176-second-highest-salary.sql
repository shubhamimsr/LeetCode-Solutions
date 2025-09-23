-- Write your PostgreSQL query statement below
-- select (select DISTINCT salary 
-- from Employee
-- order by salary desc
-- offset 1 
-- limit 1) as SecondHighestSalary;

-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary < (SELECT MAX(salary) FROM Employee);

select max(salary) as SecondHighestSalary
from employee
where salary < (select max(salary) from employee);