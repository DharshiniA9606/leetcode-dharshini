-- Last updated: 8/12/2026, 8:42:51 AM
# Write your MySQL query statement below
select player_id,min(event_date) as first_login
from Activity
group by player_id