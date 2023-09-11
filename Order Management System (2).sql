create database order_management_system;

use order_management_system;

create table Customers (
	customer_id int PRIMARY KEY Auto_Increment,
	customer_name varchar(80) NOT NULL,
	gst_number bigint NOT NULL,
	customer_address varchar(255) NOT NULL,
	customer_city varchar(25) NOT NULL,
	customer_email varchar(50) NOT NULL,
	customer_phone bigint NOT NULL,
	customer_pin bigint NOT NULL
);
alter table Customers auto_increment = 11910001;

create table Products (
	product_id int PRIMARY KEY Auto_Increment,
	product_name varchar(50) NOT NULL,
	product_price decimal NOT NULL,
	product_category enum('level1','level2','level3') NOT NULL
);
alter table Products auto_increment = 100;

create table Orders(
	order_id int PRIMARY KEY Auto_Increment,
	order_date datetime NOT NULL,
    customer_id int NOT NULL,
	FOREIGN KEY(customer_id) REFERENCES Customers(customer_id) on DELETE CASCADE, 
    product_list JSON NOT NULL,
	total_order_value decimal NOT NULL,
	shipping_cost decimal NOT NULL,
	shipping_agency varchar(50) NOT NULL,
	status enum('PENDING','APPROVED','COMPLETED','EXPIRED') NOT NULL
);
alter table Orders auto_increment = 10000;

create table Invoice(
	invoice_id int PRIMARY KEY Auto_Increment,
	invoice_date datetime NOT NULL,
    order_id int NOT NULL,
    customer_id int NOT NULL,
	FOREIGN KEY(order_id) REFERENCES Orders(order_id) on DELETE CASCADE,
	FOREIGN KEY(customer_id) REFERENCES Customers(customer_id) on DELETE CASCADE,
    -- product_list JSON,
    -- FOREIGN KEY(product_list) REFERENCES Orders(product_list) on DELETE CASCADE,
    product_list int,
    FOREIGN KEY(product_list) REFERENCES ProductList(order_id) on DELETE CASCADE,
	gst_type enum('inter-state','same-state') NOT NULL,
	total_gst_amt decimal NOT NULL,
	total_invoice_value decimal NOT NULL,
	status enum('paid','unpaid') NOT NULL
);
alter table Invoice auto_increment = 123001;

create table ProductList (
	order_id int,
	product_id int,
	FOREIGN KEY(product_id) REFERENCES Product(product_id),
	PRIMARY KEY(order_id, product_id)
    --product_list JSON
    -- json list will contain  key-value pair of productId and GST value of that product
);

create table Employee(
	employee_id int PRIMARY KEY Auto_Increment,
	employee_user_name varchar(50) NOT NULL,
	employee_password varchar(50) NOT NULL
);

create table Company (
	company_name varchar(255) PRIMARY KEY,
    company_address varchar(255),
    company_city varchar(30),
    gst_number int
);