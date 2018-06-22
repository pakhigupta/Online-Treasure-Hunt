<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<link rel="stylesheet" href="res/Site.css">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style>
            #content {
                height: 600px;
                width: 100%;
                background-image: url("images/background2.jpg");
               
            }
            #logo {
                height: 170px;
                width: 170px;
                margin-top: 50px;
                margin-left: 50px;
                float: left;
            }
            #leaderboard {
                caption-side: top;
                align-content: stretch;
                width: 500px;
                height: 300px;
                border: 2px solid black;
                padding: 2%;
                align-content: center;
            }
            
            #table {
                margin-top: 80px;
                margin-right: 40px;
                width: 100px;
                height: 300px;
                
            }
        </style>
    </head>
    <body>
        <div id="content">
            <div style="width: 60%; height: 600px; float: left;">
                <img src="images/sherlocked.png" id="logo" alt="Logo">
                <h2 class="grey" style="float: right; margin-top: 120px; font-size: 40px;">Online Treasure Hunt</h2>
                <br>
                <br>
                <p style="font-family: cursive; font-size: 28px; margin-left: 50px; margin-top: 50px; float: left;"><b>
                    Come indulge yourself in a thrilling experience of a treasure hunt, but in a twisted way!.
                    The game consists of 10 levels, with increasing difficulty level at each step, where we give you no questions.
                    Search for the hints, if you can, and win the game!</b>
                </p>
            </div>
            <div style="width: 30%; float: right; margin-top: 230px;" id="table">
                 <p style="font-family: cursive; font-size: 35px; float: right; margin-top: 50px; float: right;">
                     Join us here!
                </p>
                <button style="float: right; font-size: 27px; padding: 1%;" ><a href="register.jsp">Register Here!</a></button>
            </div>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>