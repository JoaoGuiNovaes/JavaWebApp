<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="contato.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        <fmt:message key="contato.title" />
    </title>
    <style>
        input, label, textarea, button {
            display: block;
        }
    </style>
</head>
<body>
    <h1>
        <fmt:message key="contato.title" />
    </h1>
    <c:if test="${erros != null}">
        <h2>
            <fmt:message key="contato.message" />
        </h2>
        <ul>
            <c:forEach var="erro" items="${erros}">
                <li>${erro}</li>
            </c:forEach>
        </ul>
    </c:if>
    <p>
        <fmt:message key="contato.contact" />
    </p>
    <form action="contato" method="post">
        <label for="nome"><fmt:message key="contato.name" /></label>
        <input type="text" name="nome" id="nome" value="${contatoForm.nome}">

        <label for="email"><fmt:message key="contato.email" /></label>
        <input type="email" name="email" id="email" value="${contatoForm.email}">

        <label for="mensagem"><fmt:message key="contato.textMessage" /></label>
        <textarea name="mensagem"></textarea>

        <button type="submit"><fmt:message key="contato.button" /></button>
    </form>

</body>
</html>