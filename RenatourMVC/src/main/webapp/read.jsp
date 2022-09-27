<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Relatório</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>


</head>
<body>

	<h2 class="mx-auto">Relatório de Vendas</h2>

	<%
	String id = request.getParameter("idVenda");
	String driverName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "renatour_db";
	String userId = "root";
	String password = "b3h4ppy";

	try {
		Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	%>

	<table class="table table-bordered table-success table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Telefone</th>
				<th>Cidade</th>
				<th>Estado</th>
				<th>CEP</th>
				<th>Núm. C. de Crédito</th>
				<th>Data da Ida</th>
				<th>Data de Retorno</th>
				<th>Pacote OZ</th>
				<th>Pacote NZ</th>
				<th>Perth</th>
				<th>Gold Coast</th>
				<th>Auckland</th>
				<th>Queenstown</th>
				<th>Data da Compra</th>

			</tr>
		</thead>
		<%
		try {
			connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
			statement = connection.createStatement();
			String sql = "SELECT * FROM venda";

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
		%>
		<tr>
			<td><%=resultSet.getInt("idVenda")%></td>
			<td><%=resultSet.getString("nomeCliente")%></td>
			<td><%=resultSet.getString("email")%></td>
			<td><%=resultSet.getString("telefone")%></td>
			<td><%=resultSet.getString("cidade")%></td>
			<td><%=resultSet.getString("estado")%></td>
			<td><%=resultSet.getString("cep")%></td>
			<td><%=resultSet.getString("numCC")%></td>
			<td><%=resultSet.getString("dataIda")%></td>
			<td><%=resultSet.getString("dataRet")%></td>
			<td><%=resultSet.getString("promoOZ")%></td>
			<td><%=resultSet.getString("promoNZ")%></td>
			<td><%=resultSet.getString("Perth")%></td>
			<td><%=resultSet.getString("GC")%></td>
			<td><%=resultSet.getString("Auckland")%></td>
			<td><%=resultSet.getString("Queenstown")%></td>
			<td><a href="Editar?id=<%=resultSet.getString("idVenda")%>"
				class="btn btn-secondary">Editar</a> <a
				href="delete.jsp?id=<%=resultSet.getString("idVenda")%>"
				onclick="return confirm('Deseja Excluir?')" class="btn btn-danger">Excluir</a></td>
		</tr>

		<%
		}

		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</table>
</body>
</html>