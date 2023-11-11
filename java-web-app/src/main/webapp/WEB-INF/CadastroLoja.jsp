
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
                <link rel="stylesheet" href="styles/cadastroloja.css">

                <title>
                    Cadastro de Loja
                </title>
            </head>

            <body>
                <main>
                    <div class="esquerda">

                        <img class="logo" src="Imagens/logonova.png" alt="Logo">
                    </div>
                    <div class="direita">
                        <div class="card container mt-5">
                            <h1>
                                Cadastro de Loja
                            </h1>
                            <c:if test="${violations != null}">
                                <h3>
                                    Erros
                                    </h2>
                                    <ul>
                                        <c:forEach var="violation" items="${violations}">
                                            <li>${violation.propertyPath} ${violation.message}</li>
                                        </c:forEach>
                                    </ul>
                            </c:if>
                            <form action="CadastroLoja" method="post" id="form1">
                                <label for="nome" class="form-label">Nome fantasia</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/nome.svg" alt="">
                                    <input type="text" id="nome" name="nomeFantasia" class="form-control"
                                        placeholder="Digite seu nome" value="${nomefantasia}">
                                </div>
                                <label for="nome" class="form-label">Razão Social</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/nome.svg" alt="">
                                    <input type="text" id="razaoSocial" name="razaoSocial" class="form-control"
                                        placeholder="Digite sua razão social" value="${razaoSocial}">
                                </div>
                                <label for="email" class="form-label">E-mail</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/email.svg" alt="">
                                    <input type="text" id="email" name="email" class="form-control"
                                        placeholder="Digite seu E-mail" value="${email}">
                                </div>
                                <label for="cnpj" class="form-label">CNPJ</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/email.svg" alt="">
                                    <input type="text" id="cnpj" name="cnpj" class="form-control"
                                        placeholder="Digite seu CNPJ" value="${cnpj}">
                                </div>
                                <label for="senha" class="form-label">Senha</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/lock.svg" alt="">
                                    <input type="password" id="senha" name="senha" class="form-control"
                                        placeholder="Digite sua senha" value="${senha}">
                                </div>
                                <label for="confirmar_senha" class="form-label">Confirmar senha</label>
                                <div class="input-group">
                                    <img class="icon" src="Imagens/lock.svg" alt="">
                                    <input type="password" id="confirmarSenha" name="confirmarSenha"
                                        class="form-control" placeholder="Confirme sua senha" value="${confirmarSenha}">
                                </div>
    
                                <div class="divbutton">
                                   
                                    <button type="submit" class="btn btn-dark">Cadastrar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </main>
            </body>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
                crossorigin="anonymous"></script>
            <script src="scripts.js"></script>
            </body>

            </html>