<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body>
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>RG</th>
			<th>Data de nascimento</th>
			<th>E-mail</th>
		</tr>
		<s:iterator value="pessoas">
			<tr>
				<td><s:property value="nome" /></td>
				<td><s:property value="rg" /></td>
				<td><s:property value="dataNasc" /></td>
				<td><s:property value="email" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>