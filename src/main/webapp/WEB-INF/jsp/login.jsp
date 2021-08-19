<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <!--<link rel="stylesheet" href="css/meuestilo.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

    <form action="/login" method="post">
        <div class="container">

        <c:if test="${not empty mensagem}">
             <div class="alert alert-danger">
                <strong>ERRO: </strong>${mensagem}
              </div>
        </c:if>
            <h2>Login</h2>
            <div class="form-group">
                <label for="email">E-mail:</label>
                <input type="email" class="form-control" value="ingrid@gmail.com" id="email" placeholder="Email" name="email">
            </div>
            <div class="form-group">
                <label for="senha">Senha</label>
                <input type="password" class="form-control" value="ingrid@gmail.com" id="senha" placeholder="Senha" name="senha">
            </div>
            <br>
            <div class="button">
                <button type="submit" class="btn btn-default">Entrar</button>
            </div>
        </div>
    </form>
</body>
</html>
