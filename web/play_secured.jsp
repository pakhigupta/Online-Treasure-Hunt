
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
          <%
                if(session.getAttribute("username")==null)
                {
                    response.sendRedirect("login.jsp");
                    String message ="You need to first login!";
                    request.setAttribute("message", message);
                }
            %>
    </body>
</html>
