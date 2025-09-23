-- Write your PostgreSQL query statement below
-- select (select DISTINCT salary 
-- from Employee
-- order by salary desc
-- offset 1 
-- limit 1) as SecondHighestSalary;

-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary < (SELECT MAX(salary) FROM Employee);

-- select max(salary) as SecondHighestSalary
-- from employee
-- where salary < (select max(salary) from employee);

-- SELECT distinct salary as SecondHighestSalary
-- from (
--     select id, salary, RANK() 
--     OVER (ORDER BY salary DESC) AS salary_rank
--     FROM Employee
-- )ranked
-- where salary_rank = 2;

-- Write your PostgreSQL query statement below
WITH r AS (SELECT DISTINCT salary FROM Employee)
SELECT (
    SELECT salary  
    FROM (
        SELECT salary, rank() OVER (ORDER BY salary DESC) rank FROM r
    )
    WHERE rank = 2
)AS "SecondHighestSalary";