<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Dettaglio della ricetta</title>
    <body>
        <h1>Dettaglio della ricetta</h1>
        Name: ${recipe.name}<br><br> 
 		Difficulty: ${recipe.difficulty}<br><br>
 		Rating: ${recipe.rating}<br><br>
 		Servings: ${recipe.servings}<br><br>
 		Time: ${recipe.time}<br><br>
        <a href="../recipesListing">Back to Lista delle ricette</a>
    </body>
</html>