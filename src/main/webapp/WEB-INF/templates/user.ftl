<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Аккаунт пользователя</title>
</head>

<body>

Аккаунт пользователя
<br><br>

<a href="/"><button type="submit" >Главная</button></a>

<br>
<br>

<form method="post" action="/logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">Выход</button>
</form>

</body>
</html>