<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>.::Cadastro de Cliente::.</title>
</head>
<body>
	<form action="adicionaCliente" method="post">
		<table>
		
			<tr>
				<td>Nome do cliente:</td>
				<td><input type="text" name="cliente.nomeCliente"></td>

			</tr>
			<tr>
				<td>CPF:</td>
				<td><input type="text" name="cliente.cpf"></td>

			</tr>
			<tr>
				<td>Data de Nascimento:</td>
				<td><input type="text" name="cliente.dataNasc"></td>

			</tr>
			<tr>
				<td>Sexo:</td>
				<td><input type="text" name="cliente.sexo"></td>

			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" name="cliente.telefone"></td>

			</tr>
			
			<tr>
				<td><input type="submit" value="Salvar"></td>
				<td><input type="reset" value="Limpar"></td>
			</tr>
		</table>
	</form>
</body>
</html>