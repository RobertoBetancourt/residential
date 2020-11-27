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
		<h1>Fraccionamiento Playa Dorada</h1>
		<nav>
			<a class="mr-4" href="avisos">Avisos</a>
			<a class="mr-4">Memos</a>
			<a >Amenidades</a>
		</nav>
	</header>
	<section class="container mt-3">
		<h2>Mis propiedades</h2>
		<h4 class="mt-4">Apartamentos</h4>	
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">Dirección<th />
					<th scope="col">Número de edificio<th />
					<th scope="col">Número de piso<th />
					<th scope="col">Número de apartamento<th />
					<th scope="col">Metros cuadrados<th />
				<tr />
			</thead>
			<tbody>
				<c:forEach items="${apartamentos}" var="apartamento">
					<tr>
						<td>${apartamento.direccion}<td />
						<td>${apartamento.numeroEdificio}<td />
						<td>${apartamento.numeroPiso}<td />
						<td>${apartamento.numeroApartamento}<td />
						<td>${apartamento.metrosCuadrados}<td />
					<tr />
				</c:forEach>
			</tbody>
		</table>
		
		<h4 class="mt-4">Casas</h4>	
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">Dirección<th />
					<th scope="col">Número de casa<th />
					<th scope="col">Metros cuadrados<th />
				<tr />
			</thead>
			<tbody>
				<c:forEach items="${casas}" var="casa">
					<tr>
						<td>${casa.direccion}<td />
						<td>${casa.numeroCasa}<td />
						<td>${casa.metrosCuadrados}<td />
					<tr />
				</c:forEach>
			</tbody>
		</table>
	</section>		
</body>
</html>