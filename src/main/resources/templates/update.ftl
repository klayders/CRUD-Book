<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Добавление книги</title>
</head>
<body>
<form name="messages" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Id"  type ="number" name="id" value="${messages.id}">
    <p>Название книги</p>
    <input title="Name" type ="text" name="title" value="${messages.title}">
    <p>Описание</p>
    <input title="description" type ="text" name="description" value="${messages.description}">
    <p>Автор</p>
    <input title="author" type ="text" name="author" value="${messages.author}">
    <p>isbn</p>
    <input title="isbn" type ="number" name="isbn" value="${messages.isbn}">
    <p>Год издания</p>
    <input title="printYear" type ="number" name="printYear" value="${messages.printYear}">

    <p>Статус книги</p>
    <input type="radio"  name="readAlready" value="true">True
    <input type="radio"  name="readAlready" value="false" checked>False
    <br>
    <br>

    <input type="submit" value="Редактировать">


</form>
</body>
</html>