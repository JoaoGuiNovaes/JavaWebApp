<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>
      <fmt:message key="cart.title" />
    </title>
    <link rel="icon" href="Imagens/icon.png" type="image/x-icon">
    <link rel="stylesheet"  href="styles/Carrinho.css" />
    <link
      href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <header>
      <a href="Home"><img src="Imagens/home.png" alt="home" id="home"></a>
        <img class="header-logo" src="Imagens/braG.png" alt="logo" id="logo">
       <a href="Profile"><img src="Imagens/perfil.png" alt="user" id="user"></a> 
      </header>
      <div class="progress-bar">
        <div class="step">
            <div class="step-text"><strong><fmt:message key="cart.progress1" /></strong></div>
            <div class="line"></div>
        </div>
        <div class="step">
            <div class="step-text"><fmt:message key="cart.progress2" /></div>
            <div class="line"></div>
        </div>
        <div class="step">
            <div class="step-text"><fmt:message key="cart.progress3" /></div>
        </div>
        <hr>
    </div>
    <main>
      <div class="titulo">
        <img src="Imagens/icons8-carrinho-80.png" alt="carrinho">
        <h1><fmt:message key="cart.title" /></h1>
      </div>
      <hr>
      <div class="content">
        <section>
          <table>
            <thead>
              <tr>
                <th><strong><fmt:message key="cart.product" /></strong> </th>
                <th><strong><fmt:message key="cart.amount" /></strong></th>
                <th><strong><fmt:message key="cart.value" /></strong></th>
                
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>
                  <div class="product">
                    <div class="sombra">
                    <img src="Imagens/sacotijolo.jpg" alt="img" />
                    </div>
                    <div class="info">
                      <div class="name"> <strong><fmt:message key="cart.nameProduct1" /></strong></div>

                    </div>
                  </div>
                </td>
                
                <td>
                  <div class="qty">
                    <button><i class="bx bx-minus"></i></button>
                    <span>1</span>
                    <button><i class="bx bx-plus"></i></button>
                  </div>
                  <td><strong>R$ 10,00</strong></td>
                </td>
        
                <td>
                  <button class="remove"><i class="bx bx-x"></i></button>
                </td>
              </tr>
              <tr>
                <td>
                  <div class="product">
                    <div class="sombra">
                    <img src="Imagens/argamassa.jpg" alt="img" />
                    </div>
                    <div class="info">
                      <div class="name"><strong><fmt:message key="cart.nameProduct2" /></strong></div>

                    </div>
                  </div>
                </td>
                
                <td>
                  <div class="qty">
                    <button><i class="bx bx-minus"></i></button>
                    <span>1</span>
                    <button><i class="bx bx-plus"></i></button>
                  </div>
                  <td><strong>R$ 20,00</strong></td>
                </td>

                <td>
                  <button class="remove"><i class="bx bx-x"></i></button>
                </td>
              </tr>

              
            </tbody>
          </table>
        </section>

      </div>
      <hr>
      <br>
      <div class="calcular-frete">
            <p>
              <strong><fmt:message key="cart.freight" /></strong>
                <input type="text" name="cep" placeholder="00000-000" size="9" maxlength="9">
                <button type="submit" class="btn-frete" ><fmt:message key="cart.calculateFreight" /></button>
            </p>
      </div>
<br>
      <div class="baixo">
        <div class="frete">
          <div class="cor-baixo">
            <p><strong><fmt:message key="cart.freightSubtotal" /></strong></p>
          </div>
            <div class="valor-frete">
               <p><strong> R$ 10,00</strong></p> 
            </div>
          </div> 
        <br>
        
        <div class="valor-total">
          <div class="cor-baixo">
            <p><strong><fmt:message key="cart.totalAmount" /></strong></p>
            </div>
            <div class="total">
                <p><strong> R$ 40,00</strong></p> 
            </div>
        </div> 
        </div>
        <br>
        <div class="ultimalinha">
          <div class="continue">
            <a href="Home" class="link"><p><i><fmt:message key="cart.buttonContinue" /></i></p></a>
        
        </div>
        <div class="button">
          <a href="FinalizarCompra">
            <button type="submit" class="btn-comprar"><fmt:message key="cart.buttonPurchase" /></button>
          </a>
        </div>  
      </div>
        <br>
        <br>
    </main>
    <footer>
      <div class="div-footer">
          <a href="https://www.instagram.com/"><img class="footer-image" src="Imagens/instagram.png" alt="instagram"></a>
          <a href="https://www.facebook.com/"><img class="footer-image" src="Imagens/facebook.png" alt="facebook"></a>
          <a href="https://web.whatsapp.com/"><img class="footer-image" src="Imagens/whatsapp.png" alt="whatsapp"></a>
      </div>
      <div class="footer-description"><fmt:message key="cart.callCenter" /></br><fmt:message key="cart.emailService" /></br><fmt:message key="cart.location" />
      </div>
  </footer>
  </body>
</html>