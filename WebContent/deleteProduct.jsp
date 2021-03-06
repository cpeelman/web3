<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta charset="UTF-8">
<title>Delete Product</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="${color}">
	<div id="container">
		<%@include file="header.jspf"%>
		<jsp:include page="title.jsp">
			<jsp:param name="title" value="Delete product" />
		</jsp:include>

		<main>
		<p>Are you sure you want to remove ${name}?</p>
		<form method="POST"
			action="Controller?action=DeleteProduct&productId=${productId}">
			<input type="submit" value="OK">
			<a href="Controller?action=OverviewProducts" class="button">Cancel</a>
		</form>

		</main>
		<footer> &copy; Webontwikkeling 3, UC Leuven-Limburg </footer>
	</div>
</body>
</html>
