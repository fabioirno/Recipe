<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Descrizione dello chef</title>
    <body>
        <h1>Descrizione dello chef</h1>
        Nome: ${chef.name}<br><br> 
 		Votazione: ${chef.rating}<br><br>
 		<a href="../chefsListing">Back to Lista degli chef</a>
    </body>
</html>