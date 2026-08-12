-- Last updated: 8/12/2026, 8:45:08 AM
# Write your MySQL query statement below
select
row_number() over(order by new_id) as id ,
student 
from(
select 
case
when id%2 =1 then id+1
else id-1
end as new_id ,
student
from Seat
) t
order by id