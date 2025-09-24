select user_id , max(time_stamp) as last_stamp
from logins
where cast(time_stamp as year) = '2020'
group by user_id