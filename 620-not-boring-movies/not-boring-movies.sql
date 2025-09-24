-- SELECT *
-- FROM Cinema
-- WHERE id % 2 != 0
-- AND description  != "boring"
-- ORDER BY rating DESC;

select *
from cinema
where id % 2 != 0
and description <> 'boring'
order by rating desc;