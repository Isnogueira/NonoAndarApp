<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE = html>
<html lang="pt-BR">
<head>
<title>Listagem de usuarios</title>
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
	<div class="container">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Informação!</strong> ${mensagem}
			</div>
		</c:if>
		<c:if test="${not empty lista}">
			<h4>Quantidade de usuarios cadastrados: ${lista.size()}</h4>
			<br>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Gerentes</th>
						<c:if test="${user.admin}">
							<th></th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${lista}" varStatus="id">
						<tr>
							<td>${usuario.id}</td>
							<td>${usuario.nome}</td>
							<td>${usuario.email}</td>
							<td>${usuario.gerentes.size()}</td>
							<c:if test="${user.admin}">
								<td>
									<c:choose>
										<c:when test="${user.id != usuario.id}">
											<a href="/usuario/${usuario.id}/excluir">Excluir</a>
										</c:when>
									</c:choose>
								</td>
							</c:if>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty lista}">
			<h4>Não existem usuários cadastrados!</h4>
		</c:if>
	</div>
	<br>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>