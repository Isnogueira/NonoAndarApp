<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Index</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
<c:import url="/WEB-INF/jsp/menu.jsp"/>
        <div class="container">
           <h3>${mensagem}</h3>
           <h4>
                <a href="/gerente/lista">Gerentes cadastrados</a>
           </h4>

        </div>
        <br>
<c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>