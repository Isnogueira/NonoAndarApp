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
	background-color: #ffffff;
	color: #ffffff;
}

.bg-2 {
	background-color: #ffffff; !important;
	color: #005ce6;
}

.bg-3 {
	background-color: #ffffff;
	color: #0047b3;
}

.bg-4 {
	background-color: #b1cdcd;
	color: #ffffff;
}

.container-fluid {
	padding-top: 70px;
	padding-bottom: 70px;
	background-color: #ffffff; !important;
}
</style>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<c:if test="${empty user}">
		<div class="jumbotron text-center">
			<br>
			<h1>Nono Andar APP</h1>
			<p>Desenvolvido por Ingrid Nogueira</p>
		</div>
	</c:if>
	<c:if test="${not empty user}">
		<div class="jumbotron text-center">
			<br>
			<h2>Seja bem vindo(a) ${user.nome}</h2>
		</div>
	</c:if>
	<div class="container-fluid bg-2">
<%--		<div class="container text-center">--%>
<%--			<h3>Resumo do sistema</h3>--%>
<%--		</div>--%>
<%--		<br>--%>
		<div>
			<c:import url="/WEB-INF/jsp/imovel/lista.jsp" />
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaUsuario" items="${mapaUsuarios}">--%>
<%--					<li class="list-group-item">${mapaUsuario.key}<span--%>
<%--						class="badge">${mapaUsuario.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaGerente" items="${mapaGerentes}">--%>
<%--					<li class="list-group-item">${mapaGerente.key}<span--%>
<%--						class="badge">${mapaGerente.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaApto" items="${mapaAptos}">--%>
<%--					<li class="list-group-item">${mapaApto.key}<span class="badge">${mapaApto.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaCasa" items="${mapaCasas}">--%>
<%--					<li class="list-group-item">${mapaCasa.key}<span class="badge">${mapaCasa.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaEscritorio" items="${mapaEscritorios}">--%>
<%--					<li class="list-group-item">${mapaEscritorio.key}<span--%>
<%--						class="badge">${mapaEscritorio.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaImobiliaria" items="${mapaImobiliarias}">--%>
<%--					<li class="list-group-item">${mapaImobiliaria.key}<span--%>
<%--						class="badge">${mapaImobiliaria.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
<%--			<ul class="list-group">--%>
<%--				<c:forEach var="mapaImovel" items="${mapaImoveis}">--%>
<%--					<li class="list-group-item">${mapaImovel.key}<span--%>
<%--						class="badge">${mapaImovel.value}</span></li>--%>
<%--				</c:forEach>--%>
<%--			</ul>--%>
		</div>

	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
