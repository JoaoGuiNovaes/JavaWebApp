<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Obra Go</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='styles/Home.css'>
    <link rel="icon" href="Imagens/icon.png" type="image/x-icon">
    
</head>
<body>
    
    <header>
        <img class="header-logo" src="Imagens/braG.png" alt="Logo">
        <div class="dropdown">
            <button class="dropbtn">Departamentos</button>
            <div class="dropdown-content">
                <a href="#">Materiais de Construção</a>
                <a href="#">Materiais Hidráulicos</a>
                <a href="#">Tintas e Acessórios</a>
                <a href="#">Ferragens</a>
                <a href="#">Materiais Elétricos</a>
                <a href="#">Ferramentas</a>
                <a href="#">Pisos e Revestimentos</a>
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
                    <div class="grid-description">Cimento CP-II-32 50kg Nacional</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
    
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/massahome.png" alt="massa" id="produto">
                    </div>
                    <div class="grid-description">Voto Massa Pronta 20kg</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/telhacomfibrahome.png" alt="telhacomfibra" id="produto">
                    </div>
                    <div class="grid-description">Tela Confibra Ondulada de Fibrocimento</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/rejuntehome.png" alt="rejunte" id="produto">
                    </div>
                    <div class="grid-description">Rejunte Flexível Branco 1Kg Fortaleza</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/colunahome.png" alt="coluna" id="produto">
                    </div>
                    <div class="grid-description">Descrição do produto 2</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/tijolohome.png" alt="tijolo" id="produto">
                    </div>
                    <div class="grid-description">Coluna Armada 3/8" - 0,09 x 0,15 cm 4 ferros</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/telhahome.png" alt="telha" id="produto">
                    </div>
                    <div class="grid-description">Tijolo em Sco com 10 peças</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
                </div>
                <div class="grid-item">
                    <div class="image-container">
                        <img class="grid-image" src="Imagens/argamassahome.png" alt="argamassa" id="produto">
                    </div>
                    <div class="grid-description"> Argamassa Polimérica Biomassa 0,3 Kg</div>
                    <div class="grid-value"><strong>R$29,00</strong></div>
                    <button class="grid-button"><a href="Carrinho">Comprar</a></button>
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
        <div class="footer-description">Central de Atendimento </br> atendimento@nossosite.com </br> 00-00000-0000
        </div>
    </footer>
</body>

</html>
