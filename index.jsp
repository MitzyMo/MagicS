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
    <label>Valor Inicial</label>
    <input type="number" name="valorI" ><br><br>
    <label>Tamaño</label>
    <input type="number" name="size" value="5"><br><br>
    <input type="submit" value="Enviar"> <br><br>
  </form>
  <hr><br><br>
  <jsp:useBean id="mysquare" scope="application" class="modelo.Magic"/>
  
  <table id="customers">

<c:forEach items="${mycurso.listado}" begin="0" end="${mycurso.listado.size()}" var="persona">
  <tr><td><c:out value="${persona.nombre}"/> </td>
  <td><c:out value="${persona.edad}"/> </td></tr>
 </c:forEach>
</table>


</body>
</html> 