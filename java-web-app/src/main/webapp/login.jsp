<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<!DOCTYPE html>
	<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<link rel="stylesheet" href="styles/login.css">
	</head>

	<body>
		<header>
			<img src="Imagens/ObraGo2.jpeg" class="logo" alt="Logo" />
		</header>

		<main>
			<div class="card">
				<div class="baseflex">
					<h1>Login</h1>
					<img src="Imagens/login.png" class="icon2" alt="Icon de Login" />
				</div>

				<c:if test="${erros != null}">
					<h2>Erros no formulário</h2>
						<ul>
							<c:forEach var="erro" items="${erros}">
								<li>${erro}</li>
							</c:forEach>
						</ul>
				</c:if>

				<form action="login" method="post">
					<div class="campotexto">
						<label for="email">Email</label>
						<div class="input-group baseflex">
							<img class="icon" src="Imagens/email.svg" alt="">
							<input type="email" name="email" placeholder="Digite seu email" value="${email}" />
						</div>
					</div>
					<div class="campotexto">
						<label for="senha">Senha</label>
						<div class="input-group baseflex">
							<img class="icon" src="Imagens/lock.svg" alt="">
							<input type="password" name="senha" placeholder="Digite sua senha" value="${senha}">
						</div>
					</div>

					<button class="btn">Esqueceu a senha?</button>

					<button class="btn2">Entrar</button>

					<p>Ainda não tem uma conta?</p>
					<button class="btn2"><a href="cadastro.jsp">Criar conta</a></button>
				</form>
			</div>
		</main>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
		<script src="scripts.js"></script>
	</body>

	</html>