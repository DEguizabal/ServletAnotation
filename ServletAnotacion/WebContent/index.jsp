<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="txt/html; charset=UTF-8">
<title>Tarea LAboratorio 2 Login</title>
</head>
<body>
	<h1>Login</h1>
	<!-- En action especificamos a que mapping queremos que nos redirija -->
	<form action="AnotacionServlet" method="post">
		<label>Usuario: </label><input name="usuario" type="text">
		<label>Contrasena: </label><input name="contrasena" type="text">
		<input type="submit" value="Iniciar Sesion">
	</form>
</body>
</html>