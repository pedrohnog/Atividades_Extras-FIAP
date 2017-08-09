<!DOCTYPE html>
<%@page import="java.text.NumberFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Minha primeira página JSP</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<th width="100px">Valor</th>
				<th width="100px">Fatorial</th>
			</tr>
		<%
			int valor = 1;
			for (int i = 1; i <= 10; i++) {
		%>
			<tr>
				<td style="text-align: right">
					<%= i %>
				</td>
				<td style="text-align: right">
					<%= NumberFormat.getInstance().format(valor *= i) %>
				</td>
			</tr>
		<%
			}
		%>
		</table>
		
		<br />
		<br />
		
		<table border="1">
			<tr>
				<th width="100px">Valor</th>
				<th width="100px">Fatorial</th>
			</tr>
			<c:set var="valor" value="1" />
			<c:forEach begin="1" end="10" step="1" var="i">
				<tr>
					<td style="text-align: right">
						${i}
					</td>
					<td style="text-align: right">
						<c:set var="valor" value="${valor * i}" />
						${valor}
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>