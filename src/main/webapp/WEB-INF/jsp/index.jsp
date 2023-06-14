<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Index</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
		background-color: #ffffff;
	}
	.jumbotron {
		background-color: #474e5d;
		color: #b1cdcd;
	}
	.bg-2 {
		background-color: #b1cdcd;
		color: #005ce6;
	}
	.bg-3 {
		background-color: #ffffff;
		color: #0047b3;
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
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp" />
<c:if test="${empty user}">
	<div class="jumbotron text-center">
		<br>
		<h1>Pet Care</h1>
		<p>Projeto de Bloco de Modelagem</p>
		<p>Desenvolvido por Ingrid Nogueira</p>
	</div>
</c:if>
<c:if test="${not empty user}">
	<div class="jumbotron text-center">
		<br>
		<h2>Seja bem vindo(a) ${user.nome}</h2>
	</div>
</c:if>

<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
