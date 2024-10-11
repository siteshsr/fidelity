create table tblCustomers(
customerId int primary key,
companyName varchar(100) not null,
contactName varchar(50),
Address varchar(200),
country varchar(30) default 'Canada'
);
 
create table tblSuppliers(
supplierId int primary key,
name varchar(50) not null,
Address varchar(100),
city varchar(30)
);

create table tblShippers(
shipperId int primary key,
companyName varchar(100) not null unique
);

create table tblProducts(
productId int primary key,
supplierId int not null,
categoryId int,
foreign key (supplierId) references tblSuppliers(supplierId)
);

create table tblOrders(
orderId int primary key,
customerId int not null,
orderDate date,
shippedDate date,
foreign key(customerId) references tblCustomers(customerId),
check(shippedDate>orderDate)
);

create table tblOrderDetails(
orderId int not null,
productId int not null,
quantity int check(quantity>10),
primary key(orderId,productId),
foreign key(orderId) references tblOrders(orderId),
foreign key(productId) references tblProucts(productId)
);