<%@ page import="br.edu.infnet.domain.model.Gerente"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE = html>
<html lang="pt-BR">
    <head>
       <title>Nono Andar</title>
           <meta charset="UTF-8">
           <meta http-equiv="X-UA-Compatible" content="IE=edge">
           <meta name="viewport" content="width=device-width, initial-scale=1.0">
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
           <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            <style>
                   .navbar {
                       background-color:rgb(6, 25, 36);
                       color: rgb(255, 255, 255);
                   }
                   body {
                       background-color: rgb(241, 248, 253);
                       color: rgb(6, 25, 36);
                   }
                   footer {
                       background-color:rgb(6, 25, 36);
                       color: rgb(179, 217, 240);
                       padding: 15px;
                   }
            </style>
    <head>
    <body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
        <%
            List<Gerente>gerentes = (List<Gerente>) request.getAttribute("lista");
            int qtde = gerentes.size();
       %>
        <div class="container">
            <hr>
            <form action="/gerente" method="get">
            <c:if test="${not empty lista}">
                <h3>Quantidade de gerentes cadastrados: <%=qtde%>
                    <button type="submit" class="btn btn-default btn-lg" name="tela" value="lista">Incluir</button>
                </h3>
                <form>
                <br>
                  <table class="table table-striped">
                    <thead>
                      <tr>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Whatsapp</th>
                        <th></th>
                      </tr>
                    </thead>
                    <tbody>
                        <%for(Gerente g : gerentes) {%>
                          <tr>
                            <td><%=g.getNome()%></td>
                            <td><%=g.getEmail()%></td>
                            <td><%=g.getTelefone()%></td>
                            <td><a href="#">Excluir</a></td>
                          </tr>
                          <%}%>
                    </tbody>
                 </table>
            </c:if>
             <c:if test="${empty lista}">
                <h4>
                    Não existem gerentes cadastrados! |
                    <a href="/gerente">Incluir</a>
                </h4>
             </c:if>
        </div>
        <br>
        <c:import url="/WEB-INF/jsp/footer.jsp"/>
    </body>
</html>
