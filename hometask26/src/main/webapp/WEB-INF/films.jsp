
<%@ page import="com.servlet.dto.Film, com.servlet.service.DataFilmService"%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>MY films JSP</title>
</head>
<body>
<h1 style="background-color: beige">Add new film</h1>
<form method="post" action="/">
    <input type="text" name="title" placeholder="Title">
    <input type="text" name="description" placeholder="Description">
    <input type="number" name="year" placeholder="Year"><br><br>
    Watched: <input type="checkbox" name="watched"><br><br>
    <input type="submit" value="save" style="background-color: lightgreen">
</form>
<hr>
<ul>
<c:forEach items="${films}" var="film">

    <li>
        ${film.title}
            --- <a href="<c:url value="/update?id=${film.id}"> </c:url>"> Update </a>
            --- <a href="<c:url value="/delete?id=${film.id}"> </c:url>"> Delete </a>
    </li>

</c:forEach>
</ul>


<%--<ul>--%>
<%--    <%--%>
<%--            List<Film> films = DataFilmService.getFilms();--%>
<%--        for (var film : films) {--%>
<%--    %>--%>
<%--    <li>--%>
<%--        <%=film.getName()%>--%>
<%--        <a href="">Edit</a>--%>
<%--        <a href="">Delite</a>--%>
<%--    </li>--%>
<%--    <%}%>--%>
<%--</ul>--%>
</body>
</html>
