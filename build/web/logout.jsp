
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <%
            String username = session.getAttribute("username").toString();
            String query1 = "update Login set lastPlayed=curdate() where username='"+username+"'";
            jdbc.DAOLayer.updateData(query1);
            session.setAttribute("username",null);
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
