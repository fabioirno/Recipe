<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Recipes Listing</title>
<body>
	<h1>Recipes Listing</h1>
	<ul>
		<c:forEach var="recipes" items="${recipes}">
			<li><a href="./recipes/${recipes.name}">${recipes.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>