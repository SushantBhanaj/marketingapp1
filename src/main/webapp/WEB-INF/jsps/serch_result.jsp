<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>List All..</h3>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Action</th>
</tr>
 <c:forEach var = "leads" items="${leads}">
 <tr>
 <td>${leads.firstName}</td>
 <td>${leads.lastName}</td>
 <td>${leads.email}</td>
 <td>${leads.mobile}</td>
 <td><a href="delete?id=${lead.id}">delete</a>
 <a href="update?id=${lead.id}update">update</a>
 </td>
 
 </tr>
      </c:forEach>
</table>
</body>
</html>