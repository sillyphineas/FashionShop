<%-- 
    Document   : RegisterSuccess
    Created on : Oct 19, 2024, 2:03:54 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=request.getAttribute("n")%>
        <h1>Username: <%=request.getAttribute("username")%></h1>
        <h1>Password: <%=request.getAttribute("password")%></h1>
    </body>
</html>
