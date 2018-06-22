<%@include file="header_secured.jsp" %>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="res/w3.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Play Portal</title>
        
    </head>
    <body align="center">
        <h2 style="margin-top: 50px">Hi <%= session.getAttribute("username")%>,</h2>
        <br>
        <table align="center">
        <%
            if(session.getAttribute("username")!=null) {
            String username=session.getAttribute("username").toString();
            String query = "select * from Login where username='"+ username +"'";
            ResultSet rs = jdbc.DAOLayer.selectData(query);
            if(rs.next()){
                %>
                <tr align="center">
                    <th style="font-size: 20px; text-align: right; padding-right: 10px;">USERNAME:</th>
                    <td style="font-size: 20px; text-align: left;"><%= rs.getString("username") %></td>
                </tr>
                <tr>
                    <th style="font-size: 20px; text-align: right; padding-right: 10px;">EMAIL:</th>
                    <td style="font-size: 20px; text-align: left;"><%= rs.getString("email") %></td>
                </tr>
                <tr>
                    <th style="font-size: 20px; text-align: right;padding-right: 10px;">CURRENT LEVEL:</th>
                    <td style="font-size: 20px; text-align: left;"><%= rs.getString("questionNumber") %></td>
                </tr>
                <tr>
                    <th style="font-size: 20px; text-align: right;padding-right: 10px;">LAST LOGIN:</th>
                    <td style="font-size: 20px; text-align: left; "><%= rs.getString("lastPlayed") %></td>
                </tr>
                <%
            }
            
        %>
        </table>
        <br>
        <%
            String questionNumber=rs.getString("questionNumber").toString();
            String query1="select url from QuestionUrl where questionNumber="+questionNumber;
            ResultSet rs1= jdbc.DAOLayer.selectData(query1);
            rs1.next();
            String url = rs1.getString(1);
            
        %>
        <button style="padding:1%; margin-bottom: 40px;"><a href="<%= url %>" style="font-family: sans-serif; font-size: 20 px;">Resume Game</a></button>
        <% } %>
    </body>
</html>
<%@include  file="footer.jsp" %>
