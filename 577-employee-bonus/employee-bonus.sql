SELECT em.name, bo.bonus
FROM Employee em
LEFT JOIN Bonus bo
  ON em.empId = bo.empId
WHERE bo.bonus < 1000 OR bo.bonus IS NULL;