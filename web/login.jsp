<%@page import="java.sql.ResultSet"%>
<%@include file="header.jsp" %>
<link rel="stylesheet" href="res/Site.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <div style="width: 60%; height: 400px; align-content: center; margin-top: 40px; align: center;">
            <fieldset class="w3-light-grey">
                <legend>Login Here!</legend>
                <%
            if(request.getAttribute("message")!=null)
            {
                out.println("<h2>"+request.getAttribute("message")+"</h2>");
            }
        %>
                <form method="post" action="">
                    Username: <input type="text" name ="username" required><br>
                    Password: <input type="password" name="password" required><br>
                    <input type="submit" value="Login" name="submit">
                    <input type ="reset" value="Reset">
                </form>
                 <%
            if(request.getParameter("submit")!=null)
            {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String query = "select * from Login where username='"+username+"' and password='"+password+"'";
                ResultSet rs = jdbc.DAOLayer.selectData(query);
                if(rs.next()) {
                    String a = Character.toString(username.charAt(0)); 
                    username = a.toUpperCase() + username.substring(1);
                    session.setAttribute("username", username);
                    response.sendRedirect("home.jsp");
                    out.println("<h4>You're now logged in.</h4>");
                }
                else {
                    out.println("<h4>Invalid username or password!</h4>");
                }
            }
        %>
            </fieldset>
        </div>
       
    </body>
</html>
<%@include file="footer.jsp" %>