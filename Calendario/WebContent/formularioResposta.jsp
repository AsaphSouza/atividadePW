<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="design.css">
		<title>respostas</title>
	</head>
	
	<body>
		<div>
		
		<p class="textoFormatado">
			<a href="formulario.jsp">Voltar</a>
				<%out.println("Nome: " + session.getAttribute("nome"));%><br/><br/>
		 		<%out.println("Idade: " + session.getAttribute("idade")); %><br/><br/>
		 		<%out.println("Tipo de Ciclo: " + session.getAttribute("tipoCiclo")); %><br/><br/>
		 		
		 		<%
		 		if(session.getAttribute("tipoCiclo").equals("irregular")){
		 			out.println("Não é possível calcular a data do seu próximo ciclo" +
		 			" menstrual porque ele é irregular!!!");
		 		}else{
		 			out.println("Data do proximo Ciclo: " + session.getAttribute("data"));	
		 		}
		 		%><br/><br/>
		 		
		</p>
		
		</div>
	</body>
	
</html>