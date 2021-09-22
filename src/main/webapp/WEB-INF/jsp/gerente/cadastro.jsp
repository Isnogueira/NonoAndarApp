<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

.bg-2 {
	background-color: #474e5d;
	color: #ffffff;
}

.bg-3 {
	background-color: #ffffff;
	color: #555555;
}

.bg-4 {
	background-color: #1a8cff;
	color: #ffffff;
}

.container-fluid {
	padding-top: 70px;
	padding-bottom: 70px;
}
</style>
<head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<br>
	<form action="/gerente/incluir" method="post">
		<div class="container">
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text"
					class="form-control" name="nome">
			</div>
		</div>
		<br>
		<div class="container">
			<label for="fone">Whatsapp:</label> <input type="number"
				class="form-control" name="telefone">
		</div>
		<hr>
		<div class="container">
			<div class="form-group">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" name="email">
			</div>
		</div>
		<br>
		<div class="container">
			<button type="submit" class="btn btn-primary btn-lg btn-block"
				name="enviar">Enviar</button>
		</div>
		<br>
		<c:import url="/WEB-INF/jsp/footer.jsp" />
	</form>
</body>
</html>