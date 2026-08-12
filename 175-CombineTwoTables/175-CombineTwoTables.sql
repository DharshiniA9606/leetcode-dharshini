-- Last updated: 8/12/2026, 8:49:03 AM
# Write your MySQL query statement below
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address ON Person.personId=Address.personId;