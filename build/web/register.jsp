<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<link rel="stylesheet" href="res/Site.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <div style="width: 60%; height: 400px; align-content: center; margin-top: 40px; align: center;">
            <fieldset class="w3-light-grey">
                <legend>Register Here!</legend>
                <form method="post" action="">
                    Username: <input type="text" name ="username" required><br>
                    Password: <input type="password" name="password" required><br>
                    Email   : <input type="email" name ="email" required><br>
                    <input type="submit" value="Login" name="submit">
                    <input type ="reset" value="Reset">
                </form>
                 <%
            if(request.getParameter("submit")!=null)
            {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String email = request.getParameter("email");
                String query = "insert into Login(username, password, email, questionNumber, lastPlayed) values('"+username+"','"+password+"','"+email+"',0,curdate())";
                int res = jdbc.DAOLayer.updateData(query);
                if(res==1) {
                    out.println("<h4>You're now registered and logged in!</h4>");
                    session.setAttribute("username", username);
                    response.sendRedirect("home.jsp");
                }
                else {
                    out.println("<h4>Username/Email already in use! Try again.</h4>");
                }
            }
        %>
            </fieldset>
        </div>
       
    </body>
</html>
<%@include file="footer.jsp" %>