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
	<script src="https://kit.fontawesome.com/fc40999f43.js" crossorigin="anonymous"></script>
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

img{
	width: 420px;
	height:305px;
}

body {
	margin: 0;
	padding: 0;
	background-color: #ffffff;
	height: 100vh;
}
.fundo{
	background-color:#ffffff !important;
	color: black !important;
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
<%--	<c:import url="/WEB-INF/jsp/menu.jsp" />--%>
<form action="/imovel/busca" method="get" class="container">
	<div class="form-row">
		<input type="text"
			   class="form-control " id="localizacao"
			   placeholder="Digite a localização do imóvel"
			   name="localizacao"
				style="width: 1000px">
		<div class="col-12 col-lg-8">
			<button type="submit" class="btn btn-primary" value="localizacao">
				Pesquisar
			</button>
		</div>

	</div>

</form>
	<div class=" container fundo">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Informação!</strong> ${mensagem}
			</div>
		</c:if>
		<c:if test="${not empty imoveis}">
<%--			<h4>Quantidade de imoveis cadastrados: ${imoveis.size()}</h4>--%>
			<br>
			<table class="table table-striped">
<%--				<thead>--%>
<%--					<tr>--%>
<%--						<th><p>Foto</p></th>--%>
<%--						<th><p>Data do cadastro</p></th>--%>
<%--						<th><p>Localização</p></th>--%>
<%--						<th><p>Valor de Aluguel</p></th>--%>
<%--						<th><p>Ações</p></th>--%>
<%--					</tr>--%>
<%--				</thead>--%>
				<tbody>
					<c:forEach var="i" items="${imoveis}" varStatus="id">
						<tr>
							<td ><a href=""><img src="https://images.pexels.com/photos/1115804/pexels-photo-1115804.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt=""></a><td>
							<td>
								<label>Data do anúncio</label>
								<p>${i.dataAnuncio}</p>
							</td>
							<td>
								<label>Localização</label>
								<p>${i.endereco}</p>
							</td>
							<td>
								<label>Valor do aluguel</label>
								<p>${i.valorAluguel}</p>
							</td>
							<c:if test="${not empty user}">
								<td><a href="/imovel/${i.id}/excluir">Excluir</a></td>
							</c:if>
							<c:if test="${empty user}">
								<td><a href="">Detalhes</a></td>
							</c:if>
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
<%--	<c:import url="/WEB-INF/jsp/footer.jsp" />--%>
</body>
</html>
