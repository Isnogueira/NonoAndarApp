<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/app">NonoAndarApp</a>
        </div>
         <div class="collapse navbar-collapse" id="myNavbar">
           <ul class="nav navbar-nav navbar">
              <c:if test="${not empty user}">
                <li><a href="/usuario/lista">Usuários</a></li>
                <li><a href="/gerente/lista">Gerentes</a></li>
                <li><a href="/apartamento/lista">Apartamentos</a></li>
                <li><a href="/casa/lista">Casas</a></li>
                <li><a href="/escritorio/lista">Escritórios</a></li>
                <li><a href="/imobiliaria/lista">Imobiliárias</a></li>
                <li><a href="/imovel/lista">Imóveis</a></li>
              </c:if>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            </c:if>
           <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span>Logout ${user.nome}</a></li>
          </c:if>
          </ul>
        </div>
      </div>
    </nav>
