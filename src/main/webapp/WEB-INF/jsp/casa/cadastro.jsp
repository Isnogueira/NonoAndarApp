<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Cadastro de Imóvel</title>
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
	background-color: rgb(241, 248, 253);
	color: rgb(6, 25, 36);
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
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<form action="/casa/incluir" method="post">
		<div class="container">
			<div class="form-group">
				<label for="valorVenda">Valor de venda:</label> <input type="number"
					class="form-control" id="valorVenda"
					placeholder="Entre com o valor de venda" value="10000"
					name="valorVenda">
			</div>
		</div>
		<br>
		<div class="container">
			<div class="form-group">
				<label for="valorAluguel">Valor de aluguel:</label> <input
					type="number" class="form-control" id="valorAluguel"
					placeholder="Entre com o valor de aluguel" value="1000"
					name="valorAluguel">
			</div>
		</div>
		<br>
		<div class="container">
			<p>
				<b>O imóvel possui garagem?</b>
			</p>
			<label class="radio-inline"> <input type="radio"
				name="garagem" value="false" checked>Sim
			</label> <label class="radio-inline"> <input type="radio"
				name="suite" value="true">Não
			</label>
		</div>
		<br>
		<div class="container">
			<label for="vagas"></label>
			<P>
				<b>Selecione o número de andares:</b>
			</P>
			<select class="form-control" name="andares" id="andares">
				<option>0</option>
				<option select="selected">1</option>
				<option>2</option>
			</select>
		</div>
		<br>
		<div class="container">
			<p>
				<b>O imóvel possui quintal?</b>
			</p>
			<label class="radio-inline"> <input type="radio"
				name="quintal" value="true" checked>Sim
			</label> <label class="radio-inline"> <input type="radio"
				name="suite" value="false">Não
			</label>
		</div>
		<br>
		<div class="container">
			<button type="submit" class="btn btn-primary btn-lg btn-block"
				name="enviar">Enviar</button>
		</div>
	</form>
	<hr>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>