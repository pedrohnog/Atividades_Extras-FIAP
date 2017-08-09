<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="aluno" class="br.com.fiap.AlunoBean" scope="page">
	<jsp:setProperty name="aluno" property="*"/>
</jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Cadastro de Alunos</title>
	</head>
	<body>
		Olá <jsp:getProperty name="aluno" property="nome"/>
		<br/>
		${aluno.nome}
	</body>
</html>