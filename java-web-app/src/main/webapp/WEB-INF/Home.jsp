<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>
        <fmt:message key="home.title" />
    </title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='styles/Home.css'>
    <link rel="icon" href="Imagens/icon.png" type="image/x-icon">
    
</head>
<body>
    
    <header>
        <img class="header-logo" src="Imagens/braG.png" alt="Logo">
        <div class="dropdown">
            <button class="dropbtn"><fmt:message key="home.dropdown1" /></button>
            <div class="dropdown-content">
                <a href="#"><fmt:message key="home.dropdown2" /></a>
                <a href="#"><fmt:message key="home.dropdown3" /></a>
                <a href="#"><fmt:message key="home.dropdown4" /></a>
                <a href="#"><fmt:message key="home.dropdown5" /></a>
                <a href="#"><fmt:message key="home.dropdown6" /></a>
                <a href="#"><fmt:message key="home.dropdown7" /></a>
                <a href="#"><fmt:message key="home.dropdown8" /></a>
            </div>
        </div> 
        <div id="divBusca">
            <input type="text" id="txtBusca" placeholder="O que você está procurando?"/>
            <img src="Imagens/lupa.png" id="btnBusca" alt="Buscar"/>
          </div>
        <div class="header-icons">
            <a href="Carrinho"><img src="Imagens/carrinho.png" alt="carrinho" id="carrinho"></a>
            <img src="Imagens/perfil.png" alt="usuario" id="usuario">
        </div>
    </header>
    <main>
        <div class="grid-wrapper">
            <div class="grid-container">
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/cimentohome.png" alt="cimento" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct1" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
    
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/massahome.png" alt="massa" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct2" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/telhacomfibrahome.png" alt="telhacomfibra" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct3" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/rejuntehome.png" alt="rejunte" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct4" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/colunahome.png" alt="coluna" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct5" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/tijolohome.png" alt="tijolo" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct6" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/telhahome.png" alt="telha" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct7" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/argamassahome.png" alt="argamassa" id="produto">
                    </div>
                    <div class="grid-description"><fmt:message key="home.nameProduct8" /></div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho"><fmt:message key="home.buttonPurchase" /></a></button>
                </div>
            </div>
        </div>
    </main>
    <footer>
        <div class="div-footer">
            <a href="https://www.instagram.com/"><img class="footer-image" src="Imagens/instagram.png" alt="instagram"></a>
            <a href="https://www.facebook.com/"><img class="footer-image" src="Imagens/facebook.png" alt="facebook"></a>
            <a href="https://web.whatsapp.com/"><img class="footer-image" src="Imagens/whatsapp.png" alt="whatsapp"></a>
        </div>
        <div class="footer-description"><fmt:message key="home.callCenter" /></br><fmt:message key="home.emailService" /></br><fmt:message key="home.location" />
        </div>
    </footer>
</body>

</html>
