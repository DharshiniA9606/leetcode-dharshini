-- Last updated: 8/12/2026, 8:45:14 AM
SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;