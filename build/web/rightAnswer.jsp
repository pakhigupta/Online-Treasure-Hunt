<%@include file="play_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="res/w3.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Next Level</title>
        <style>
            body {
                background-image: url(images/playwall.jpeg);
            }
        </style>
    </head>
    <body align="center">
        <%
            String username = session.getAttribute("username").toString();
            String url = session.getAttribute("url").toString();
        %>
        <div style="margin-top: 200px;">
            <h1 style="font-family: sans-serif; font-size: 50px;" class="w3-text-dark-grey"><b>Congratulations!</b></h1>
            <h2 style="font-size: 35px;">You Got it right, <%= username %> </h2>
            <button style="padding:1%"><a href="<%= url %>" style="font-family: sans-serif; font-size: 27px;">Play Next Level</a></button>
            <button style="padding:1%"><a href="home.jsp" style="font-family: sans-serif; font-size: 27px;">Home</a></button>
            
        </div>
    </body>
</html>
