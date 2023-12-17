<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>
        <fmt:message key="finalizePurchase.title" />
    </title>
    <link rel="icon" href="Imagens/icon.png" type="image/x-icon">
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='styles/finalizarCompra.css'>
</head>

<body>
    <header>
        <a href="Home"><img src="Imagens/home.png" alt="home" id="home"></a>
        <img src="Imagens/braG.png" alt="logo" id="logo">
        <a href="Profile"><img src="Imagens/perfil.png" alt="user" id="user"></a>
    </header>
    <div class="barra-progresso">
        <div class="step">
            <div class="step-text"><fmt:message key="finalizePurchase.progress1" /></div>
            <div class="linha"></div>
        </div>
        <div class="step">
            <div class="step-text"><strong><fmt:message key="finalizePurchase.progress2" /></strong></div>
            <div class="linha"></div>
        </div>
        <div class="step">
            <div class="step-text"><fmt:message key="finalizePurchase.progress3" /></div>
        </div>
    </div>
    <main>
        <div class="titulo">
            <img src="Imagens/icons8-carrinho-80.png" alt="carrinho">
            <h1><fmt:message key="finalizePurchase.title" /></h1>
        </div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th><fmt:message key="finalizePurchase.product" /></th>
                        <th><fmt:message key="finalizePurchase.amount" /></th>
                        <th><fmt:message key="finalizePurchase.value" /></th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="tr-items">
                        <td class="td-img"><img src="Imagens/tijolo.png" alt="tijolo" id="tijolo"></td>
                        <td><strong><fmt:message key="finalizePurchase.nameProduct1" /></strong></td>
                        <td><strong>1</strong></td>
                        <td><strong>R$ 10,00</strong></td>
                    </tr>
                    <hr>
                    <tr class="tr-items">
                        <td class="td-img"><img src="Imagens/argamassa.png" alt="argamassa" id="argamassa"></td>
                        <td><strong><fmt:message key="finalizePurchase.nameProduct2" /></strong></td>
                        <td><strong>1</strong></td>
                        <td><strong>R$ 20,00</strong></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <hr>
        <div class="pagamento">
            <p><strong><fmt:message key="finalizePurchase.paymentMethod" /></strong></p>
            <select name="pagamento" id="pagamento">
                <option value="vazio"><fmt:message key="finalizePurchase.select" /></option>
                <option value="cartao-credito"><fmt:message key="finalizePurchase.creditCard" /></option>
                <option value="cartao-debito"><fmt:message key="finalizePurchase.debitCard" /></option>
            </select>
        </div>
        <br><br>
        <hr>
        <div class="detalhe-pagamento">
            <div class="detalhes-esquerda">
                <p><strong><fmt:message key="finalizePurchase.paymentDetails" /></strong></strong></p>
            </div>
            <div class="detalhes-direita">
                <div class="frete">
                    <p><strong><fmt:message key="finalizePurchase.freightSubtotal" /></strong></p>
                    <div class="valor-frete">
                        <p class="preco"><strong>R$ 10,00</strong></p>
                    </div>
                </div>
                <div class="subtotal-produto">
                    <p><strong><fmt:message key="finalizePurchase.subtotalProduct" /></strong></p>
                    <div class="valor-produto">
                        <p class="preco"><strong>R$ 30,00</strong></p>
                    </div>
                </div>
                <div class="valor-total">
                    <p><strong><fmt:message key="finalizePurchase.totalAmount" /></strong></p>
                    <div class="total">
                        <p class="preco"><strong>R$ 40,00</strong></p>
                    </div>
                </div>
                <div>
                    <button type="submit" class="finalizar"><fmt:message key="finalizePurchase.finalize" /></button>
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
        <div class="footer-description"><fmt:message key="finalizePurchase.callCenter" /></br> <fmt:message key="finalizePurchase.emailService" /></br><fmt:message key="finalizePurchase.location" />
        </div>
    </footer>
</body>


</html>
