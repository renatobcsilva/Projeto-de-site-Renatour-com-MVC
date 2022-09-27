
<%@page import="java.sql.*,java.util.*"%>
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


	<%
	
    String value = request.getParameter("idVenda");
    int v=Integer.parseInt(value);
    Connection conn = null;
    PreparedStatement pst = null;
    try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:33", "renatour_db", "b3h4ppy");
        pst = conn.prepareStatement("delete from venda where idVenda = ?");
        pst.setInt(1,v);

        pst.executeUpdate();
      }catch(Exception e){
        System.out.print(e.getMessage());
    }finally{
        pst.close();
        conn.close();
    }

	%>
<p>id:<%=request.getParameter("idVenda") %></p>
</body>
</html>