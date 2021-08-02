<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Cadastro de imóvel</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .navbar {
            background-color:rgb(6, 25, 36);
            color: rgb(255, 255, 255);
        }
        body {
            background-color: rgb(241, 248, 253);
            color: rgb(6, 25, 36);
        }
        footer {
            background-color:rgb(6, 25, 36);
            color: rgb(179, 217, 240);
            padding: 15px;
        }
    </style>
</head>
<body>
    <form action="/imovel/incluir" method="post">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Nono Andar</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <!--<li><a href="#">About</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Contact</a></li>-->
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="text-center">
            <h1>Anuncie seu imóvel</h1>
        </div>
        <br>
        <div class="container">
            <p><b>Escolha o tipo de anúncio:</b></p>
            <label class="radio-inline">
                <input type="radio" name="tipo" value="Aluguel" checked>Aluguel
            </label>
            <label class="radio-inline">
                <input type="radio" name="tipo" value="venda">Venda
            </label>
        </div>
        <br>
        <div class="container">
            <p><b>Escolha o tipo do imóvel:</b></p>
            <label class="radio-inline">
                <input type="radio" name="mobi" value="sim" checked>Casa
            </label>
            <label class="radio-inline">
                <input type="radio" name="mobi" value="venda">Apartamento
            </label>
            <label class="radio-inline">
                <input type="radio" name="mobi" value="venda">Escritório
            </label>
        </div>
        <br>
        <div class="container">
            <label for="endereco">Endereço:</label>
            <input type="text" class="form-control" id="endereco" placeholder="Entre com o endereço" name="endereco">
        </div>
        <br>
        <div class="container">
            <label for="cidade">Cidade:</label>
            <input type="text" class="form-control" id="cidade" placeholder="Entre com a cidade" name="cidade">
        </div>
        <br>
        <div class="container">
            <label for="estado">Estado:</label>
            <input type="text" class="form-control" id="estado" placeholder="Entre com a estado" name="estado">
        </div>
        <br>
        <!--<div class="container">
            <p>Data do anuncio</p>
        </div>-->
        <div class="form-group">
            <div class="container">
                <label for="quartos"></label>
                <p><b>Selcione o número de quartos:</b></p>
                <select class="form-control" name="quartos" id="quartos">
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>
            </div>
        </div>
            <div class="container">
                <label for="banheiros"></label>
                <P><b>Selecione o número de banheiros:</b> </P>
                <select class="form-control" name="banheiros" id="banheiros">
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>
            </div>
            <br>
            <div class="container">
                <div class="form-group">
                    <label for="metQuad">Metragem (M²):</label>
                    <input type="number" class="form-control" id="metQuad" placeholder="Entre com a metragem do imóvel" name="metQuad">
                </div>
            </div>
            <div class="container">
                <div class="form-group"> <label for="metQuadValor">Valor por M²:</label>
                    <input type="number" class="form-control" id="metQuadValor" placeholder="Entre com o valor por metro quadrado" name="metQuadValor">
                </div>
            </div>
            <br>w
            <div class="container">
                <p><b>O imóvel é mobiliado?</b></p>
                <label class="radio-inline">
                    <input type="radio" name="mobi" value="sim" checked>Sim
                </label>
                <label class="radio-inline">
                    <input type="radio" name="mobi" value="venda">Não
                </label>
            </div>
            <br>
            <div class="container">
                <button type="submit" class="btn btn-primary btn-lg btn-block" name="enviar">Enviar</button>
            </div>
            <br>
            <footer class="container-fluid text-center">
                <p>&copy Ingrid Nogueira 2021</p>
                <a href="https://github.com/Isnogueira">https://github.com/Isnogueira</a>
            </footer>
        </form>
</body>
</html>