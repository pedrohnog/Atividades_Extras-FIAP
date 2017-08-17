<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><sx:head /></head>
<body>
	<s:form action="/cadastrar" namespace="/pessoa" method="post" enctype="multipart/form-data">
		<s:textfield name="pessoa.nome" label="Nome" />
		<s:textfield name="pessoa.rg" label="RG"/>
		<sx:datetimepicker name="pessoa.dataNasc" label="Data de Nascimento" displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}" />
		<s:textfield name="pessoa.email" label="E-mail"/>
		<s:submit value="Cadastrar" />
	</s:form>
	<s:form action="/listar" namespace="/lista" method="post" enctype="multipart/form-data">
		<s:submit value="Listar" />
	</s:form>
</body>