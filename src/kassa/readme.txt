                        Проект "Рабочее место кассира"

        Основная информация
    
    Система предназначена для организации рабочего места кассира. Кассир 
производит поиск товара в базе данных продуктов по введенному им штрихкоду либо 
по имени товара (можно вводить не полное имя и будет показан список товаров с 
похожим именем). После формирования списка всех продуктов для данного чека 
кассир вводит сумму наличных от покупателя и печатает чек. Во время печати из 
таблицы БД продукты списываются товары из чека, в таблице учета всех чеков 
создается запись с основной информацией о чеке, а также добавляется копия чека в 
локальный отчетный файл.
 
        Требования к БД
 
    Для работы программы, она должна иметь доступ к MySQL Server с базой данных, 
созданной на основе скрипта ниже.
	Если у Вас нет возможности или желания установить MySQL Server, свяжитесь,
пожалуйста со мной по Skype:illyazvyagin , и я открою доступ к моему серверу и 
вышлю настройки для подключения к нему.
 
CREATE DATABASE Kassa;
USE Kassa;
 
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
 
CREATE TABLE all_checks (checknumber INT NOT NULL, check_price DOUBLE, date_ DATE, time_ TIME, seller VARCHAR(30), PRIMARY KEY(checknumber));
 
CREATE TABLE users (user_name VARCHAR(30), password VARCHAR(30), PRIMARY KEY(user_name));
INSERT INTO users VALUES ('ILLIA','123');
INSERT INTO users VALUES ('Vasya','123');
INSERT INTO users VALUES ('User','user');
 
GRANT ALL PRIVILEGES ON Kassa.* TO 'user'@'%' IDENTIFIED BY 'ILLIA' WITH GRANT OPTION;
FLUSH PRIVILEGES;
 
        Описание содержания БД
 
    Таблица "Products" содержит :
- Штрихкод
- Имя товара
- Цена товара
- Остаток товара на складе
Она заполнена 18 продуктами для примера (штрихкоды от 1 до 18).
 
    Таблица "all_checks" служит для хранения списка таких данных чека:
- Номер чека
- Сумма чека
- Дата печати чека*
- Время печати чека*
- Имя учетной записи кассира
* - если произойдет ошибка во время работы программы, то сумма чека будет 
равняться нулю, а время и дата будут временем резервирования записи в таблицы 
для текущего чека
 
    Таблица "users" содержит список учетных записей. При авторизации 
пользователя в системе данные сверяются с этой таблицей. По умолчанию создано 3 
пользователя:
 
    ILLIA - 123
    User - user
    Vasya - 123
 
        Файл конфигурации
    
    Для подключения к БД нужно создать файл "config.txt" с таким содержанием:
 
DBPath=jdbc:mysql://localhost:3306/Kassa
DBLogin=user
DBPassword=ILLIA
 
    Файл "config.txt" должен находиться в той же директории, откуда выолняется 
запуск файла Kassa.jar. Если запуск  программы выполнен из среды разработки, то 
файл конфигурации "config.txt" должен лежать в корне диска d:/. 

        Работа программы

    После запуска программы открывается окно авторизации, где нужно указать имя 
клиента(до 30 символов) и пароль, и нажать "Log in". В тестовой версии программы 
в поле авторизации уже будут введены данные для авторизации.
    После авторизации пользователя открывается основное рабочее окно кассира и 
можно начинать работу.
    Товары вводятся по штрихкоду, либо выполняется поиск по имени товара 
(переключение между режимами выполняется клавишей F8). При поиске по имени будет 
показано дополнительное окно со списком продуктов с похожим именем. Выбор 
продукта из этого списка выполняется двойным кликом мыши, либо клавишами 
вверх/вниз, ввод.
    После удачного поиска товара он добавляется в основной список товаров в виде 
таблицы в основном рабочем окне. Перемещаться по списку товаров чека можно 
мышью, либо клавишами вверх/вниз.
 
    Таблицу товаров чека можно редактировать так:
- установить количество едениц выделенного товара F5
- удалить выделенный товар F6
- удалить все товары F7 
 
    После ввода и редактирования списка товаров чека необходимо нажать кнопку 
"Payment" F2(Оплата) и будет показано окно для ввода суммы наличных покупателя и 
общей суммой чека. Если наличные покупателя введены верно, то при нажатии 
клавиши "Ввод" либо "Print Check" будет выполнено:
- Печать чека
- В таблице "all_checks" будет выполнена запись данных о текущем чеке(в поле 
время будет указано время печати чека)
- В таблице "Products" будут уменьшены остатки товаров из чека
- Копия чека будет записана в фискальный отчет в виде файла 
"Checks_report_index.html"

        Фискальный отчет 

    Фискальный отчет представлен в виде файла "Checks_report_index.html" и будет 
создан при первой печати чека. Данный файл будет хранить в себе копии всех 
чеков, разделенных горизонтальной линией. Его можно открыть любым браузером.
    Файл "Checks_report_index.html" будет создан в той директории, в которй 
запущен файл Kassa.jar. Если запуск  программы выполнен из среды разработки, то 
отчет чеков будет лежать в корне диска d:/.
 
    Для завершения работы программы нужно нажать (F10 либо Escape).
 
    Для управления программой можно использовать как клавиатуру с мышкой, так и 
саму клавиатуру без мышки. В именах всех кнопок указаны дублирующие их 
физические клавиши клавиатуры.
 
 
Звягинцев Илья
buster28@ya.ru