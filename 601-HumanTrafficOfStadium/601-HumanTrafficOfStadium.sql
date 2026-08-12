-- Last updated: 8/12/2026, 8:45:32 AM
# use gap and island approach to partition rows into groups
with grps as (
    select *
    , id - row_number() over (order by id) as grp 
    from stadium 
    where people >= 100
)

, date_grp as (
    select grp
    from grps
    group by grp 
    having count(*) >= 3
)
select g.id, g.visit_date, g.people
from grps g
join date_grp d
on g.grp = d.grp
