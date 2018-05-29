<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Tourism</title>
<link rel="stylesheet" href="css/sample.css">
</head>
<body>
	<header role="banner"> <img alt="Toscane"
		src="images/toscaneRibbon.jpg"> </header>
	<main> <article>
	<h1>Login</h1>
	</article>

	<form action="Controller?action=setlanguage" method="POST">
		<label>Choose your language</label> 
		<select name="language">
			<c:forEach var="language" items="${languages}">
				<option value="${language.code}">${language.description}</option>
			</c:forEach>
		</select>
		<button type="submit">Send</button>
	</form>
	<p>
		<a href="Controller?action=checklanguage">Check language</a>
	</p>

	</main>

</body>
</html>