<jsp:useBean id="events" scope="request" type="java.util.List<pl.sda.sapiens.ep.model.entity.EventEntity>"/>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="head.jspf"%>
    <title>Lista wydarzeń</title>
</head>
<body>
<div>
    <h1 class="display-3">Lista bieżących wydarzeń</h1>
    <div>
        <table class="table">
            <thead>
            <tr>
                <th>
                    Tytuł
                </th>
                <th>
                    Data rozpoczęcia
                </th>
                <th>
                    Data zakończenia
                </th>
                <th>
                    Skrót opisu
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="event" items="${events}">
                <tr>
                    <td>
                        ${event.title}
                    </td>
                    <td>
                        ${event.start}
                    </td>
                    <td>
                        ${event.end}
                    </td>
                    <td>
                        ${event.description}
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>