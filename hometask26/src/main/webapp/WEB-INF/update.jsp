<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update film</title>
</head>
<body>
<form action="/update" method="post">

    <input name="id" type="hidden" value="${film.id}">
    Title: <input type="text" name="title" value="${film.title}"><br>
    Description:  <input type="text" name="description" value="${film.description}"><br>
    Year: <input type="number" name="year" value="${film.year}"><br>
    Watched: <input type="checkbox" name="watched" value="${film.watched}">
    <input type="submit" value="update">

</form>
</body>
</html>
