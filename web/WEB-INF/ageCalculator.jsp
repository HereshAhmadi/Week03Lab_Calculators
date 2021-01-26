<%-- 
    Document   : ageCalculator
    Created on : Jan 26, 2021, 2:17:32 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="Age">
            <label>Enter your age: </label>
            <input type="text" name="age" value=""></input>
            <br>
            <button name="submit" value="submit">Age next birthday</button>
            <br>
            <p>${message}</p>
        </form>
        
        <a href="Arithmetic">Arithmetic Calculator</a>
    </body>
</html>
