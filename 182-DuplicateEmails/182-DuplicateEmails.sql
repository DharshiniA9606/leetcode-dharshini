-- Last updated: 8/12/2026, 8:48:45 AM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;