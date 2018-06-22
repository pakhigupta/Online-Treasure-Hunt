<%@page import="java.sql.ResultSet"%>
<link rel="stylesheet" href="res/w3.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="play_secured.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Level 0</title>
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
        <!-- Since you were smart enough to look here for hints, let us give you the answer for Level 0.
             'Sherlock'-->
        <img src="images/scan this code.jpeg" alt='' id="code" height="300px" width="300px">
        <br><form method="post"><br><input type="text" name ="ans" >
            <br><br><input type="submit" name="submit"></form>
            
        <%
            if(request.getParameter("submit")!=null)
            {
                String ans = request.getParameter("ans");
                ans=ans.toLowerCase();
                ans=ans.trim();
                String query  = "select answer from Answers where questionNumber = 0";
                ResultSet rs = jdbc.DAOLayer.selectData(query);
                rs.next();
                if(ans.equals(rs.getString(1)))
                {
                    out.print("<h3>Correct Answer!</h3>");
                    String username = session.getAttribute("username").toString();
                    String updateQuestion = "update Login set questionNumber = 1 where username = '"+username +"'";
                    jdbc.DAOLayer.updateData(updateQuestion);
                    session.setAttribute("url", "Ques1.jsp?What_is_the_time?");
                    response.sendRedirect("rightAnswer.jsp");
                }
                else
                {
                    out.print("<h3>Oops! Try Harder.</h3>");
                }
            }
        %>
    </body>
</html>
