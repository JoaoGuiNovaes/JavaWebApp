<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

		<!DOCTYPE html>
		<html lang="en">

		<head>
			<meta charset="UTF-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<title>
				<fmt:message key="login.title" />
			</title>
			<link rel="stylesheet" href="styles/login.css">
		</head>

		<body>
			<header>
				<img src="Imagens/ObraGo2.jpeg" class="logo" alt="Logo" />
			</header>

			<main>
				<div class="card">
					<div class="baseflex">
						<h1>
							<fmt:message key="login.title" />
						</h1>
						<img src="Imagens/login.png" class="icon2" alt="Icon de Login" />
					</div>

					<c:if test="${violations != null}">
						<h3>
							<fmt:message key="login.message" />
						</h3>
						<ul>
							<c:forEach var="violation" items="${violations}">
								<li>${violation.propertyPath} ${violation.message}</li>
							</c:forEach>
						</ul>
					</c:if>

					<form action="Login" method="post">
						<div class="campotexto">
							<label for="email"><fmt:message key="login.email" /></label>
							<div class="input-group baseflex">
								<img class="icon" src="Imagens/email.svg" alt="">
								<input type="email" name="email" placeholder="Digite seu email" value="${email}" />
							</div>
						</div>
						<div class="campotexto">
							<label for="senha"><fmt:message key="login.password" /></label>
							<div class="input-group baseflex">
								<img class="icon" src="Imagens/lock.svg" alt="">
								<input type="password" name="senha" placeholder="Digite sua senha" value="${senha}">
							</div>
						</div>

						<button class="btn"><fmt:message key="login.buttonForgotPassword" /></button>

						<button class="btn2"><fmt:message key="login.button" /></button>

						<p><fmt:message key="login.notAccount" /></p>
						<button class="btn2"><a href="Cadastro.jsp"><fmt:message key="login.buttonCreateAccount" /></a></button>
					</form>
				</div>
			</main>

			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
				crossorigin="anonymous"></script>
			<script src="scripts.js"></script>
		</body>

		</html>