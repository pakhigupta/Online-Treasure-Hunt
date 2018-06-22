<%@include file="play_secured.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Level 4</title>
               <style>
            body {
                background-image: url("images/playwall.jpeg");
                
            }
            #code {
                margin-top: 100px;
            }
        </style>
    </head>
    <body align="center">
        <!-- Have you ever coded on MyCodeSchool? -->
        <img src="images/level4.jpeg" alt='He was hubmle, he was fool. Topcoder from the world honoured him with 625th room.' id="code" height="300px" width="300px">
        <br><form method="post"><br><input type="text" name ="ans" >
            <br><br><input type="submit" name="submit"></form>
        <%
            if(request.getParameter("submit")!=null)
            {
                String ans = request.getParameter("ans");
                ans=ans.toLowerCase();
                ans=ans.trim();
                String query  = "select answer from Answers where questionNumber = 4";
                ResultSet rs = jdbc.DAOLayer.selectData(query);
                rs.next();
                if(ans.equals(rs.getString(1)))
                {
                   // out.print("<h3>Correct Answer!</h3>");
                    String username = session.getAttribute("username").toString();
                    String updateQuestion = "update Login set questionNumber = 5 where username = '"+username +"'";
                    jdbc.DAOLayer.updateData(updateQuestion);
                    session.setAttribute("url", "finalLevel.jsp");
                    response.sendRedirect("finalLevel.jsp");
                }
                else
                {
                    out.print("<h3>Oops! Try Harder.</h3>");
                }
            }
        %>
    </body>
</html>
