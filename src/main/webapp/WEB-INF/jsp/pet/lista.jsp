<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE = html>
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
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<c:set var="botao" value="" />
<%--<form action="" method="get" class="container">--%>
<%--	<div class="form-row">--%>
<%--		<input type="text"--%>
<%--			   class="form-control " id="localizacao"--%>
<%--			   placeholder="Digite a localização do imóvel"--%>
<%--			   name="localizacao"--%>
<%--				style="width: 1000px">--%>
<%--		<div class="col-12 col-lg-8">--%>
<%--			<button type="submit" class="btn btn-primary" value="localizacao">--%>
<%--				Pesquisar--%>
<%--			</button>--%>
<%--		</div>--%>

<%--	</div>--%>

<%--</form>--%>
	<div class=" container fundo">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Informação!</strong> ${mensagem}
			</div>
		</c:if>
			<br>
			<table class="table table-striped">
				<tbody>
					<c:forEach var="p" items="${pets}" varStatus="id">
						<tr>
							<td>
								<label>Nome do pet</label>
								<p>${p.nomePet}</p>
							</td>
							<td>
								<label>Idade</label>
								<p>${p.idade}</p>
							</td>
							<td>
								<label>Tipo</label>
								<p>${p.tipo}</p>
							</td>
							<td>
								<label>Sexo</label>
								<p>${p.sexo}</p>
							</td>
							<td>
								<label>Peso</label>
								<p>${p.peso}</p>
							</td>
							<td>
								<label>Raça</label>
								<p>${p.raca}</p>
							</td>
							<td>
								<label>Pelagem</label>
								<p>${p.pelagem}</p>
							</td>
							<td>
								<label>Nome do dono</label>
								<p>${p.nomeDono}</p>
							</td><td>
							<label>Tel. Dono</label>
								<p>${p.telDono}</p>
							</td>
							<td>
								<label>Data</label>
								<p>${p.dataCadastro}</p>
							</td>
							<td>
								<label>Ações</label>
								<p><a href="/pet/${p.id}/excluir">Excluir</a></p>
							</td>
<%--							</c:if>--%>
<%--							<c:if test="${empty user}">--%>
<%--								<td><a href="">Detalhes</a></td>--%>
<%--							</c:if>--%>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		<c:if test="${empty pets}">
			<h4>Não existem pets cadastrados!</h4>
		</c:if>
	</div>
	<div class="container d-flex justify-content-between">
		<a type="button" ${botao} class="btn btn-primary btn-lg btn-block" href="/pet">Cadastrar Pet</a>
	</div>
	<br>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>
