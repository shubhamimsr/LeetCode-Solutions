-- Write your PostgreSQL query statement below
select w.id
from Weather w
where lead() over (partition by w.recordDate)