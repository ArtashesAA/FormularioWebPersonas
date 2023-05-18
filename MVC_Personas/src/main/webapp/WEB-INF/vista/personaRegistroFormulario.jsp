<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registro</title>

</head>

<body>

	<h1 align='center' >Formulario de Registro</h1><br>
	
	<form:form action="procesarFormulario" modelAttribute="persona" style='background-color:lime; width:500px; height:600px; padding:50px; border-radius:10px; margin:0px auto;'>
		<strong>Nombre*: </strong><form:input path="nombre"/>
		<form:errors path="nombre" style="color:red" />
	
		<br><br><br>
		
		<strong>Apellidos*: </strong><form:input path="apellidos"/>
		<form:errors path="apellidos" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Dni*: </strong><form:input path="dni"/>
		<form:errors path="dni" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Edad*: </strong><form:input path="edad"/>
		<form:errors path="edad" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Telefono*: </strong><form:input path="telefono"/>
		<form:errors path="telefono" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Email (opcional): </strong><form:input path="email"/>
		<form:errors path="email" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Ciudad*:</strong> 	
		<select name="ciudad" id="lang">
	        <option value="Madrid">Madrid</option>
	        <option value="Barcelona">Barcelona</option>
	        <option value="Sevilla">Sevilla</option>
	        <option value="Valencia">Valencia</option>
	        <option value="Málaga">Málaga</option>
	        <option value="Galicia">Galicia</option>
        </select>
		
		<br><br><br>
		
		<strong>Idioma (opcional):</strong>
		Ingles<form:checkbox path="idioma" value="Ingles"/>
		Frances<form:checkbox path="idioma" value="Frances"/>
		
		<br><br><br>
		
		<strong>Codigo Postal (opcional): </strong><form:input path="cpostal"/>
		<form:errors path="cpostal" style="color:red"/> 
		
		<br><br><br>
		
		<input type="submit" value="Enviar">
	</form:form>


</body>
</html>