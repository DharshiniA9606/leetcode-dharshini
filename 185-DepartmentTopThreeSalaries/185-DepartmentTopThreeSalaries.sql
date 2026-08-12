-- Last updated: 8/12/2026, 8:48:34 AM
/* Write your T-SQL query statement below */
WITH RANK_CTE AS
(
    SELECT
        E.name AS Employee,
        E.salary AS Salary,
        D.name AS Department,
        DENSE_RANK()OVER(PARTITION BY E.departmentId ORDER BY E.salary DESC) AS rnk
    FROM Employee AS E
    INNER  JOIN Department AS D
    ON E.departmentId = D.id
)
-- DONE DESIRED CTE TABLE WITH RANKING, NOW SELECT FROM IT.
SELECT
    Department,
    Employee,
    Salary
FROM RANK_CTE
WHERE rnk <= 3;