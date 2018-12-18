<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Descrizione dello chef</title>
    <body>
        <h1>Descrizione dello chef</h1>
        Nome: ${chef.name}<br><br> 
 		Votazione: ${chef.rating}<br><br>
 		Ristorante: 
 			<c:forEach var="addresses" items="${chef.address}">
                ${addresses.companyName}
                <br>Via:${addresses.line1}
                <br>Numero:${addresses.line2}
                <br>Città:${addresses.town}
                <br>Email:${addresses.email}
                
              </c:forEach>
            <br><br>
 		<a href="../chefsListing">Back to Lista degli chef</a>
    </body>
</html>