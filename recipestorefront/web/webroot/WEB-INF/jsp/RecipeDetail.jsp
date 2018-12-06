<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Recipe Details</title>
    <body>
        <h1>Recipe Details</h1>
        Name: ${recipe.name}<br><br> 
 		Difficulty: ${recipe.difficulty}<br><br>
 		Rating: ${recipe.rating}<br><br>
 		Servings: ${recipe.servings}<br><br>
 		Time: ${recipe.time}<br><br>
        <a href="../recipes">Back to Recipes Listing</a>
    </body>
</html>