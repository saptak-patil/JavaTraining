select f.title
from film as f
join language as l
on f.language_id = l.language_id
where f.title like 'K%' or 'Q%' and l.name = 'English';