<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Cadastro de Imóvel</title>
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
    <form action="/apartamento/incluir" method="post">
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
                    </ul>
                </div>
            </div>
        </nav>
        <br>
        <div class="container text-center">
            <p><b>Escolha o tipo de anúncio:</b></p>
            <label class="radio-inline">
                <input type="radio" name="tipoAquisicao" value="aluguel" checked>Aluguel
            </label>
            <label class="radio-inline">
                <input type="radio" name="tipoAquisicao" value="venda">Venda
            </label>
        </div>
        <br>
        <div class="container">
            <label for="endereco">Endereço:</label>
            <input type="text" class="form-control" id="endereco" placeholder="Entre com o endereço" value="Rua Paulo Gustavo 34/301" name="endereco">
        </div>
        <br>
        <div class="container">
            <label for="cidade">Cidade:</label>
            <input type="text" class="form-control" id="cidade" placeholder="Entre com a cidade" value="Niteroi" name="cidade">
        </div>
        <br>
        <div class="container">
            <label for="estado">Estado:</label>
            <input type="text" class="form-control" id="estado" placeholder="Entre com a estado" value="Rio de Janeiro" name="estado">
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
                    <option select="selected">1</option>
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
                    <option select="selected">1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>
            </div>
            <br>
            <div class="container">
                <div class="form-group">
                    <label for="valorVenda">Valor de venda:</label>
                    <input type="number" class="form-control" id="valorVenda" placeholder="Entre com o valor de venda" value="10000" name="valorVenda">
                </div>
            </div>
            <br>
            <div class="container">
                <div class="form-group">
                 <label for="valorAluguel">Valor de aluguel:</label>
                    <input type="number" class="form-control" id="valorAluguel" placeholder="Entre com o valor de aluguel" value="1000" name="valorAluguel">
                </div>
            </div>
            <br>
            <div class="container">
                <div class="form-group">
                    <label for="metrosQuadrados">Metragem (M²):</label>
                    <input type="number" class="form-control" id="metrosQuadrados" placeholder="Entre com a metragem do imóvel" value="10" name="metrosQuadrados">
                </div>
            </div>
            <br>
            <div class="container">
                <div class="form-group">
                 <label for="valorMetroQuadrado">Valor por M²:</label>
                    <input type="number" class="form-control" id="valorMetroQuadrado" placeholder="Entre com o valor por metro quadrado" value="10" name="valorMetroQuadrado">
                </div>
            </div>
            <br>
            <div class="container">
                <p><b>O imóvel é mobiliado?</b></p>
                <label class="radio-inline">
                    <input type="radio" name="mobiliado" value="true" checked>Sim
                </label>
                <label class="radio-inline">
                    <input type="radio" name="mobiliado" value="false">Não
                </label>
            </div>
            <br>
             <div class="container">
                 <div class="form-group"> <label for="ValorCondomínio">Valor condomínio:</label>
                    <input type="number" class="form-control" id="Valorcondomínio" placeholder="Entre com o valor do condominio" value="1000" name="ValorCondomínio">
                </div>
             </div>
            <br>
            <div class="container">
                <p><b>O imóvel tem suíte?</b></p>
                <label class="radio-inline">
                    <input type="radio" name="suite" value="true" checked>Sim
                </label>
                <label class="radio-inline">
                    <input type="radio" name="suite" value="false">Não
                </label>
            </div>
            <br>
            <div class="container">
                <label for="vagas"></label>
                <P><b>Selecione o número de vagas:</b></P>
                <select class="form-control" name="vagas" id="vagas">
                    <option>0</option>
                    <option select="selected" >1</option>
                    <option>2</option>
                </select>
            </div>
            <br>
            <div class="container">
                <p><b>O imóvel é Pet-friendly?</b></p>
                <label class="radio-inline">
                    <input type="radio" name="petFriendly" value="true" checked>Sim
                </label>
                <label class="radio-inline">
                    <input type="radio" name="petFriendly" value="false">Não
                </label>
            </div>
            <br>
            <div class="container">
                <button type="submit" class="btn btn-primary btn-lg btn-block" name="enviar">Enviar</button>
            </div>
            <br>
            <footer class="container-fluid text-center">
                <p>&copy Ingrid Nogueira 2021</p>
            </footer>
        </form>
</body>
</html>