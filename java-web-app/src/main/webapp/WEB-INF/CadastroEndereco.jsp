
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Cadastrar Produtos</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='styles/CadastroProduto.css'>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>

<body>
    <header>
        <a href="Home"><img src="Imagens/home.png" alt="home" id="home"></a>
        <img src="Imagens/braG.png" alt="logo" id="logo">
        <a href="Profile"><img src="Imagens/perfil.png" alt="user" id="user"></a>
    </header>
    <main>
        <form class="form-horizontal" method="post" action="CadastroEndereco">
            <fieldset>
            <div class="panel panel-primary">
                <div class="panel-heading">Cadastro de Endereço</div>
                
                <div class="panel-body">
            <div class="form-group">
            <div class="col-md-11 control-label">
                    <p class="help-block"><h11>*</h11> Campo Obrigatório </p>
            </div>
            <c:if test="${violations != null}">
              <h3>
                  <fmt:message key="registration.message" />
                  </h2>
                  <ul>
                      <c:forEach var="violation" items="${violations}">
                          <li>${violation.propertyPath} ${violation.message}</li>
                      </c:forEach>
                  </ul>
          </c:if>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-2 control-label" for="cep">cep <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="cep" name="cep" placeholder="Digite o cep do produto" class="form-control input-md" required="" type="text">
              </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-2 control-label" for="endereco">Endereço <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="endereco" name="endereco" placeholder="Digite o nome do endereço" class="form-control input-md" required="" type="text">
              </div>
            </div>

            <div class="form-group">
              <label class="col-md-2 control-label" for="numero">Número <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="numero" name="numero" placeholder="Digite o número" class="form-control input-md" required="" type="text">
              </div>
            </div>

            <div class="form-group">
                <label class="col-md-2 control-label" for="complemento">complemento <h11>*</h11></label>  
                <div class="col-md-8">
                <input id="complemento" name="complemento" placeholder="complemento" class="form-control input-md" required="" type="text">
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-2 control-label" for="bairro">Bairro <h11>*</h11></label>  
                <div class="col-md-8">
                    <div class="input-group">
                       
                        <input id="bairro" name="bairro" placeholder="Bairro" class="form-control input-md" required="" type="text">
                    </div>
                </div>
            </div>
            <div class="form-group">
              <label class="col-md-2 control-label" for="estado">Estado <h11>*</h11></label>  
              <div class="col-md-8">
                  <div class="input-group">
                      
                      <input id="estado" name="estado" placeholder="estado" class="form-control input-md" required="" type="text">
                  </div>
              </div>
          </div>
          <div class="form-group">
            <label class="col-md-2 control-label" for="cidade">Cidade <h11>*</h11></label>  
            <div class="col-md-8">
                <div class="input-group">
                    <input id="cidade" name="cidade" placeholder="cidade" class="form-control input-md" required="" type="text">
                </div>
            </div>
        </div>
        <div class="form-group">
          <label class="col-md-2 control-label" for="ponto_de_referencia">Ponto de referência <h11>*</h11></label>  
          <div class="col-md-8">
              <div class="input-group">
                  <input id="ponto_de_referencia" name="pontoDeReferencia" placeholder="Ponto de referência" class="form-control input-md" required="" type="text">
              </div>
          </div>
      </div>
            
            <!-- Button (Double) -->
            <div class="form-group">
              <label class="col-md-2 control-label" for="Cadastrar"></label>
              <div class="col-md-8 botao">
                <button id="Cadastrar" name="Cadastrar" class="btn btn-success" type="Submit">Cadastrar</button>
                <button id="Cancelar" name="Cancelar" class="btn btn-danger" type="Reset">Cancelar</button>
              </div>
            </div>
            
            </fieldset>
            </form>
    </main>
    
</body>
</html>