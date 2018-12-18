<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Lista degli chef</title>
<body>
	<h1>Lista degli chef</h1>
	<ul>
		 <c:forEach var="chefs" items="${chefs}">
			<li><a href="./chefForName/${chefs.name}">${chefs.name}</a></li>
		</c:forEach> 
	</ul>
	<a href="../">Back to Home</a>
</body>
</html>