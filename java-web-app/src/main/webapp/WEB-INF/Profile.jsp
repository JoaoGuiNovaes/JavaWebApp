<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/Profile.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Perfil</title>
</head>
<body>
    <header>
        <a href="Home"><img src="Imagens/home.png" alt="home" id="home"></a>
        <img src="Imagens/braG.png" alt="logo" id="logo">
        <a href="Profile"><img src="Imagens/perfil.png" alt="user" id="user"></a>
    </header>
    <main>
        <br><br>
        <div class="container-xl px-8 mt-8 card2">
            <div class="row">
                <div class="col-xl-12 ">
                    <!-- Account details card-->
                    <div class="card mb-6 ">
                        <div class="card-header">Meu Perfil</div>
                        <div class="card-body">
                            <form action="Profile" method="post">
                                <!-- Form Group (username)-->

                                <input type="hidden" id="id_endereco" name="id_endereco"  value="${endereco.id}" >

                                <div class="mb-3">
                                    <label class="small mb-1" for="nome">Nome </label>
                                    <input class="form-control" id="nome" name="nome" type="text" placeholder="Digite seu nome" value="${usuario.nome}">
                                </div>
                                <!-- Form Group (email address)-->
                                <div class="mb-3">
                                    <label class="small mb-1" for="email">E-mail</label>

                                    <input class="form-control" id="email" name="email" type="email" placeholder="Digite seu email" value="${usuario.email}">
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="endereco">CEP</label>
                                    <input class="form-control" id="cep" name="cep" type="text" placeholder="Digite seu CEP" value="${endereco.cep}">
                                </div>
                                <div class="row gx-3 mb-3">
                                    <div class="col-md-8">
                                        <label class="small mb-1" for="endereco">Endereço</label>
                                        <input class="form-control" id="endereco" name="endereco" type="text" placeholder="Digite seu endereço" value="${endereco.endereco}">
                                    </div>
                                    <div class="col-md-4">
                                        <label class="small mb-1" for="numero">Número</label>
                                        <input class="form-control" id="numero" name="numero" type="text" placeholder="Ex: 123" value="${endereco.numero}">
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="complemento">Complemento</label>
                                    <input class="form-control" id="complemento" type="text" name="complemento" placeholder="Ex: Apto 12" value="${endereco.complemento}">
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="bairro">Bairro</label>
                                    <input class="form-control" id="bairro" type="text" name="bairro" placeholder="Digite seu bairro" value="${endereco.bairro}">
                                </div>
                                <div class="row gx-3 mb-3">
                                    <div class="col-md-6">
                                        <label class="small mb-1" for="estado">Estado</label>
                                        <input class="form-control" id="estado" name="estado" type="text" placeholder="Digite seu estado" value="${endereco.estado}">
                                    </div>
                                    <div class="col-md-6">
                                        <label class="small mb-1" for="cidade">Cidade</label>
                                        <input class="form-control" id="cidade" name="cidade" type="text" placeholder="Digite sua cidade" value="${endereco.cidade}">
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="pontoReferencia">Ponto de Referência</label>
                                    <input class="form-control" id="pontoReferencia" name="pontoReferencia" type="text" value="${endereco.pontoReferencia}">
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="data_nascimento">Data de Nascimento</label>
                                    <input class="form-control" id="data_nascimento" name="datanascimento" type="date" value="${usuario.dataNascimento}">
                                </div>
                                <!-- Save changes button-->
                                <button class="btn btn-primary" type="submit">Salvar Alterações</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
    </main>
    <footer>
        <div class="div-footer">
            <a href="https://www.instagram.com/"><img class="footer-image" src="Imagens/instagram.png" alt="instagram"></a>
            <a href="https://www.facebook.com/"><img class="footer-image" src="Imagens/facebook.png" alt="facebook"></a>
            <a href="https://web.whatsapp.com/"><img class="footer-image" src="Imagens/whatsapp.png" alt="whatsapp"></a>
        </div>
        <div class="footer-description">Central de Atendimento </br> atendimento@nossosite.com </br> 00-00000-0000
        </div>
    </footer>
</body>
</html>