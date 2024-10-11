create table delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20) not null,
phone_no BIGINT not null,
rating int
);

insert into delivery_partners 
values
('p101','Instamart',7865123459,5),
('p102','Blinkit',9865123459,4),
('p103','Zepto',8765123459,2),
('p104','BigBasket',7135123459,1),
('p105','Zomato',8755123459,3);

select *from delivery_partners;

select partner_id,partner_name,phone_no 
from delivery_partners
where rating between 3 and 5
order by partner_id;

create table customers(
customer_id varchar(10) primary key,
customer_name varchar(20) not null,
address varchar(20),
phone_no bigint not null,
email_id varchar(20)
);

insert into customers 
values
('CUST1001','Thomas','Kochi',9856325486,'thomas@gmail.com'),
('CUST1002','Charles','Allepy',9856367486,'charles@gmail.com'),
('CUST1003','Sudhakar','Kochi',9856323869,'sudhakar@gmail.com'),
('CUST1004','Jagaish','Ernakulam',9856326666,'jagadish@gmail.com'),
('CUST1005','Albert','Allepy',9856328659,'albert@gmail.com'),
('CUST1006','Ashwin Das','Kannur',9856325659,'ashwin@gmail.com');

select *from customers;

update customers
set phone_no=9876543210
where customer_id='CUST1004';

select *from customers
order by customer_id;

Select *from customers
where email_id like '%@gmail.com'
order by customer_id;

alter table customers
alter column customer_id type int using customer_id::int;


create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20) not null,
hotel_type varchar(20),
rating int
);
insert into hotel_details
values 
('Ht1001','Grand SR','Stay',4),
('Ht1002','Renuka','Dormatory',3),
('Ht1003','Taj','Luxury',5),
('Ht1004','The Hut','INN',3),
('Ht1005','Uddav','Comfort',4);


alter table hotel_details
rename column rating to hotel_rating;

select *from hotel_details;


select concat(hotel_name,' is a ',hotel_type,' hotel') as "hotel_info"
from hotel_details
order by hotel_name desc;


create table orders(
order_id varchar(10) primary key,
customer_id varchar(10) not null,
hotel_id varchar(10) not null,
partner_id varchar(10) not null,
order_date date not null,
order_amount int not null,
foreign key(customer_id) references customers(customer_id),
foreign key(hotel_id) references hotel_details(hotel_id),
foreign key(partner_id) references delivery_partners(partner_id)
);

insert into orders
values
('ord1001','CUST1001','Ht1001','p101','2024-10-01',500),
('ord1002','CUST1002','Ht1002','p102','2024-10-02',300),
('ord1003','CUST1003','Ht1003','p103','2024-09-03',1200),
('ord1004','CUST1004','Ht1004','p104','2024-08-04',600),
('ord1005','CUST1005','Ht1005','p105','2024-09-05',400),
('ord1006','CUST1005','Ht1005','p105','2024-07-05',400);
 
 

 

select *from orders;
 


select h.hotel_id,h.hotel_name,count(o.hotel_id) as "No of orders"
from hotel_details h
join orders o on h.hotel_id=o.hotel_id
group by h.hotel_id,h.hotel_name
having count(o.hotel_id)>1
order by h.hotel_id asc;

select h.*,o.*
from hotel_details h
join orders o on h.hotel_id=o.hotel_id and o.order_date not between '2024-10-01' and '2024-10-31'

 

select o.order_id,c.customer_name,h.hotel_name,o.order_amount
from orders o
join customers c on o.customer_id=c.customer_id
join hotel_details h on o.hotel_id=h.hotel_id
order by o.order_id asc;


create table pizza(
pizza_id varchar(10) primary key,
cust_id varchar(10),
partner_id varchar(10),
pizza_name varchar(15),
pizza_type varchar(15),
order_date date,
amount int,
foreign key(cust_id) references customer(cust_id),
foreign key(partner_id) references delivery_partner(partner_id)
);

insert into pizza 
values
('piz001','CUST001','p101','Margherita','Extra Large','2024-10-01',1000),
('piz002','CUST002','p102','Pepperoni','Large','2024-09-03',800),
('piz003','CUST003','p103','Veggie','Extra Large','2024-09-05',1200);

update pizza
set amount=amount*0.97
where pizza_type='Extra Large';

select *from pizza where pizza_type='Extra Large';
