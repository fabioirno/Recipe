<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Lista delle ricette</title>
<body>
	<h1>Lista delle ricette</h1>
	<ul>
		<c:forEach var="recipes" items="${recipes}">
			<li><a href="./recipeForName/${recipes.name}">${recipes.name}</a></li>
		</c:forEach>
	</ul>
	<a href="../">Back to Home</a>
</body>
</html>