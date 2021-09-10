<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Nono Andar</title>
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
<head>
<body>
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <form action="/gerente/incluir" method="post">
        <div class="container text-center">
            <h2>Cadastro de Gerentes<h2>
        </div>
        <div class="container">
             <div class="form-group">
                <label for="email">E-mail:</label>
                <input type="email" class="form-control" name="email">
            </div>
        </div>
        <br>
         <div class="container">
             <div class="form-group">
                <label for="senha">Senha:</label>
                <input type="password" class="form-control" name="senha">
            </div>
         </div>
         <br>
         <div class="container">
             <button type="submit" class="btn btn-primary btn-lg btn-block" name="enviar">Enviar</button>
         </div>
         <br>
        <c:import url="/WEB-INF/jsp/footer.jsp"/>
  </form>
</body>
</html>