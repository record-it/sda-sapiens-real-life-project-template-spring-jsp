<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Dodaj wydarzenie</title>
</head>
<body>
    <h1>Dodaj wydarzenie</h1>
    <form action="${pageContext.request.contextPath}/event/add" method="post">
        <label for="title">Tytuł</label>
        <input type="text" name="title" id="title"/>
        <label for="description">Opis</label>
        <input type="text" name="description" id="description"/>
        <label for="start">Data i czas rozpoczęcia</label>
        <input type="datetime-local" name="start" id="start"/>
        <label for="end">Data i czas zakończenia</label>
        <input type="datetime-local" name="end" id="end"/>
        <label for="tags">Tagi</label>
        <input type="text" name="tags" id="tags"/>
        <button type="submit">Zapisz</button>
    </form>
</body>
</html>