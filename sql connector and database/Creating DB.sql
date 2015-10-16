-- Создать базу данных Касса
CREATE DATABASE Kassa;
USE Kassa;

-- Таблица продукты
CREATE TABLE Products (barcode INT AUTO_INCREMENT, product_name VARCHAR(30), price DOUBLE, total INT, PRIMARY KEY(barcode));

INSERT INTO Products (product_name, price, total) VALUES ('Bread', 8.5, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Coca-cola', 9.2, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Milk', 15, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Egg', 1.5, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Beer', 12.5, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Chiken', 50, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Pie', 80, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Tea', 25.8, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Contex', 82.53, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Lays', 12.8, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('River fish', 50.99, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Red fish', 199.99, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Fat', 38.25, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Vodka', 63.2, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Korona', 18.5, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Jeck', 3.1, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Coffee', 73.65, 1000);
INSERT INTO Products (product_name, price, total) VALUES ('Chupa-chups', 5.05, 1000);

-- Список всех чеков - таблица для получения номера чека и хранения суммы чека, даты, имени пользователя
CREATE TABLE all_checks (checknumber INT NOT NULL, check_price DOUBLE, date_ DATE, time_ TIME, seller VARCHAR(30), PRIMARY KEY(checknumber));

-- Список пользователей

CREATE TABLE users (user_name VARCHAR(30), password VARCHAR(30), PRIMARY KEY(user_name));
INSERT INTO users VALUES ('ILLIA','123');
INSERT INTO users VALUES ('Vasya','123');
INSERT INTO users VALUES ('User','user');

-- Создание учетной записи для подключения к БД
GRANT ALL PRIVILEGES ON Kassa.* TO 'user'@'%' IDENTIFIED BY 'ILLIA' WITH GRANT OPTION;
FLUSH PRIVILEGES;