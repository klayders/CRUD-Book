CREATE TABLE list_books
(
  id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  author varchar(255),
  description varchar(255),
  isbn int(11),
  print_year int(11),
  read_already bit(1),
  title varchar(255) )
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 1
    , "Страх и отвращение в Лас-Вегасе"
    , "Роман в стиле гонзо-журналистики"
    , "Хантер Томпсон"
    , 1
    , 1971
    , FALSE);

INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 2
    , "Таинственная история Билли Миллигана"
    , "Художественный биографический роман"
    , "Дэниэл Киз"
    , 2
    , 1981
    , TRUE);

INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 3
    , "1984"
    , "Роман-антиутопия"
    , "Джордж Оруэлл"
    , 3
    , 1949
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 4
    , "Скотный двор"
    , "Сатирическая повесть-притча"
    , "Джордж Оруэлл"
    , 4
    , 1945
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 5
    , "451 градус по Фаренгейту"
    , "Научно-фантастический роман"
    , "Рэй Брэдбери"
    , 5
    , 1953
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 6
    , "Миф о Сизифе"
    , "Философское эссе"
    , "Альбер Камю"
    , 6
    , 1942
    , FALSE);

INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 7
    , "Посторонний"
    , "Повесть"
    , "Альбер Камю"
    , 7
    , 1942
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 8
    , "Архетипы, управляющие жизнью мужчин"
    , "Аналитическая психология"
    , "Джин Шинода Боллен"
    , 8
    , 1989
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 9
    , "Почему мы не нужны будущему?"
    , "Эссе"
    , "Билл Джой"
    , 9
    , 2000
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 10
    , "Машины созидания"
    , "Научная публицистика"
    , "Эрик Дрекслер"
    , 2
    , 1986
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 11
    , "Бессоница"
    , "Роман"
    , "Стивен Кинг"
    , 11
    , 1994
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 12
    , "Атлант расправил плечи"
    , "Роман-антиутопия"
    , "Айн Рэнд"
    , 12
    , 1957
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 13
    , "Добродетель эгоизма"
    , "Эссе"
    , "Айн Рэнд"
    , 13
    , 1964
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 14
    , "Generation П"
    , "Пост-модернисткий роман"
    , "Виктор Пелевин"
    , 14
    , 1999
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 15
    , "SNUFF"
    , "Роман"
    , "Виктор Пелевин"
    , 15
    , 2011
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 16
    , "Моби Дик"
    , "Роман"
    , "Герман Мелвилл"
    , 16
    , 1851
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 17
    , "Чапаев и Пустота"
    , "Роман"
    , "Виктор Пелевин"
    , 2
    , 1996
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 18
    , "Бойцовский клуб"
    , "Контркультурный роман"
    , "Чак Паланик"
    , 18
    , 1996
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 19
    , "Критика чистого разума"
    , "Документальная проза"
    , "Иммануил Кант"
    , 19
    , 1781
    , FALSE);

INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 20
    , "Под тенью Сатурна"
    , "Публицистика"
    , "Джеймс Холлис"
    , 20
    , 2012
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 21
    , "В поисках избавления"
    , "Публицистика"
    , "Джеймс Холлис"
    , 21
    , 2015
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 22
    , "Архетипы и коллективное бессознательное"
    , "Аналитическая психология"
    , "Карл Юнг"
    , 2
    , 1969
    , FALSE);


INSERT INTO list_books (id, title, description, author, isbn, print_year, read_already)
VALUES
  ( 23
    , "Недовольство культурой"
    , "Политическая философия"
    , "Зигмунд Фрейд"
    , 23
    , 1930
    , FALSE)