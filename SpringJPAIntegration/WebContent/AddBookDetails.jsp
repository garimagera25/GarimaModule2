<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Book Information Page </h2>
<sf:form action="insertBook.obj" modelAttribute="book">
<table>
<tr><Td>Enter Book Title : <sf:input path="title"/></Td></tr>

<tr><td>Select Author Name : <sf:select path="authorId">
<sf:option value="0">Select Author Name</sf:option>
<c:forEach  items="${authorList}" var="author">
<sf:option value="${author.authorId}">${author.authorName}</sf:option>
</c:forEach>

</sf:select></td></tr>
<tr><td>Enter Price : <sf:input path="price"/>
<tr><td>Enter Publication Year : <sf:input path="pubYear"/>
<tr><Td><input type="submit" value="add Book">
</table>

</sf:form>
</body>
</html>