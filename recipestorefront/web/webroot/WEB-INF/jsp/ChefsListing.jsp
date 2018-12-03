<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Chefs Listing</title>
<body>
	<h1>Chefs Listing</h1>
	<ul>
		<c:forEach var="chefs" items="${chefs}">
			<li><a href="./chefs/${chefs.name}">${chefs.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>