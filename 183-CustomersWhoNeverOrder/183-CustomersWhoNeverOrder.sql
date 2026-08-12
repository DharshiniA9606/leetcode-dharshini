-- Last updated: 8/12/2026, 8:48:42 AM
SELECT c.name AS Customers
FROM Customers c
WHERE NOT EXISTS (
    SELECT 1
    FROM Orders o
    WHERE c.id = o.customerId
);