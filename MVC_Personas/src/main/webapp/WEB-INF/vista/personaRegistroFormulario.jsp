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

	<form:form action="procesarFormulario" modelAttribute="persona">
	
		<strong>Nombre: </strong><form:input path="nombre"/>
		<form:errors path="nombre" style="color:red"/> 
	
		<br><br><br>
		
		<strong>Apellidos: </strong><form:input path="apellidos"/>
		<form:errors path="apellidos" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Dni: </strong><form:input path="dni"/>
		<form:errors path="dni" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Edad: </strong><form:input path="edad"/>
		<form:errors path="edad" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Telefono: </strong><form:input path="telefono"/>
		<form:errors path="telefono" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Email: </strong><form:input path="email"/>
		<form:errors path="email" style="color:red"/> 
		
		<br><br><br>
		
		<strong>Ciudad:</strong> 	
		Madrid<form:radiobutton path="ciudad" value="Madrid"/>
		Barcelona<form:radiobutton path="ciudad" value="Barcelona"/>
		Sevilla<form:radiobutton path="ciudad" value="Sevilla"/>
		Galicia<form:radiobutton path="ciudad" value="Galicia"/>
		
		<br><br><br>
		
		<strong>Idioma:</strong>
		Ingles<form:checkbox path="idioma" value="Ingles"/>
		Frances<form:checkbox path="idioma" value="Frances"/>
		
		<br><br><br>
		
		<strong>Codigo Postal: </strong><form:input path="cpostal"/>
		<form:errors path="cpostal" style="color:red"/> 
		
		<br><br><br>
		
		<input type="submit" value="Enviar">
	
	</form:form>

</body>
</html>