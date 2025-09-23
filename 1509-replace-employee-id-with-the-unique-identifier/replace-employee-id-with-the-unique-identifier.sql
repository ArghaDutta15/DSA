SELECT emuni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI emuni  
ON e.id = emuni.id;