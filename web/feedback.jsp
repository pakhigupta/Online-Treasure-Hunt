<%@include file="header_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
    </head>
    <body align="center">
        
        <h2>We value your feedback.<br>Thankyou for helping us improve.</h2><br><hr>
        <form action="feedback.jsp">
            <fieldset>
                <legend>Feedback Form</legend>
                <b>Name:</b> <input type="text" name="name" required><br><br>
                <b>Gender: </b><div><input type="radio" name="gender" value="male" checked> Male
                        <input type="radio" name="gender" value="female"> Female
                        <input type="radio" name="gender" value="other"> Other</div>
                <br><b>How satisfied were you with our following features:</b><br><br>
                <b>Website: </b><div><input type="radio" name="website" value="satified" checked>Satisfied
                         <input type="radio" name="website" value="okay" >Okay Okay!
                         <input type="radio" name="website" value="dissatified">Dissatisfied</div>
                <br>
                <b>Difficulty level:</b><div><input type="radio" name="pack" value="satified" checked>Satisfied
                         <input type="radio" name="pack" value="okay" >Okay Okay!
                         <input type="radio" name="pack" value="dissatified" >Dissatisfied</div>
                         <br>
                <b>Hints:</b><div><input type="radio" name="ship" value="satified" checked>Satisfied
                         <input type="radio" name="ship" value="okay" >Okay Okay!
                         <input type="radio" name="ship" value="dissatified" >Dissatisfied</div>
                         <br>
                <b>Overall:</b> <div><input type="radio" name="overall" value="satified" checked>Satisfied
                         <input type="radio" name="overall" value="okay" >Okay Okay!
                         <input type="radio" name="overall" value="dissatified">Dissatisfied</div>
                <br>
                <input type="submit" name="submit"/>
            </fieldset>
        </form>
        <%
            if(request.getParameter("submit")!=null)
            {
                out.print("<h3>We recieved your feedback.<br>Thankyou for helping us to be better!</h3>");
            }
        %>
    </body>
</html>
<%@include file="footer.jsp" %>