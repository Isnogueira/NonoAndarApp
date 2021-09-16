<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Cadastro imobiliária</title>
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
<head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<br>
	<form action="/imobiliaria/incluir" method="post">
		<div class="container">
			<div class="form-group">
				<label for="sel1">Gerente</label> <select name="gerente.id"
					class="form-control" id="sel1">
					<c:forEach var="gerente" items="${gerentes}">
						<option value="${gerente.id}">${gerente.nome}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text"
					class="form-control" value="Primeira Imobiliaria" name="nome">
			</div>
		</div>
		<br>
		<div class="container">
			<label for="fone">Telefone:</label> <input type="number"
				class="form-control" value="789456" name="telefone">
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label>Imóveis:</label>
				<c:forEach var="i" items="${imoveis}">
					<div class="form-check">
						<label class="form-check-label"><input type="checkbox"
							name="imoveisId" value="${i.id}"> ${i.endereco}</label>
					</div>
				</c:forEach>

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