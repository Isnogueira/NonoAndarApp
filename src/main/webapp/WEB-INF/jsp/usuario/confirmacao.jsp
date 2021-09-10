<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="ISO-8859-1">
    <title>confirmação de cadastro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

 <%
        String nome = (String)request.getAttribute("nomeUsuario");
   %>

    <div class="container">
       <h2> Usuario <%=nome%> cadastrado com sucesso!</h2>
        <a href="aluno">Voltar</a>
    </div>
</body>
</html>