SELECT e1.name as Employee
FROM employee e1 , employee e2 
where (e1.managerid = e2.id and e1.salary > e2.salary ) 