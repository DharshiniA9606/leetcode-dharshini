-- Last updated: 8/12/2026, 8:45:35 AM
# Write your MySQL query statement below
select Class
from Courses group by Class having count(student)>=5;