
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="res/w3.css">
        <style>
            .menu {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: darkgrey;
                
                font-weight: bold;
                font-size: 18px;
            }

                

            li a {
                font-family: cursive;
                display: block;
                color: #4d4d4d;
                text-align: center;
                padding: 20px;
                text-decoration: none;
            }

            li a:hover {
                background-color: #111111;
            }

            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Treasure Hunt</title>
    </head>
    <body>
        <div>
            <%
                if(session.getAttribute("username")==null)
                { 
                    String message ="You need to first login!";
                    request.setAttribute("message", message);
                    response.sendRedirect("login.jsp");
                }
            %>
        </div>
        <div>
            <ul class="menu">
                
                <% if (session.getAttribute("username")!=null) {%>
                <li style="float: right;"><a href="logout.jsp">Logout</a></li> <% }
                  else { %>
                <li style="float: right;"><a href="login.jsp">Login</a></li> <% } %>
                <li style="float: right;"><a href="rules.jsp">Rules</a></li>
                <li style="float: right;"><a href="play.jsp">Play</a></li>
                <li style="float: right;"><a href="home.jsp">Home</a></li>
               
                <% if(session.getAttribute("username")!=null) {%>
                <%//check if already logged in%>
                <li style="float: left;margin-left: 20px;"><h2>Welcome <%= session.getAttribute("username") %></h2></li>
                <% }
                else { %>
                <li style="float: left;margin-left: 20px;"><h2>Welcome Guest User</h2></li> <% } %>
                
            </ul>
        </div>
    </body>
</html>
