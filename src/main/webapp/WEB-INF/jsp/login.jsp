<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <style>
            body {
              margin: 0;
              padding: 0;
              background-color: #ffffff;
              height: 100vh;
            }
        </style>
</head>
<body>
  <form id="login-form" class="form" action="/login" method="post">
      <div class="container">
         <c:if test="${not empty mensagem}">
             <div class="alert alert-danger">
                <strong>ERRO: </strong>${mensagem}
              </div>
         </c:if>
      </div>
         <div class="container">
             <h3 class="text-center text-info">Login</h3>
                 <div class="form-group">
                     <label for="email" class="text-info">E-mail:</label><br>
                     <input type="email" name="email" id="email" class="form-control">
                 </div>
                 <div class="form-group">
                     <label for="senha" class="text-info">Senha:</label><br>
                     <input type="password" name="senha" id="senha" class="form-control">
                 </div>
                 <div class="form-group">
                     <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                     <input type="submit" name="submit" class="btn btn-info btn-md" value="Entrar">
                 </div>
         </div>
  <hr>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</form>
</body>
</html>
