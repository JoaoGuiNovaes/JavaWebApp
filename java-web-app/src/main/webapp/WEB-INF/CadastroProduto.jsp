
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
        <a href="/usuario"><img src="Imagens/perfil.png" alt="user" id="user"></a>
    </header>
    <main>
        <form class="form-horizontal" method="post" action="CadastroProduto" enctype="multipart/form-data">
            <fieldset>
            <div class="panel panel-primary">
                <div class="panel-heading">Cadastro de Produto</div>
                
                <div class="panel-body">
            <div class="form-group">
            <div class="col-md-11 control-label">
                    <p class="help-block"><h11>*</h11> Campo Obrigatório </p>
            </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-2 control-label" for="categoria">Categoria <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="categoria" name="categoria" placeholder="Digite a categoria do produto" class="form-control input-md" required="" type="text">
              </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-2 control-label" for="nomeproduto">Nome do Produto <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="nomeproduto" name="nomeProduto" placeholder="Digite o nome do produto" class="form-control input-md" required="" type="text">
              </div>
            </div>

            <div class="form-group">
              <label class="col-md-2 control-label" for="nomeproduto">Ficha Técnica <h11>*</h11></label>  
              <div class="col-md-8">
              <input id="fichatecnica" name="fichaTecnica" placeholder="Digite a ficha técnica do produto" class="form-control input-md" required="" type="text">
              </div>
            </div>

            <div class="form-group">
                <label class="col-md-2 control-label" for="nomeproduto">Imagem do Produto <h11>*</h11></label>  
                <div class="col-md-8">
                <input id="imagem" name="imagem" placeholder="" class="form-control input-md" required="" type="file" accept="image/jpeg, image/jpg, image/png">
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-2 control-label" for="nomeproduto">Preço <h11>*</h11></label>  
                <div class="col-md-8">
                    <div class="input-group">
                        <span class="input-group-addon">R$</span>
                        <input id="preco" name="preco" placeholder="00,00" class="form-control input-md" required="" type="text" pattern="\d{1,3}(?:\.\d{3})*(?:,\d{2})?">
                    </div>
                    <p class="help-block">Formato esperado: 00,00</p>
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