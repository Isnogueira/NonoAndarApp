<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>APP2021 - Cadastro</title>
    <!--<link rel="stylesheet" href="css/meuestilo.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form action="confirmacao.html" method="get">
    <div class="container">
        <h2>Cadastro</h2>
        <div class="form-group">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
        </div>
        <div class="form-group">
            <label for="email">E-mail:</label>
            <input type="email" class="form-control" id="email" placeholder="Entre com o email" name="email">
        </div>
        <div class="container">
            <h2>Curso</h2>
            <form>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="G" checked>Graduação
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="E">Especialização
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="M">Mestrado
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="D">Doutorado
                </label>
            </form>
        </div>
        <div class="container">
            <h2>Região</h2>
            <select class="form-control" id="regiao" name="regiao">
                <option>Nordeste</option>
                <option>Norte</option>
                <option>Sudeste</option>
                <option>Sul</option>
                <option>Centro-oeste</option>
            </select>
        </div>
        <div class="container">
            <h2>Disciplina</h2>
            <form>
                <div class="checkbox">
                    <label><input type="checkbox" value="Java" name="disciplina"> Java</label>
                </div>
                <div class="checkbox">
                    <label><input type="checkbox" value="Python" name="disciplina">Python</label>
                </div>
                <div class="checkbox disabled">
                    <label><input type="checkbox" value="JavaScript" name="disciplina">JavaScript</label>
                </div>
            </form>
        </div>
        <button type="submit" class="btn btn-default">Cadastrar</button>
    </div>
</form>
</body>
</html>