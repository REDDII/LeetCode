-- Write your PostgreSQL query statement below
SELECT u2.name as Employee
FROM employee as u1
LEFT OUTER JOIN employee as u2 ON u2.managerid = u1.id 
where u2.salary > u1.salary ;