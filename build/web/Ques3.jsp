<%@include file="play_secured.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- Neon -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Play</title>
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
        <!-- Silk -->
        <img src="images/level3 Green.jpeg" alt='Green; DNA' id="code" height="300px" width="300px">
        <br><form method="post"><br><input type="text" name ="ans" >
            <br><br><input type="submit" name="submit"></form>
        <%
            if(request.getParameter("submit")!=null)
            {
                String ans = request.getParameter("ans");
                ans=ans.toLowerCase();
                ans=ans.trim();
                String query  = "select answer from Answers where questionNumber = 3";
                ResultSet rs = jdbc.DAOLayer.selectData(query);
                rs.next();
                if(ans.equals(rs.getString(1)))
                {
                   // out.print("<h3>Correct Answer!</h3>");
                    String username = session.getAttribute("username").toString();
                    String updateQuestion = "update Login set questionNumber = 4 where username = '"+username +"'";
                    jdbc.DAOLayer.updateData(updateQuestion);
                    session.setAttribute("url", "Ques4.jsp");
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
