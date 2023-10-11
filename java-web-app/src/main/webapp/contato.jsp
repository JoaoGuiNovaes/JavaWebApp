<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="contato.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contato</title>
    <style>
        input, label, textarea, button {
            display: block;
        }
    </style>
</head>
<body>
    <h1>Contato</h1>
    <c:if test="${erros != null}">
        <h2>Erros no formulário</h2>
        <ul>
            <c:forEach var="erro" items="${erros}">
                <li>${erro}</li>
            </c:forEach>
        </ul>
    </c:if>
    <p>Entre em contato</p>
    <form action="contato" method="post">
        <label for="nome">Nome</label>
        <input type="text" name="nome" id="nome" value="{nome}">

        <label for="email">E-mail</label>
        <input type="email" name="email" id="email" value="${email}">

        <label for="mensagem">Mensagem</label>
        <textarea name="mensagem"></textarea>

        <button type="submit">Enviar</button>
    </form>

</body>
</html>