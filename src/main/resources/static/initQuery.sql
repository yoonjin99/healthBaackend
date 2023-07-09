create table exercise_base (
                               code numeric primary key,
                               name varchar
);


create table exercise_detail(
                                seq numeric primary key,
                                code numeric,
                                set_number numeric,
                                times numeric,
                                weight numeric,
                                exercise_date date
)

insert into exercise_base(code,name)
    values ('10', '데드리프트');

insert into exercise_base(code,name)
values ('20', '스쿼트');

insert into exercise_base(code,name)
values ('30', '숄더프레스');