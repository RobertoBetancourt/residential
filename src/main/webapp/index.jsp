<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Playa Dorada</title>
	<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"/>
</head>
<body>
	<section class="container mt-4">
		<h2>Fraccionamiento Playa Dorada</h2>
		<form action="login" method="post">
			<label>Usuario</label>
			<input type="text" name="username" /> <br /> <br />
			
			<label>Contraseña</label>
			<input type="password" name="password" /> <br /> <br />
			
			<input type="submit" value="Iniciar sesión" />
		</form>
	</section>
</body>
</html>
