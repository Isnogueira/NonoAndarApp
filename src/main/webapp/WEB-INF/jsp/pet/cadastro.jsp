<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Pets</title>
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
	<c:set var="botao" value="" />

	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<br>
	<form action="/pet/incluir" method="post">
<
		<br>
		<div class="container">
			<div class="form-group">
				<label for="nomePet">Nome do Pet</label> <input type="text"
					class="form-control" id="nomePet"  name="nomePet">
			</div>
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="idade">Idade:</label> <input
					type="number" class="form-control" id="idade"
					name="idade">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="tipo">Tipo do pet:</label>
				<input type="text" class="form-control" id="tipo"  name="tipo">
			</div>
		</div>
		<div class="container">
			<p>Sexo:</p>
			<label class="radio-inline">
				<input type="radio" name="sexo" value="Macho">Macho
			</label>
			<label class="radio-inline">
				<input type="radio" name="sexo" value="Fêmea">Fêmea
		</label>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="raca">Raça:</label>
				<input type="text" class="form-control" id="raca"  name="raca">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="pelagem">Cor da pelagem:</label>
				<input type="text" class="form-control" id="pelagem"  name="pelagem">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="peso">Peso:</label> <input
					type="number" class="form-control" id="peso"
					name="peso">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="nomeDono">Nome do Dono</label>
				<input type="text" class="form-control" id="nomeDono"  name="nomeDono">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="telDono">Telefone do Dono</label>
				<input type="number" class="form-control" id="telDono"  name="telDono">
			</div>
		</div>
		<br>
		<div class="container d-flex justify-content-between">
			<button type="submit" ${botao}
					class="btn btn-primary btn-lg btn-block" name="enviar">Enviar</button>
		</div>
		<br>
		<c:import url="/WEB-INF/jsp/footer.jsp" />
	</form>
</body>
</html>