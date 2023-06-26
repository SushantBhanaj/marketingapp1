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
<h2>Create Leads</h2>
<form action="saveLeado" method="post">
<pre>
First Name<input type="text" name="firstName" />
Last Name<input type="text" name="lastName" />
Email<input type="text" name="email" />
Mobile<input type="text" name="mobile" />
<input type="submit" value="save" />
</pre>
</form>
${msg}
</body>
</html>