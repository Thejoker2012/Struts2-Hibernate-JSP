<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>.::Cadastro de Categoria::.</title>
</head>
<body>
	<form action="adicionaCategoria" method="post">
		<table>
			<tr>
				<td>Categoria: </td>
				<td><input type="text" name="categoria.nomeCategoria"></td>
			</tr>
			<tr>
				<td>Descrição: </td>
				<td><input type="text" name="categoria.descricao"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Salvar"></td>
				<td><input type="reset" value="Limpar"></td>
			</tr>
		</table>
	</form>
</body>
</html>