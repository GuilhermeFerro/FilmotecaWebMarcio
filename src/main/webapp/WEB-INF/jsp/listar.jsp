<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
<table class="search">
    <tr>
        <th>Titulo</th>
        <th>Descricao</th>
    </tr>
	<c:forEach var="filme" items="${filmes}">
    <tr>
       <td>${filme.titulo}</td>
        <td>${filme.diretor}</td> 
    </tr>
	</c:forEach>
</table>	
	
	
</body>

</html>