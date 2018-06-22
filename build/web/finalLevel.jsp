<%@include file="play_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="res/w3.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>You Won!</title>
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
            <h1 style="font-family: sans-serif; font-size: 50px;" class="w3-text-dark-grey"><b>Looks like we have a Sherlock with us!</b></h1>
            <h2 style="font-size: 35px;">You won, <%= username %> </h2>
            <h2 style="font-size: 35px;">For now, that is all the levels we have. Stay Tuned for more Levels!</h2>
            <button style="padding-top: 2%; padding-bottom: 2%;"><a href="home.jsp" style="font-family: sans-serif; font-size: 27px;">Home</a></button>
        </div>
    </body>
</html>
