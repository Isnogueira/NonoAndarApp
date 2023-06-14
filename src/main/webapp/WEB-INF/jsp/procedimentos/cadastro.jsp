<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Procedimentos</title>
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
	<c:set var="botao" value="" />

	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<br>
	<form action="/procedimento/incluir" method="post">
		<br>
			<div class="container">
				<div class="form-group">
					<label for="pets">Pet</label>
					<select class="form-control" name="pet" id="pets">
						<c:forEach var="p" items="${pets}">
						<option value="${p.id}">${p.nomePet}</option>
						</c:forEach>
					</select>
				</div>
			</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="tipo">Tipo</label>
				<input type="text" class="form-control" id="tipo"  name="tipo">
			</div>
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="data">data</label>
				<input type="date" class="form-control" id="data"  name="data">
			</div>
		</div>
		<div class="container">
			<div class="form-group">
				<label for="hora">Hora</label>
				<input type="text" class="form-control" id="hora"  name="hora">
			</div>
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="observacao">Observação</label>
				<input type="text" class="form-control" id="observacao"  name="observacao">
			</div>
		</div>
		<br>
		<div class="container">
		<button type="submit" ${botao} class="btn btn-primary btn-lg btn-block" name="enviar">
			Enviar
		</button>
		</div>
		<br>
		<c:import url="/WEB-INF/jsp/footer.jsp" />
	</form>
</body>
</html>