<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>SCH</title>
	<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"/>
</head>
<body>
	<section class="container mt-4">
		<h2>Sistema de Captura de Horas</h2>
		<h5>Usuario o contrase�a incorrectos. Intente nuevamente.</h5>
		<form action="login" method="post">
			<label>Usuario</label>
			<input type="text" name="username" /> <br /> <br />
			
			<label>Contrase�a</label>
			<input type="password" name="password" /> <br /> <br />
			
			<input type="submit" value="Iniciar sesi�n" />
		</form>
	</section>
</body>
</html>
