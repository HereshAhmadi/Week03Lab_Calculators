<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 26, 2021, 2:19:40 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="Arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
            
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
            <br>
        Result: <span name="result" value="">${result}</span>
        <br>
        <a href="Age">Age Calculator</a>
    </body>
</html>
