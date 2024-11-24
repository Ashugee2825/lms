<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
int isbn= Integer.parseInt(request.getParameter("isbn"));
Book b= new Book();
b.setIsbn(isbn);
BookDao d= new BookDao();
d.deleteBookData(b);
RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
rd.forward(request, response);

%>
</body>
</html>