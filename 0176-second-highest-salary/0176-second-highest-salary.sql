-- -- Write your PostgreSQL query statement below
 SELECT MAX(salary) as SecondHighestSalary
 FROM(   
    SELECT salary,
    rank() over(order by salary DESC) as ranked_position
    FROM Employee
 ) as ranked
 
 WHERE ranked_position = 2;
