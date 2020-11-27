<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Playa Dorada</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"/>
<link href="<c:url value="/resources/styles/styles.css" />" rel="stylesheet" type="text/css">
</head>
<body>
	<header class="encabezado container mt-4">
		<h1 class=>Fraccionamiento Playa Dorada</h1>
		<nav>
			<a class="mr-4" href="propiedades/idRol=${idUsuario}">Mis propiedades</a>
			<a class="mr-4">Memos</a>
			<a >Amenidades</a>
		</nav>
	</header>
	<section class="container mt-2">
		<h2>Avisos</h2>
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">Aviso<th />
					<th scope="col">Fecha del aviso<th />
				<tr />
			</thead>
			<tbody>
				<c:forEach items="${avisos}" var="aviso">
					<tr>
						<td>${aviso.mensajeAviso}<td />
						<td>${aviso.fechaAviso}<td />
					<tr />
				</c:forEach>
			</tbody>
		</table>
	</section>		
</body>
</html>