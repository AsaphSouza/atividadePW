<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="design.css">
		<title>Insert title here</title>
	</head>
	
	<body>
		<div>
			<form action="SalvarCadastro" method="POST">
				Nome: <input type="text" name="nome" placeHolder="seu nome"/><br/><br/>
				Idade: <input type="text" name="idade" placeHolder="sua idade"/><br/><br/>
				Data do último ciclo: <input type="date" name="data"><br><br/>
				
				<label> Ciclo: </label>
				<select name="tipoCiclo">
					<option value="regular">Regular</option>
					<option value="irregular">Irregular</option>
				 </select> 
				 
				 <br><br/>
				 
				 <h7 class="botoes">
				 	<input type="submit"  value=" Enviar " />
				 	<input type="reset"   value="Cancelar" />
				 </h7>
				 
			</form>
		</div>
	</body>
	
</html>