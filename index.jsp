<%@page import="modelo.Persona"%>
<%@page import="modelo.Curso"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>titulo</title>
<meta charset="utf-8">
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}
#customers tr:hover {background-color: #ddd;}
#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>


</head>
<body>
<h1> Datos de usuarios </h1>
  <form method="get" action="ServletUsuario" >
    nombre: <input type="text" name="nombre" ><br><br>
    edad: <input type="number" name="edad" value="0"><br><br>
    <input type="submit" value="Enviar"> <br><br>
  </form>
  <hr><br><br>
  <jsp:useBean id="mycurso" scope="application" class="modelo.Curso"/>
  
  <table id="customers">
<tr>
<th>Nombre</th>
<th>Edad</th>
</tr>
<c:forEach items="${mycurso.listado}" begin="0" end="${mycurso.listado.size()}" var="persona">
  <tr><td><c:out value="${persona.nombre}"/> </td>
  <td><c:out value="${persona.edad}"/> </td></tr>
 </c:forEach>
</table>

<%-- 
<br><br><hr><br><br>
  <p>Ejercicio Loop</p>

  <table id="customers">
    <tr>
    <th>#1</th>
    <th>#2</th>
    </tr>
   <c:forEach var="i" begin="0" end="5"  >
    <tr><td><c:out value="${i}"/></td>
    <c:forEach var="i" begin="0" end="5"> 
      <td><c:out value=" ${i}"/></td></tr>
    </c:forEach>
 </c:forEach>
</table>
--%>

</body>
</html> 