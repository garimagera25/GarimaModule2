<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="updateBook.obj" modelAttribute="book">
<table>
<tr><td>Book ID : <sf:input path="bookId" readonly="true"/>
<tr><Td>Book Title : <sf:input path="title"/></Td></tr>
<tr><Td>Author ID : <sf:input path="authorId" readonly="true"/> 
<tr><td>Price : <sf:input path="price"/>
<tr><td>Publication Year : <sf:input path="pubYear"/>
<tr><Td><input type="submit" value="Update Book">
</table>
</sf:form>

</body>
</html>