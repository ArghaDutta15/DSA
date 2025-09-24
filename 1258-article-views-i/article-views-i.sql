select author_id id
from views
group by author_id, viewer_id
having author_id = viewer_id
order by author_id asc;
