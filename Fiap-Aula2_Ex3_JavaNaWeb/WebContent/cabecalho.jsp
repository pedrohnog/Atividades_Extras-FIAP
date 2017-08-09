<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="usuario" class="br.com.fiap.bean.UsuarioSessaoBean" scope="session" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Acessos usuário</title>
	</head>
	<body>
		Primeiro acesso: ${usuario.primeiroAcesso}
		<br />
		Último acesso: ${usuario.ultimoAcesso}
	</body>
</html>