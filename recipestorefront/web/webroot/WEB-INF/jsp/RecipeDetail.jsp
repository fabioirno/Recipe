<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Dettaglio della ricetta</title>
    <body>
        <h1>Dettaglio della ricetta</h1>
        Name: ${recipe.name}<br><br> 
 		Difficoltà: ${recipe.difficulty}<br><br>
 		Votazione: ${recipe.rating}<br><br>
 		Porzione: ${recipe.servings}<br><br>
 		Tempo: ${recipe.time}<br><br>
 		<table border="1" width="500" cellpadding="5" cellspacing="0">
 				<tr><td>Ingrediente</td><td>Quantità</td></tr>
 		       <c:forEach var="ingredient" items="${recipe.ingredients}">
                <tr><td>${ingredient.food.name}</td><td>${ingredient.quantity}</td></tr>
              </c:forEach>
        </table>
        <a href="../recipesListing">Back to Lista delle ricette</a>
    </body>
</html>