<jsp:useBean id="events" scope="request" type="java.util.List<pl.sda.sapiens.ep.model.entity.EventEntity>"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Lista wydarzeń</title>
</head>
<body>
<h1>Obecnie jest ${events.size()}</h1>
</body>
</html>