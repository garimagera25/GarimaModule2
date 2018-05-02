<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getBookYearRange.obj">
<table>
<tr><Td>Enter From Year :<input type="text" name="year1">
<tr><Td>Enter To Year :<input type="text" name="year2">
<tr><Td><input type="submit" value="Display Book List">
</table>
</form>

<c:if test="${bookList!=null}">
<table border="1">
<tr><th>Book ID <th> Title <th>Price <th>Pub Year </th></tr>
<c:forEach items="${bookList}" var="book">
<tr><td>${book.bookId}<td>${book.title}<td>${book.price} <td>${book.pubYear}
</c:forEach>
</table>
</c:if>



</body>
</html>