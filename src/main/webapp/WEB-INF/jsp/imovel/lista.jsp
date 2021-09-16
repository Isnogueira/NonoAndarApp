<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE = html>
<html lang="pt-BR">
<head>
<title>Listagem de imoveis</title>
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
	<div class="container">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Informação!</strong> ${mensagem}
			</div>
		</c:if>
		<c:if test="${not empty imoveis}">
			<h4>Quantidade de imoveis cadastrados: ${imoveis.size()}</h4>
			<br>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Data do cadastro</th>
						<th>Endereço</th>
						<th>Valor de venda</th>
						<th>Valor de Aluguel</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="i" items="${imoveis}" varStatus="id">
						<tr>
							<td>${i.id}</td>
							<td>${i.dataAnuncio}</td>
							<td>${i.endereco}</td>
							<td>${i.valorVenda}</td>
							<td>${i.valorAluguel}</td>
							<td><a href="/imovel/${i.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty imoveis}">
			<h4>Não existem imóveis cadastrados!</h4>
		</c:if>
	</div>
	<br>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
