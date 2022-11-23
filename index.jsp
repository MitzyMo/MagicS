<%@page import="modelo.CuadroMagico"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<h1> Ingrese datos del cuadro </h1>
<h2> Recuerde solo números impares</h2>
  <form method="get" action="ServletCuadro" >
    Tamaño:
    <select name="tamano">
      <option value="3">3</option>
      <option value="5">5</option>
      <option value="7">7</option>
      <option value="9">9</option>
      <option value="11">11</option>
      <option value="13">13</option>
      <option value="15">15</option>
      <option value="17">17</option>
    </select><br>
    Número inicial: <input type="number" name="numIni" value="1"><br>
    <input type="submit" value="Enviar"> <br>
  </form>
 <table id="customers">
<br><br>
  <c:forEach items="${requestScope.matriz}" var="i">
    <tr>
    <c:forEach items="${i}" varStatus = "loop" var="j">  
      <td><c:out value="${j}"/></td>  
      </c:forEach>
    </tr>
    </c:forEach>
</table>
</body>
</html> 