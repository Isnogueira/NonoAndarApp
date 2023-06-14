<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE = html>
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
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class=" container">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Informação!</strong> ${mensagem}
			</div>
		</c:if>
		<br>
		<table class="table table-striped">
			<tbody>
			<c:forEach var="pd" items="${procedimentos}" varStatus="id">
				<tr>
					<td>
						<label>Nome do pet</label>
						<p>${pd.nomePet}</p>
					</td>
					<td>
						<label>Tipo</label>
						<p>${pd.tipo}</p>
					</td>
					<td>
						<label>Data</label>
						<p>${pd.data}</p>
					</td>
					<td>
						<label>Horário</label>
						<p>${pd.hora}</p>
					</td>
					<td>
						<label>Observação</label>
						<p>${pd.observacao}</p>
					</td>
					<td>
						<label>Ações</label>
						<p><a href="/procedimento/${pd.id}/excluir">Excluir</a></p>
					</td>
						<%--							</c:if>--%>
						<%--							<c:if test="${empty user}">--%>
						<%--								<td><a href="">Detalhes</a></td>--%>
						<%--							</c:if>--%>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<c:if test="${empty procedimentos}">
			<h4>Não existem procedimentos agendados!</h4>
		</c:if>
	</div>
	<div class="container d-flex justify-content-between">
		<a type="button" ${botao} class="btn btn-primary btn-lg btn-block" href="/procedimento">Agendar procedimento</a>
	</div>
	<br>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
