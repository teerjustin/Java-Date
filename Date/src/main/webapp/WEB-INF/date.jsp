<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style ="color:blue;"> <c:out value = "${date}"/> </h1>
</body>
<script type="text/javascript">var str = "This is the date template"</script>
<script src = "js/app.js"></script>
</html>