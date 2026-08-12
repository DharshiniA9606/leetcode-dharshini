-- Last updated: 8/12/2026, 8:48:55 AM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

    set N = N-1;
  RETURN (
        select distinct salary
        from Employee
        order by salary DESC
        limit 1 offset N
  );    
END