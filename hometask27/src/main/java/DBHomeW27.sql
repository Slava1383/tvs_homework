create table orders (
    id int primary key,
    order_name varchar,
    order_date date,
    number_of_goods integer,
    order_cost numeric,
    order_delivery boolean
);

alter table orders ADD column status_order varchar;

insert into orders (id, order_name, order_date, number_of_goods, order_cost, order_delivery)
            values (2, 'OrderName2', '2009-03-17', 37, 37900, false),
                   (3, 'OrderName3', '2010-07-02', 12, 9300, true),
                   (4, 'OrderName4', '2012-12-26', 83, 32840, false);

select * from orders;
delete from orders where id = 3;
delete from orders;