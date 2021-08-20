<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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
        .bg-1 {
           background-image: url("img/background.jpg");
            color: #ffffff;
          }
          .bg-2 {
            background-color: #474e5d;
            color: #ffffff;
          }
          .bg-3 {
            background-color: #ffffff;
            color: #555555;
          }
          .container-fluid {
            padding-top: 70px;
            padding-bottom: 70px;
          }
            footer {
                      background-color:rgb(6, 25, 36);
                      color: rgb(179, 217, 240);
                      padding: 15px;
                  }
    </style>
</head>
<body>
<div class="container-fluid bg-1 text-center">
   <h3>Quem sou eu?</h3>
   <img src="/img/eu.jpeg" class="img-circle" alt="eu" width="350" height="350">
   <h3>${user.nome} - Aluna de ADS  Bloco Java </h3>
 </div>
 <div class="container-fluid bg-2 text-center">
   <h3>Sobre o projeto</h3>
   <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
   <a href="#" class="btn btn-default btn-lg">Começar</a>
 </div>
 <div class="container-fluid bg-3 text-center">
   <h3>GitHub</h3>
       <a href="https://github.com/Isnogueira">https://github.com/Isnogueira</a>
 </div>
<footer class="container-fluid text-center">
       <p>&copy Ingrid Nogueira 2021</p>
</footer>
</body>
</html>
