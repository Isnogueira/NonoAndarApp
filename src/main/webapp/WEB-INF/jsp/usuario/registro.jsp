<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Registrar</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
.navbar {
	padding-top: 15px;
	padding-bottom: 15px;
	border: 0;
	border-radius: 0;
	margin-bottom: 0;
	font-size: 12px;
	letter-spacing: 5px;
}

.navbar-nav li a:hover {
	color: #1abc9c !important;
}

body {
	margin: 0;
	padding: 0;
	background-color: #ffffff;
	height: 100vh;
}

footer {
	background-color: rgb(6, 25, 36);
	color: rgb(179, 217, 240);
	padding: 15px;
}

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
</style>
</head>
</body>
<c:import url="/WEB-INF/jsp/menu.jsp" />
<div class="container">
	<c:if test="${not empty mensagem}">
	<div class="alert alert-danger">
		<strong>ERRO: </strong>${mensagem}
	</div>
</c:if>
</div>		
<div class="container">	
	<h3 class="text-center text-info">Registrar</h3>
	<form action="/cep" class="form-inline" method="post">	
		<div class="form-group">
			<label for="cep" class="text-info">CEP</label><br> <input
			type="text" name="cep" id="cep" class="form-control">
			<button type="submit" name="submit"
				class="btn btn-primary">Buscar</button>
		</div>
	</form>
	<form action="/usuario" method="post">	
		<div class="form-group">
			<label for="nome" class="text-info">Nome</label><br> <input
				type="text" name="nome" id="nome" class="form-control">
		</div>
		<c:import url="/WEB-INF/jsp/endereco.jsp" />
		<hr>
		<div class="form-group">
			<label for="email" class="text-info">E-mail</label><br> <input
				type="email" name="email" id="email" class="form-control">
		</div>
		<div class="form-group">
			<label for="senha" class="text-info">Senha</label><br> <input
				type="password" name="senha" id="senha" class="form-control">
		</div>
		<br>
		<div class="form-group">
			<input type="submit" name="submit"
				class="btn btn-primary btn-lg btn-block" value="Enviar">
		</div>
	</form>>	
</div>
<br>

<hr>
<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
