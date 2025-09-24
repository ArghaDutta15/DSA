# Write your MySQL query statement below
select a.student_id,a.student_name,c.subject_name, count(b.student_id) as attended_exams
from students as a
JOIN Subjects as c
left join examinations  as b
on a.student_id=b.student_id and c.subject_name=b.subject_name
group by a.student_id,c.subject_name
order by student_id,subject_name;