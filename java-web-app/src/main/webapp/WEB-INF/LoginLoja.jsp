<%@ page language="java" contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

            <!DOCTYPE html>
            <html lang="pt-br">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/css/bootstrap.min.css" rel="stylesheet">
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                <link href="https://fonts.googleapis.com/css2?family=Anton&family=Pangolin&display=swap"
                    rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
                    crossorigin="anonymous">
                <link rel="stylesheet" href="styles/loginLoja.css">

                <title>
                    <fmt:message key="loginLoja.title" />
                </title>
            </head>

            <body>
                <main>
                    <div class="esquerda">

                        <img class="logo" src="Imagens/logonova.png" alt="Logo">
                    </div>
                    <div class="direita">
                        <div class="card container mt-5">
                            <div class="container titulo">
                                <h1>
                                    <fmt:message key="loginLoja.title" />
                                </h1>
                                <img class="iconlogin" src="Imagens/login.png" alt="Imagem de login">
                            </div>
                            <p>${errorLoginLoja}</p>
                            <c:if test="${violations != null}">
                                <h3>
                                    <fmt:message key="loginLoja.message" />
                                    </h2>
                                    <ul>
                                        <c:forEach var="violation" items="${violations}">
                                            <li>${violation.message}</li>
                                        </c:forEach>
                                    </ul>
                            </c:if>
                            <form action="LoginLoja" method="post">
                                <label for="email" class="form-label">
                                    <fmt:message key="loginLoja.email" />
                                </label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/email.svg" alt="">
                                    <input type="email" id="email" name="email" class="form-control"
                                        placeholder="Digite seu E-mail" value="${email}">
                                </div>
                                <label for="senha" class="form-label">
                                    <fmt:message key="loginLoja.password" />
                                </label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/lock.svg" alt="">
                                    <input type="password" id="senha" name="senha" class="form-control"
                                        placeholder="Digite sua senha" value="${senha}">
                                </div>
                                <div class="divbutton">
                                    <button type="submit" class="btn btn-dark">
                                        <fmt:message key="loginLoja.button" />
                                    </button>
                                    <div class="aindanao">
                                        <strong class="ainda redefinir">
                                            <fmt:message key="loginLoja.redefine" />
                                        </strong>
                                        <a href="Redefinir"><button type="button" class="btn btn-light criar ">
                                                <fmt:message key="loginLoja.buttonRedefine" />
                                            </button></a>
                                    </div>
                                </div>
                                <div class="aindanao">
                                    <strong class="ainda">
                                        <fmt:message key="loginLoja.notAccount" />
                                    </strong>
                                    <a href="CadastroLoja"><button type="button" class="btn btn-dark criar">
                                            <fmt:message key="loginLoja.buttonCreateAccount" />
                                        </button></a>
                                </div>
                            </form>
                        </div>
                    </div>
                </main>
            </body>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
                crossorigin="anonymous"></script>
            <script src="scripts/scriptLoginLoja.js"></script>
            </body>
            </html>